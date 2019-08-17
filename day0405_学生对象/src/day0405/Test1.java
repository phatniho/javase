package day0405;

import java.util.Scanner;

/*
 * 需求：建立学生对象，使用方法来输出学生的信息
 */
public class Test1 {
	public static void main(String[] args) {
		Student s1 = addStu(new Student());// 建立第一个对象，调用本地方法
		Student s2 = addStu(new Student());

		s1.show();// 用对象来调用类中的方法
		s2.show();

		f(s1);// 传入对象调用本地方法
		f(s2);
	}

	private static Student addStu(Student s) {// 创建学生对象的方法
		System.out.println("录入学生信息：");// 提示输入

		s = new Student();// 创建对象

		System.out.print("学号：");// 提示输入
		s.id = new Scanner(System.in).nextInt();// 获取输入的值

		System.out.print("姓名：");
		s.name = new Scanner(System.in).nextLine();

		System.out.print("性别：");
		s.gender = new Scanner(System.in).nextLine();

		System.out.print("年龄：");
		s.age = new Scanner(System.in).nextInt();
		return s;// 返回创建结果
	}

	private static void f(Student s1) {// 打印方法
		System.out.println("您录入的学生信息为：");// 提示语句
		s1.show();// 调用学生类的内部方法输出打印
	}
}
