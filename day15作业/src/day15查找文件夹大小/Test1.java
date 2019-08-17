package day15查找文件夹大小;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入文件夹：");
		String files = new Scanner(System.in).nextLine();
		File f = new File(files);
		if (!f.isDirectory()) {
			System.out.println("不是一个文件夹");
			return;
		}
		List<File> l = add(f);
		long sum = 0;
		for (File file : l) {
			sum += file.length();
		}
		System.out.println("总大小：" + sum + "字节");
	}

	private static List<File> add(File f) {
		ArrayList<File> al = new ArrayList<>();
		LinkedList<File> ll = new LinkedList<>();
		ll.push(f);
		while (!ll.isEmpty()) {
			File f1 = ll.pop();
			if (f1.isFile()) {
				al.add(f1);
			} else {
				File[] list = f1.listFiles();
				if (list == null) {
					continue;
				}
				for (File f4 : list) {
					ll.push(f4);
				}
			}
		}
		return al;
	}
}
