package day15�����ļ��д�С;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�����ļ��У�");
		String files = new Scanner(System.in).nextLine();
		File f = new File(files);
		if (!f.isDirectory()) {
			System.out.println("����һ���ļ���");
			return;
		}
		List<File> l = add(f);
		long sum = 0;
		for (File file : l) {
			sum += file.length();
		}
		System.out.println("�ܴ�С��" + sum + "�ֽ�");
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
