package day1801;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws Exception {
		A a = new A();
		Class<? extends A> c = a.getClass();// 反射获得指定类的对象
		Field f = c.getDeclaredField("a");// 获得指定类对象的成员变量
		f.setAccessible(true);// 使私有方法允许被调用
		f.set(a, 6);// 反射给类对象的成员变量赋值
		System.out.println(a.getA());// 获得这个类对象的成员变量值
		int i = (int) f.get(a);// 取出这个类对象的成员变量值
		System.out.println(i);// 打印值

		Method geta = c.getMethod("getA");// 获取指定类中的指定方法
		Method seta = c.getMethod("setA", int.class);// 获取指定类中的指定方法及参数类型

		int r = (int) geta.invoke(a);// 调用指定方法获取指定类的对象成员变量值
		System.out.println(r);// 打印值

		seta.invoke(a, 666);// 反射调用方法
		System.out.println(a.getA());// 对象调用方法
	}
}
