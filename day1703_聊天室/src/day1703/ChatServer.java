package day1703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ChatServer {
	private ArrayList<TongXinThread> list = new ArrayList<>();// 聊天室成员列表集合

	public void launch() {
		new Thread() {// 匿名内部类
			public void run() {// 多线程执行代码
				try {// 异常捕捉
					ServerSocket ss = new ServerSocket(8000);// 新建服务器对象
					System.out.println("聊天室服务器已启动");
					while (true) {// 循环执行
						Socket s = ss.accept();// 循环接收客户端发来的请求
						TongXinThread t = new TongXinThread(s);// 新建客户端通信线程
						t.start();// 通信线程启动
					}
				} catch (Exception e) {
					System.out.println("404 NOT FOUND");// 断开连接提示
				}
			}
		}.start();
	}

	class TongXinThread extends Thread {
		Socket s;// 套接字对象
		BufferedReader in;// 按行读取流对象
		PrintWriter out;// 按行写出流对象
		private String name;// 昵称字符串

		public TongXinThread(Socket s) {// 单参构造方法，接入指定套接字对象
			this.s = s;
		}

		public void send(String msg) {// 发送消息方法，传入字符串消息
			out.println(msg);// 将接收到的字符串消息发送出去
			out.flush();// 刷新发送出去
		}

		public void sendAll(String msg) {// 全体发送消息
			synchronized (list) {// 加同步锁，保证信息安全
				for (TongXinThread t : list) {// 循环遍历
					t.send(msg);// 每个通信线程调用发送方法
				}
			}
		}

		public void run() {
			try {
				int i = 5000;// 设置变量
				s.setSoTimeout(i);// 设置超时

				// 前面不定义类型，是给成员变量赋值，如果定义了就是局部变量
				// 输入流 按行读取 按指定编码转码 获取套接字中的输入流 指定编码
				in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
				// 输出流 按行输出 按指定编码转码 获取套接字中的输出流 指定码表
				out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
				// 获得客户端的昵称
				this.name = in.readLine();
				// 把当前通信线程加入集合
				synchronized (list) {
					list.add(this);// 将当前对象加入聊天室
				}
				// 发送欢迎信息
				send("欢迎进入基情聊天室！");
				// 群发上线消息
				sendAll(name + "进入了聊天室，可以开始搞基了！当前搞基人数：" + list.size());

				String line;// 定义变量保存收到的消息字符串
				int count = 0;// 定义计数器变量，统计警告次数
				while (true) {// 循环执行
					try {
						line = in.readLine();// 读取收到的消息字符串
						if (line == null) {// 如果字符串为空则结束循环
							break;
						}
						count = 0;
					} catch (SocketTimeoutException e) {// 超时异常处理
						if (count == 3) {// 判断警告次数
							send("有人举报你挂机，你已被踢出基情聊天室！");// 发送提示消息
							s.close();// 关闭当前对象的连接
							break;
						}
						count++;// 计数器自增后，发送提示信息
						send("你已经" + i / 1000 + "秒没有聊天了，再不聊会被踢出聊天室！（" + count + "/3）");
						continue;// 继续下一次循环判断
					}
					sendAll(name + ":" + line);// 发送聊天消息字符串
				}

			} catch (Exception e) {
			}
			// 删除当前通信线程实例
			synchronized (list) {
				list.remove(this);// 删除当前对象
			}
			sendAll(name + "离开了聊天室！当前搞基人数：" + list.size());// 群发离线消息
		}
	}

	public static void main(String[] args) {
		ChatServer s = new ChatServer();// 新建服务器对象
		s.launch();// 对象调用方法开启服务器
	}
}
