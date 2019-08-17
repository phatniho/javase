package day1405;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * 需求：编码转换流
 * f4   61 d6 d0
 * f5   61 e4 b8 ad
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		f("d:/abc/f4", "GBK");// 将文件按指定码表进行转换
		f("d:/abc/f5", "UTF-8");// 将文件按指定码表进行转换

	}

	private static void f(String path, String charset) throws Exception {
		FileInputStream fis = new FileInputStream(path);// 文件输入流
		// 编码转换流，按指定码表转换指定文件输入流
		InputStreamReader isr = new InputStreamReader(fis, charset);

		System.out.println((char) isr.read());// 将码表转换后的数据打印
		System.out.println((char) isr.read());

		fis.close();// 文件输入流关闭
		isr.close();// 输入码表转换流关闭
	}
}
