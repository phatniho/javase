package day1801;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);// 保存输入的类对象

		System.out.println(c.getPackage().getName());// 获得包名
		System.out.println(c.getName());// 获得包名+类名
		System.out.println(c.getSimpleName());// 获得类名

		System.out.println("\n---成员变量-------");
		f1(c);
		System.out.println("\n---构造方法-------");
		f2(c);
		System.out.println("\n---方法----------");
		f3(c);
	}

	private static void f1(Class<?> c) {
		Field[] a = c.getDeclaredFields();// 获取所有当前类中的变量，包括私有，不包括继承
		for (Field f : a) {
			String t = f.getType().getSimpleName();// 获取变量类型
			String n = f.getName();// 获取变量名
			System.out.println(t + " " + n);
		}
	}

	private static void f2(Class<?> c) {
		Constructor<?>[] a = c.getDeclaredConstructors();// 获取类中的所有构造方法，包含私有
		// Constructor实例，封装构造方法的定义信息
		for (Constructor<?> b : a) {
			String n = c.getSimpleName();// 获取构造方法名（类名）
			Class<?>[] p = b.getParameterTypes();// 获取参数列表
			System.out.println(n + "(" + Arrays.toString(p) + ")");
		}
	}

	private static void f3(Class<?> c) {
		// Method实例，封装方法的定义信息
		Method[] a = c.getDeclaredMethods();// 获取类中的所有方法，包含私有，不包含继承
		for (Method t : a) {
			String n = t.getName();// 获取方法名
			Class<?>[] p = t.getParameterTypes();// 获取参数列表
			System.out.println(n + "(" + Arrays.toString(p) + ")");
		}
	}
}
