package day1302;

import java.io.File;
import java.util.Scanner;

/*
 * 需求：输入文件夹，显示文件夹中所有的文件及文件夹，并显示文件大小
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.print("输入一个文件夹：");// 提示信息
		String s = new Scanner(System.in).nextLine();// 获取输入的字符串
		File dir = new File(s);// 将输入的字符串新建为文件夹对象

		if (!dir.isDirectory()) {// 判断是否为有效文件夹
			System.out.println("不是文件夹");// 提示信息
			return;// 不是有效文件夹则不继续执行
		}

		String[] names = dir.list();// 定义字符串数组，用来存放文件夹对象中的所有的文件和文件夹的名称
		File[] files = dir.listFiles();// 定义文件对象数组，用来存放文件夹中所有文件和文件夹的对象
		if (names == null) {// 判断是否为空
			System.out.println("无法获得目录列表");// 提示信息
			return;// 空文件夹则直接返回，不继续执行
		}
		for (int i = 0; i < names.length; i++) {// 循环遍历字符串数组
			System.out.println(names[i]);// 打印所有文件和文件夹的名字字符串
		}
		System.out.println("\n-------------------");// 分隔符
		for (int i = 0; i < files.length; i++) {// 遍历文件对象数组
			File f = files[i];// 获取每个文件对象
			System.out.println(f.getName() + "--" + f.length());// 打印文件名和文件大小
		}
	}
}
