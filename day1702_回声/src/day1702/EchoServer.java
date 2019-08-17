package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 需求：回声服务：客户端发送到服务器的数据，原封不动的发回客户端
 */
public class EchoServer {
	public void launch() {
		new Thread() {// 匿名内部类
			public void run() {// 重写方法，多线程执行语句
				try {// 异常捕捉
					ServerSocket ss = new ServerSocket(8000);// 新建服务器，指定端口
					System.out.println("服务已在8000端口上启动");// 提示信息
					while (true) {// 循环执行
						System.out.println("等待下一个客户端连接");
						Socket s = ss.accept();// 循环等待
						System.out.println("客户端已连接");
						TongXinThread t = new TongXinThread(s);// 接收到连接时转到另一个线程对象
						t.start();// 通信线程对象开启
					}
				} catch (Exception e) {// 异常处理
					System.out.println("无法在8000端口上启动服务，或服务异常停止");// 提示信息
				}
			}
		}.start();// 匿名线程开启
	}

	class TongXinThread extends Thread {
		Socket s;// 定义收到的套接字流对象

		public TongXinThread(Socket s) {// 单参构造方法，传入指定套接字
			this.s = s;
		}

		public void run() {// 通信线程执行语句
			// 通信协议：流程和格式
			// UTF-8编码的字符串
			// 每段字符串末尾添加换行
			// BR-readLine()--ISR--网络输入流
			// PW-println()--OSW--网络输出流
			try {// 异常捕捉
				BufferedReader in = new BufferedReader(// 按行读取流
						new InputStreamReader(// 输入转码流
								s.getInputStream(), // 获取套接字输入流
								"UTF-8"));// 指定编码
				PrintWriter out = new PrintWriter(// 按行写出流
						new OutputStreamWriter(// 输出转码流
								s.getOutputStream(), // 获取套接字输出流
								"UTF-8"));// 指定编码
				String line;// 定义字符串保存一次读取的数据
				while ((line = in.readLine()) != null) {// 循环读取，判断是否读取完成
					out.println(line);// 输出一行读取到的数据
					out.flush();// 刷新输出
				}
			} catch (Exception e) {// 异常处理
			}
			System.out.println("一个客户端已断开");// 打印提示
		};
	}

	public static void main(String[] args) throws Exception {
		EchoServer s = new EchoServer();// 回声服务对象
		s.launch();// 对象启动方法
	}
}
