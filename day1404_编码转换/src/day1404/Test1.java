package day1404;

import java.util.Arrays;

/*
 * 编码转换
 * encoding 编码
 * charset 字符集
 *                a    中
 * Unicode     00 61   4e 2d
 * UTF-8          61   e4 b8 ad
 * GBK            61   d6 d0
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc中文";
		System.out.println(s);
		f(s, null);// [97, 98, 99, -42, -48, -50, -60]
		f(s, "Unicode");//
		f(s, "GBK");// [97, 98, 99, -42, -48, -50, -60]
		f(s, "UTF-8");// [97, 98, 99, -28, -72, -83, -26, -106, -121]
	}

	private static void f(String s, String charset) throws Exception {
		byte[] a;// 定义字符数组
		if (charset == null) {// 判断码表是否为空
			a = s.getBytes();// 如果码表为空，则按默认码表转码
		} else {
			a = s.getBytes(charset);// 如果码表不为空，则按指定码表转码
		}
		System.out.println(charset + "\t" + Arrays.toString(a));// 打印码表名和对应的值
		// 转回Unicode字符
		if (charset == null) {// 判断码表是否为空
			s = new String(a);// 如果码表为空则按默认码表转码为字符串
		} else {
			s = new String(a, charset);// 如果码表不为空，则按指定码表转码为字符串
		}
		System.out.println(s);// 打印转码后的字符串
		System.out.println("--------------");
	}
}
