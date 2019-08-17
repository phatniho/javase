package day0101;

import java.util.Scanner;

/*
 * 需求：从键盘获取3个数，比较这3个数的大小，并返回最大的那个数
 * 分析：
 * 从键盘依次获取输入的三个数，保存到三个变量中
 * 使用三元运算符对这三个数进行两次比较，返回较大的那个数
 * 两次比较中最大的数即为所求结果
 * 使用临时变量保存这个最大值
 * 将临时变量打印到控制台上
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.print("请输入需要比较的第一个数：");// 提示输入第一个数
		int a = new Scanner(System.in).nextInt();// 从键盘获取输入的数，并保存到变量中

		System.out.print("请输入需要比较的第二个数：");
		int b = new Scanner(System.in).nextInt();

		System.out.print("请输入需要比较的第三个数：");
		int c = new Scanner(System.in).nextInt();

		int temp = a > b ? a : b;// 对任意两个数进行比较，取较大的那个，保存到变量中
		temp = temp > c ? temp : c;// 将较大的数与剩下的数进行比较，再次取较大的那个，保存到变量中
		// int d = (a > b ? a : b) > c ? (a > b ? a : b) : c;//阅读性差
		System.out.println("三个数中最大的数是：" + temp);// 输出打印保存有最大数的变量
	}
}
