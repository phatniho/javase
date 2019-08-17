package day0102;

import java.util.Scanner;

/*
 * 需求：录入个人信息，获得输入的姓名，性别，年龄，并打印在控制台上
 * 分析：导入Scanner包来使用工具，用以获取键盘输入的信息。
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入个人信息：");// 提示信息，行尾换行
		System.out.print("输入姓名：");// 提示信息，行尾不换行
		String name = new Scanner(System.in).nextLine();// 获取键盘输入的字符串，并保存到变量name中

		System.out.print("输入性别：");// 提示信息，行尾不换行
		String gender = new Scanner(System.in).nextLine();// 获取键盘输入的字符串，并保存到变量gender中

		System.out.print("输入年龄：");// 提示信息，行尾不换行
		int age = new Scanner(System.in).nextInt();// 获取键盘输入的数字，并保存到变量age中

		// 在控制台上输出打印已经录入的信息，\n用于在字符串中间换行
		System.out.println("您输入的个人信息是：\n姓名：" + name + "\n性别：" + gender + "\n年龄：" + age);
		System.out.println("我在达内一定要努力磨炼技术，比旁边同学多写一遍代码，薪水一定要比旁边同学高！");
	}
}
