package day1303;

import java.io.FileOutputStream;

/*
 * 需求：新建文件输出流，将指定字节流输出到硬盘指定文件中
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("d:/abc/f2");// 写出到硬盘
		fos.write(97);// 00 00 00 61
		fos.write(98);// 00 00 00 62
		fos.write(99);// 00 00 00 63
		fos.write(356);// 00 00 01 64
		byte[] a = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
		fos.write(a, 0, 10);
		fos.write(a, 3, 4);
		fos.close();
//		FileInputStream fis = new FileInputStream("d:/abc/f2");// 读入到内存
	}
}
