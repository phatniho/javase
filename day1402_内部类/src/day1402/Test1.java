package day1402;

import day1402.A.*;

/*
 * 需求：内部类
 * 非静态内部类：需要外部类对象调用创建
 * 静态内部类：可以直接创建，与外部类没有区别，可选设计方案
 */
public class Test1 {
	public static void main(String[] args) {
		Inner1 i1 = new Inner1();// 静态内部类可以直接创建对象
		System.out.println(i1);
		A a = new A();// 外部类对象
		System.out.println(a);
		Inner2 i2 = a.new Inner2();// 非静态内部类需要由外部类对象来创建对象
		System.out.println(i2);
	}
}

class A {// 外部类，也叫顶层类
	static class Inner1 {// 内部类，也叫底层类，静态内部类等同于外部类，可以直接创建对象

	}

	class Inner2 {// 内部类，非静态的内部类必须要由外部类的对象来调用新建

	}
}