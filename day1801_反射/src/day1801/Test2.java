package day1801;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);// ��������������

		System.out.println(c.getPackage().getName());// ��ð���
		System.out.println(c.getName());// ��ð���+����
		System.out.println(c.getSimpleName());// �������

		System.out.println("\n---��Ա����-------");
		f1(c);
		System.out.println("\n---���췽��-------");
		f2(c);
		System.out.println("\n---����----------");
		f3(c);
	}

	private static void f1(Class<?> c) {
		Field[] a = c.getDeclaredFields();// ��ȡ���е�ǰ���еı���������˽�У��������̳�
		for (Field f : a) {
			String t = f.getType().getSimpleName();// ��ȡ��������
			String n = f.getName();// ��ȡ������
			System.out.println(t + " " + n);
		}
	}

	private static void f2(Class<?> c) {
		Constructor<?>[] a = c.getDeclaredConstructors();// ��ȡ���е����й��췽��������˽��
		// Constructorʵ������װ���췽���Ķ�����Ϣ
		for (Constructor<?> b : a) {
			String n = c.getSimpleName();// ��ȡ���췽������������
			Class<?>[] p = b.getParameterTypes();// ��ȡ�����б�
			System.out.println(n + "(" + Arrays.toString(p) + ")");
		}
	}

	private static void f3(Class<?> c) {
		// Methodʵ������װ�����Ķ�����Ϣ
		Method[] a = c.getDeclaredMethods();// ��ȡ���е����з���������˽�У��������̳�
		for (Method t : a) {
			String n = t.getName();// ��ȡ������
			Class<?>[] p = t.getParameterTypes();// ��ȡ�����б�
			System.out.println(n + "(" + Arrays.toString(p) + ")");
		}
	}
}
