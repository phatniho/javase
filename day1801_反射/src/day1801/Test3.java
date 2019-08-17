package day1801;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception {
		// 反射新建两个实例
		// 1.执行无参构造
		// 2.执行int参数构造
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);// 保存输入的类对象
		Object o1 = null;// 新建对象
		Object o2 = null;
		System.out.println("--执行无参构造--------------");
		try {
			Object c1 = c.newInstance();// 新建类对象，执行无参构造
			System.out.println(c1.toString());// 打印类对象
		} catch (Exception e) {
			System.out.println("不能执行无参构造");
		}
		System.out.println("--执行有参构造--------------");
		try {
			Constructor<?> c2 = c.getConstructor(int.class);// 执行指定类的构造方法
			Object c3 = c2.newInstance(6);// 传入指定参数创建类对象
			System.out.println(c3.toString());
		} catch (Exception e) {
			System.out.println("不能执行有参构造");
		}
	}
}
