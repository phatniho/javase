package day1801;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception {
		// �����½�����ʵ��
		// 1.ִ���޲ι���
		// 2.ִ��int��������
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);// ��������������
		Object o1 = null;// �½�����
		Object o2 = null;
		System.out.println("--ִ���޲ι���--------------");
		try {
			Object c1 = c.newInstance();// �½������ִ���޲ι���
			System.out.println(c1.toString());// ��ӡ�����
		} catch (Exception e) {
			System.out.println("����ִ���޲ι���");
		}
		System.out.println("--ִ���вι���--------------");
		try {
			Constructor<?> c2 = c.getConstructor(int.class);// ִ��ָ����Ĺ��췽��
			Object c3 = c2.newInstance(6);// ����ָ���������������
			System.out.println(c3.toString());
		} catch (Exception e) {
			System.out.println("����ִ���вι���");
		}
	}
}
