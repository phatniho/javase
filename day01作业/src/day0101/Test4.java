package day0101;

import java.util.Scanner;

/*
 * 需求：将从键盘录入的两个数的值进行互换
 * 分析：
 * 分别提示输入两个数，用不同的变量将值进行保存
 * 使用临时变量对数进行保存，开始交换
 * 交换完成后输出打印结果
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("请输入一个整数a=");// 提示从键盘输入第一个数
		int a = new Scanner(System.in).nextInt();// 定义一个变量，保存从键盘获取到的第一个数

		System.out.print("请输入一个整数b=");// 提示从键盘输入第二个数
		int b = new Scanner(System.in).nextInt();// 定义另一个变量，保存从键盘获取到的第二个数

		System.out.println("您输入的是：\na=" + a + "\nb=" + b);// 输出打印输入的两个数对应的值
		System.out.println("开始交换……");// 提示开始交换

		int temp = a;// 定义临时变量保存a的值
		a = b;// 将b的值赋给a
		b = temp;// 将临时变量保存的a的值赋给b

		System.out.println("交换后的结果为：\na=" + a + "\nb=" + b);// 打印交换完成后的结果
		System.out.println("交换完成！");// 提示交换完成

		// 不使用第三方变量进行交换
		a = a ^ b;// 加密解密原理：任意一个数^另一个数两次，得到的还是这个数
		b = a ^ b;
		a = a ^ b;

		System.out.println("不使用第三方变量交换后的结果为：\na=" + a + "\nb=" + b);
		System.out.println("交换完成！");
	}
}
