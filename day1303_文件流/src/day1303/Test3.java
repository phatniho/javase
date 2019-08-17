package day1303;

import java.io.FileInputStream;
import java.util.Arrays;

/*
 * 需求：批量读取文件中的数据
 */
public class Test3 {
	public static void main(String[] args) throws Exception {
		// 输入流，读入到内存中
		FileInputStream fis = new FileInputStream("d:/abc/f2");

		byte[] b = new byte[5];// 定义一个数组，用来保存一次读取的长度
		int n;// 定义变量保存返回个数
		// 嵌套判断读取的数是否为-1
		while ((n = fis.read(b)) != -1) {// 一次读取数组长度个数的字节
			System.out.println(n + "个" + Arrays.toString(b));// 打印
		}
		fis.close();// 关闭流
	}
}
