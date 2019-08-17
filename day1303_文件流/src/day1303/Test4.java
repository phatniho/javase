package day1303;

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
public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入原文件：");// 提示信息
		String s1 = new Scanner(System.in).nextLine();// 获取输入的地址字符串
		File from = new File(s1);// 根据输入的字符串创建文件夹对象
		if (!from.isFile()) {// 判断是否是一个有效文件夹
			System.out.println("文件错误");// 提示信息
			return;// 不是有效文件则直接返回，不继续执行
		}
		System.out.println("输入目标文件：");// 提示信息
		String s2 = new Scanner(System.in).nextLine();// 获取输入的地址字符串
		File to = new File(s2);// 将输入的目标地址创建为文件夹对象
		if (to.isDirectory()) {// 判断是否为有效文件
			System.out.println("请具体到文件，不能是文件夹！");// 如果是文件夹则提示
			return;// 返回，不继续执行
		}
		try {// 异常捕捉处理
			copy(from, to);// 复制方法
			System.out.println("完成");// 复制完成提示
		} catch (Exception e) {// 异常处理
			System.out.println("失败");// 复制失败提示
			e.printStackTrace();// 打印栈追踪，问题描述
		}

	}

	private static void copy(File from, File to) throws Exception {
		FileInputStream fis = new FileInputStream(from);// 文件输入流，将目标文件中的数据读取到内存
		// C:\Users\tarena\Pictures\Saved Pictures\桌面.png
		FileOutputStream fos = new FileOutputStream(to);// 文件输出流，将内存中的数据写出到指定文件
		// D:\abc\aa\1.png

		// 单字节复制
//		int c;
//		while ((c = fis.read()) != -1) {
//			fos.write(c);
//		}
//		fis.close();
//		fos.close();

		// 批量复制 默认 8k - 8*1024 - 8192
		byte[] b = new byte[8 * 1024];// 定义缓存空间数组
		int n;// 定义复制个数变量
		while ((n = fis.read(b)) != -1) {// 判断复制了多少个，如果返回-1则是读取完成
			fos.write(b, 0, n);// 批量写出
		}
		fis.close();// 关闭流
		fos.close();// 关闭流
	}
}
