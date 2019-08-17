package day1104;

import java.util.HashMap;
import java.util.Scanner;

/*
 * HashMap��ϰ������һ���ַ�����ͳ������ַ����и��ַ����ֵĴ���
 * 
 * �½�һ��HashMap����map
 * iѭ�������ַ���s
 * ----��sȡ��iλ�õ�һ���ַ�c
 * ----��mapȡ�ַ�c��Ӧ�ļ���ֵInteger count
 * ----�ж�count��null
 * ------����c--1
 * ----����
 * ------c--count+1
 * ����map
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("����һ���ַ���");
		String s = new Scanner(System.in).nextLine();
		// ͳ�Ʒ���
		HashMap<Character, Integer> map = tongJi(s);// ����HashMap����
		System.out.println(map);// ��ӡHashMap����
	}

	private static HashMap<Character, Integer> tongJi(String s) {
		HashMap<Character, Integer> map = new HashMap<>();// �½�һ��HashMap����
		for (int i = 0; i < s.length(); i++) {// ѭ������ȡ�����ַ�����ÿһ���ַ�
			char c = s.charAt(i);// ��ȡ�����ַ����浽�ַ�������
			Integer count = map.get(c);// ���弯���м���Ӧ�Ķ������
			if (count == null) {// �ж϶�������Ƿ�Ϊ��
				map.put(c, 1);// ���Ϊ���򽫼���Ӧ��ֵ����Ϊ1
			} else {// �������Ӧ��ֵ��Ϊ��
				map.put(c, count + 1);// ������Ӧ��ֵ��1
			}
		}
		return map;// �����������
	}
}
