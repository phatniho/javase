package day11_重写;

import java.util.HashMap;
import java.util.Scanner;

public class Test04_HashMap {
	public static void main(String[] args) {
		System.out.println("输入一个字符串：");
		String l = new Scanner(System.in).nextLine();
		HashMap<Character, Integer> hm = tongJi(l);
		System.out.println(hm);
	}

	private static HashMap<Character, Integer> tongJi(String l) {
		// 新建一个HashMap对象map
		// i循环遍历字符串s
		// ----从s取出i位置的一个字符c
		// ----从map取字符c对应的计数值Integer count
		// ----判断count是null
		// ------放入c--1
		// ----否则
		// ------c--count+1
		// 返回map
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < l.length(); i++) {
			char c = l.charAt(i);
			Integer count = hm.get(c);
			if (count == null) {
				hm.put(c, 1);
			} else {
				hm.put(c, ++count);
			}
		}
		return hm;
	}
}
