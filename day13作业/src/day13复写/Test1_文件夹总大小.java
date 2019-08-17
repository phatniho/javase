package day13复写;

import java.io.File;
import java.util.Scanner;

/*
 * 需求：输入一个文件夹，计算这个文件夹的总大小
 * 分析：输入字符串
 * 建立文件对象，将输入的地址传入对象，判断是否为有效文件夹
 * 调用方法获得文件夹总大小
 * 打印返回值
 * 方法：
 * 获取文件夹下的所有文件名，保存到文件对象数组中
 * 判断该文件夹是否为空，如果为空则返回0
 * 定义变量保存文件夹大小
 * 循环遍历文件对象数组
 * 获取每个对象，判断是否为文件，如果是文件，则将大小属性加到变量中
 * 如果不是文件，则继续递归求文件夹内的文件大小
 * 返回最后结果
 */
public class Test1_文件夹总大小 {
	public static void main(String[] args) {
		System.out.print("输入路径：");
		String l = new Scanner(System.in).nextLine();
		File f = new File(l);
		if (!f.isDirectory()) {
			System.out.println("不是一个文件夹");
			return;
		}
		long s = tongJi(f);
		System.out.println(l + "文件夹的总大小为：" + s + "字节");
	}

	private static long tongJi(File f) {
		File[] f1 = f.listFiles();
		if (f1 == null) {
			return 0;
		}
		long sum = 0;
		for (int i = 0; i < f1.length; i++) {
			File f2 = f1[i];
			if (f2.isFile()) {
				sum += f2.length();
			} else {
				sum += tongJi(f2);
			}
		}
		return sum;
	}
}
