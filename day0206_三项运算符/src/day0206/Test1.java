package day0206;

import java.util.Scanner;

/*
 * 需求：求输入三个整数的最大值
 * 分析：使用三项运算符来判断
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("请输入第一个数：");// 提示输入第一个数
		int a = new Scanner(System.in).nextInt();// 定义变量获取输入的第一个数的值

		System.out.print("请输入第二个数：");// 提示输入第二个数
		int b = new Scanner(System.in).nextInt();// 定义变量获取输入的第二个数的值

		System.out.print("请输入第三个数：");// 提示输入第三个数
		int c = new Scanner(System.in).nextInt();// 定义变量获取输入的第三个数的值

		System.out.println("您输入的三个整数为：" + a + "," + b + "," + c);// 打印输入的三个数的值

//		int max = a < b ? b : a;//第一次比较，获取较大的数，定义一个临时变量保存
//		max = max < c ? c : max;//用临时变量保存的第一次比较中较大的数与第三个数比较，获取最大的数
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);// 整合写法
		System.out.println("这三个数中的最大值为：" + max);// 输出最大的数
		System.out.println("\n-------再写变量交换");// max和c交换，交换后打印
		System.out.println("交换前的值为：\nmax=" + max + "\nc=" + c);// 打印交换前两个数的值
		int d = max;// 定义临时变量存储max的值
		max = c;// 将c的值赋值给max
		c = d;// 将临时变量保存的值赋值给c
		System.out.println("交换后的值为：\nmax=" + max + "\nc=" + c);// 打印交换后两个数的值
	}
}
