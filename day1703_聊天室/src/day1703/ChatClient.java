package day1703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatClient {
	private Socket s;// 网络套接字对象
	private BufferedReader in;// 输入流
	private PrintWriter out;// 输出流
	private String name;// 获取昵称
	private LinkedList<String> list = new LinkedList<>();// 保存聊天记录
	private boolean flag;// 输入模式开关

	public void launch() {// 客户端线程
		try {
			s = new Socket("176.202.1.68", 8000);// 连接指定服务器及端口
			// 输入流，按行读取，输入数据转码，获取套接字对象的输入流，按指定编码表进行转码
			in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
			// 输出流，按行输出，输出数据转码，获取套接字对象的输出流，按指定编码表进行转码
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
			// 处理昵称
			System.out.println("输入名字：");
			name = new Scanner(System.in).nextLine();// 获取输入的昵称
			out.println(name);// 输出昵称
			out.flush();// 刷新输出到服务器

			// 接收线程
			new Thread() {// 匿名内部类开启线程
				public void run() {// 线程执行代码
					receive();// 执行接收消息线程
				};
			}.start();// 开启线程
			// 输入线程
			Thread t1 = new Thread() {// 定义线程对象
				public void run() {
					input();// 执行输入消息线程
				};
			};
			// 打印线程
			Thread t2 = new Thread() {
				public void run() {
					print();// 执行打印消息线程
				};
			};
			t1.setDaemon(true);// 将指定线程设置为后台线程
			t2.setDaemon(true);
			t1.start();// 开启线程
			t2.start();

			System.out.println("输入聊天内容：");// 打印提示
		} catch (Exception e) {
			System.out.println("404 NOT FOUND");// 断开连接提示
			e.printStackTrace();// 断开连接后打印异常报告
		}
	}

	protected void print() {// 打印线程
		while (true) {// 循环执行
			synchronized (list) {// 加同步锁，确保消息记录集合中消息访问安全
				while (list.isEmpty() || flag) {// 判断消息集合中是否有消息，是否满足打印输出条件
					try {// 异常捕捉
						list.wait();// 线程进入等待区
					} catch (Exception e) {
					}
				}
				String msg = list.removeFirst();// 获取集合中存储的消息字符串
				System.out.println(msg);// 打印消息字符串到控制台
			}
		}
	}

	protected void input() {// 输入线程
		System.out.println("按回车输入聊天内容");
		while (true) {
			new Scanner(System.in).nextLine();
			flag = true;// 打开输入消息控制开关

			System.out.println("输入聊天内容：");
			String s = new Scanner(System.in).nextLine();// 获取输入的消息内容
			out.println(s);// 输出消息内容
			out.flush();// 刷新发送到服务器

			flag = false;// 关闭输入消息开关开关
			synchronized (list) {// 同步加锁，确保访问消息记录集合安全
				list.notifyAll();// 唤醒其他等待中的线程
			}
		}
	}

	protected void receive() {// 接收消息线程
		try {
			String line;// 定义字符串变量保存接收到的消息
			while ((line = in.readLine()) != null) {// 按行读取收到的消息
				synchronized (list) {// 同步加锁，保证访问消息记录集合安全
					list.add(line);// 将收到的消息字符串添加到消息记录集合中
					list.notifyAll();// 通知打印线程已经有数据可以打印了
				}
			}
		} catch (Exception e) {
		}
		System.out.println("已经与服务器断开连接");// 断开连接提示
	}

	public static void main(String[] args) {
		ChatClient c = new ChatClient();// 新建客户端对象
		c.launch();// 运行客户端主线程
	}
}
