package day11_重写;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Test01_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("按回车添加数字，q退出");
		while (true) {
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("程序结束");
				break;
			}
			int i = new Random().nextInt(1000);
			int a = Collections.binarySearch(al, i);
			if (a < 0) {
				a = -a - 1;
			}
			al.add(a, i);
			System.out.println(al);
		}
		Iterator<Integer> m = al.iterator();
		while (m.hasNext()) {
			int b = m.next();
			System.out.println(b);
		}
		System.out.println(al);
	}
}
