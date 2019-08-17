package day04;

import java.util.Scanner;

/*
 * 需求：阶乘
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public class Test6_JX {
	public static void main(String[] args) {
		System.out.print("请输入一个需要阶乘的数：");
		int i = new Scanner(System.in).nextInt();// 获取需要阶乘计算的数

		long n = f(i);// 调用阶乘计算方法进行计算，并将结果返回保存到变量中
		System.out.println(i + "的阶乘结果是" + n);// 输出打印结果
	}

	private static long f(int i) {// 传入参数计算阶乘
		if (i == 0) {// 特殊值判断
			return 1;// 0的阶乘=1
		}
		long f = i;// 定义变量保存输入的值
		for (int j = i - 1; j >= 1; j--) {// 循环阶乘
			f = f * j;// 循环阶乘
		}
		return f;// 返回结果
	}
}
