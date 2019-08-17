package day13复写;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 需求：输入一个文件的路径，将这个文件复制到另一个指定位置
 * 分析：输入原文件路径
 * 判断是否有这个文件
 * 输入目标位置
 * 判断是否具体到文件
 * 调用方法复制文件，传入原文件和目标文件
 * 异常处理，复制完成和失败分别显示消息
 * 打印异常信息
 * 复制方法：
 * 新建文件输入流，将原文件读入到内存
 * 新建文件输出流，将内存中的数据写出到目标文件
 * 定义数组批量存储复制的数据
 * 定义复制个数变量，用于判断是否复制结束
 * 循环复制文件中的数据，小括号嵌套循环复制
 * 关闭流
 */
public class Test2_文件复制 {
	public static void main(String[] args) {
		System.out.println("输入原文件：");
		// D:/abc/aa/bb/cc/23562342.png
		String from = new Scanner(System.in).nextLine();
		File f1 = new File(from);
		if (!f1.isFile()) {
			System.out.println("不是一个有效文件");
			return;
		}
		System.out.println("输入目标文件：");
		// D:/abc/aa/bb/cc/2.png
		String to = new Scanner(System.in).nextLine();
		File f2 = new File(to);
		if (f2.isDirectory()) {
			System.out.println("不能是一个文件夹，请具体到文件");
			return;
		}
		try {
			copy(f1, f2);
			System.out.println("成功");
		} catch (Exception e) {
			System.out.println("失败");
			e.getStackTrace();
		}
	}

	private static void copy(File f1, File f2) throws Exception {
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		byte[] b = new byte[8 * 1024];
		int n;
		while ((n = fis.read(b)) != -1) {
			fos.write(b, 0, n);
		}
		fis.close();
		fos.close();
	}
}
