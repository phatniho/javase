package day0306;

import java.util.Scanner;

/*
 * 需求：阶乘
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入一个整数：");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);// 有附加输出，多余了
		System.out.println(r);
		long s = f1(n);// 只返回需要的值，程序简洁
		System.out.println(s);
	}

	private static long f1(int n) {// 只返回需要的值
		if (n == 0) {// 优先判断是否为0
			return 1;// 直接返回结果
		}
		long x = n;// 定义一个变量保存传入的值
		for (int i = n - 1; i >= 1; i--) {// 定义循环开始计算
			x = x * i;// 计算
		}
		return x;// 返回结果
	}

	private static long f(int n) {// 有多余输出
		if (n == 0) {// 判断是否为0
			return 1;// 直接返回结果
		}
		long x = n;// 定义一个变量保存传入的值
		System.out.print(n + "的阶乘为：\n" + n + "! = ");// 输出运算提示
		for (int i = n; i > 0; i--) {// 定义循环开始计算
			if (i != 1) {// 判断是否为循环末尾
				x = x * (i - 1);// 计算
				System.out.print(i + "*");// 输出打印计算过程
			} else {// 如果是循环末尾
				System.out.print(i + " = ");// 输出打印
			}
		}
		return x;// 返回结果
	}
}
