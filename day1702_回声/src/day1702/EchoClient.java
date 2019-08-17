package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		try {
			Socket s = new Socket("176.202.1.68", 8000);
			BufferedReader in = new BufferedReader(// 按行读取流
					new InputStreamReader(// 输入转码流
							s.getInputStream(), // 获取套接字输入流
							"UTF-8"));// 指定编码
			PrintWriter out = new PrintWriter(// 按行写出流
					new OutputStreamWriter(// 输出转码流
							s.getOutputStream(), // 获取套接字输出流
							"UTF-8"));// 指定编码
			while (true) {// 循环执行
				System.out.print("输入：");// 提示信息
				String str = new Scanner(System.in).nextLine();// 获取输入的字符串
				out.println(str);// 将字符串输出到网络输出流
				out.flush();// 刷新输出流，发送
				String echo = in.readLine();// 获取收到的字符串
				System.out.println("回声：" + echo);// 打印字符串到控制台
				System.out.println("\n----------------");// 分割线
			}
		} catch (Exception e) {
		}
	}
}
