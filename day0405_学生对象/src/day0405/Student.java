package day0405;

/*
 * 需求：建立一个学生类，包含学号，姓名，性别，年龄属性，并包含一个输出打印这些属性的方法
 */
public class Student {
	int id;// 定义相关属性
	String name;
	String gender;
	int age;

	void show() {// 输出打印方法
		System.out.println("学号：" + this.id);
		System.out.println("姓名：" + this.name);
		System.out.println("性别：" + this.gender);
		System.out.println("年龄：" + this.age);
	}
}
