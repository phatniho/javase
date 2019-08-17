package day04;

import java.util.Scanner;

/*
 * 需求：输入两个整数，保存到两个变量，交换两个变量的值
 * 分析：
 * 首先提示从键盘上输入两个整数
 * 定义两个变量，用来保存着两个整数
 * 输出打印一下需要交换的两个数的值
 * 定义临时变量，保存a的值
 * 将b的值赋值给a
 * 将临时变量保存的a的值赋值给b
 * 交换完成，输出打印结果
 */
public class Test2_Change {
	public static void main(String[] args) {
		System.out.print("输入第一个数a：");
		int a = new Scanner(System.in).nextInt();// 获取第一个输入的数

		System.out.print("输入第二个数b：");
		int b = new Scanner(System.in).nextInt();// 获取第二个输入的数

		int[] arr = { a, b };// 定义一个数组，用来存放输入的两个数，便于操作

		System.out.println("您输入的是：");
		System.out.println("a=" + arr[0] + "\nb=" + arr[1]);// 打印输入的两个数的原值
		System.out.println("开始交换……");

		change(arr);// 调用方法进行数值交换

//		int s = a;// 定义临时变量存储第一个数的值
//		a = b;// 将第一个数的值修改为第二个数的值
//		b = s;// 将第二个数的值修改为存储的第一个数的值

		System.out.println("交换后的结果为：");
		System.out.println("a=" + arr[0] + "\nb=" + arr[1]);// 输出打印结果
		System.out.println("交换完成！");
	}

	public static void change(int[] arr) {// 数值交换方法
		int t = arr[0];// 定义临时变量存储第一个数的值
		arr[0] = arr[1];// 将第一个数的值修改为第二个数的值
		arr[1] = t;// 将第二个数的值修改为保存的第一个数的值
	}
}
