package day13查找文件夹中所有的图片文件;

import java.io.File;
import java.util.Scanner;

/*
 * 需求：查找文件夹中所有的图片文件
 * 格式：jpg,png,jpeg...
 * 分析：
 * 输入文件夹路径
 * 查找文件夹路径下的所有文件
 * 判断是否为文件夹，如果是文件夹，则递归调用继续查找下层
 * 如果是文件，则判断是否为图片格式文件
 * 返回找到的文件名
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入需要查找的文件夹");
		String l = new Scanner(System.in).nextLine();
		File f = new File(l);

		if (!f.isDirectory()) {
			System.out.println("不是一个文件夹");
			return;
		}
		find(f);
	}

	private static void find(File f) {
		String[] names = f.list();
		File[] files = f.listFiles();
		if (names == null) {
			System.out.println("无法获得文件列表");
			return;
		}
		for (int j = 0; j < names.length; j++) {
			if (names[j].endsWith(".png")//
					|| names[j].endsWith(".jpg")//
					|| names[j].endsWith(".gif")//
					|| names[j].endsWith(".bmp")) {
				System.out.println(names[j]);
			}
		}
		for (int i = 0; i < files.length; i++) {
			File f1 = files[i];
			if (f1.isDirectory()) {
				System.out.println(f1.getName() + f1.length());
				find(f1);
			}
		}
	}
}
