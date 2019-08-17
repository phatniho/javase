package day1701;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 需求：新建服务器端
 */
public class Server1 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8000);// 新建服务器，指定端口
		System.out.println("服务器已在8000端口上启动");
		// 暂停等待客户端发起连接
		System.out.println("等待客户端连接");
		Socket s = ss.accept();// 服务器等待客户端连接
		System.out.println("客户端已连接");
		// 从插头对象，获取输入流和输出流
		InputStream in = s.getInputStream();// 获取输入流
		OutputStream out = s.getOutputStream();// 获取输出流
		// 通信协议：通信流程，数据格式，
		// 服务器端：接收"hello"
		// 发送"world"
		for (int i = 0; i < 5; i++) {// 循环读取接收到的数据
			char c = (char) in.read();// 接收字符
			System.out.print(c);// 打印字符
		}
		out.write("world".getBytes());// 将字符串返回给客户端
		out.flush();// 刷出内存缓存数据
		s.close();// 断开连接
		ss.close();// 停止服务，释放端口
	}
}
