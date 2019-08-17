package day1701;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 需求：新建客户端
 */
public class Clinet1 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("176.202.1.68", 8000);// 新建客户端套接字，指定IP地址和端口号
		InputStream in = s.getInputStream();// 获取输入流
		OutputStream out = s.getOutputStream();// 获取输出流
		// 客户端：发送"hello"
		// 接收："world"
		out.write("hello".getBytes());// 发送字符串
		out.flush();// 刷新发出
		for (int i = 0; i < 5; i++) {// 循环接收
			char c = (char) in.read();// 接收数据字符
			System.out.print(c);// 打印字符
		}
		s.close();// 关闭客户端连接
	}
}
