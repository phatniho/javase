package day11_��д;

import java.util.HashMap;
import java.util.Scanner;

public class Test04_HashMap {
	public static void main(String[] args) {
		System.out.println("����һ���ַ�����");
		String l = new Scanner(System.in).nextLine();
		HashMap<Character, Integer> hm = tongJi(l);
		System.out.println(hm);
	}

	private static HashMap<Character, Integer> tongJi(String l) {
		// �½�һ��HashMap����map
		// iѭ�������ַ���s
		// ----��sȡ��iλ�õ�һ���ַ�c
		// ----��mapȡ�ַ�c��Ӧ�ļ���ֵInteger count
		// ----�ж�count��null
		// ------����c--1
		// ----����
		// ------c--count+1
		// ����map
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
