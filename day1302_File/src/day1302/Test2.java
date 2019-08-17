package day1302;

import java.io.File;
import java.util.Scanner;

/*
 * 需求：
 * d:/abc/aa/
 * d:/abc/aa/f1
 * 删除f1
 * 删除aa文件夹
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("按回车执行");
		new Scanner(System.in).nextLine();

		File f = new File("d:/abc/aa");
		f.mkdirs();// 逐层创建文件夹，f.mkdir()只创建最后一个文件夹

		new Scanner(System.in).nextLine();
		File f1 = new File(f, "f1");// 创建文件对象，传入参数：路径 ，文件名

		f1.createNewFile();// 创建文件

		new Scanner(System.in).nextLine();
		f1.delete();// 删除文件
		new Scanner(System.in).nextLine();
		f.delete();// 删除文件夹
	}
}
