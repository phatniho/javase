package day0605;

import java.util.Scanner;

/*
 * 需求：递归求斐波那契数
 * 1,1,2,3,5,8,13,21,34,55……
 * 输入要求第几个斐波那契数
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("求第几个斐波那契数：");
		int i = new Scanner(System.in).nextInt();// 接收键盘输入的数字
		long l = g(i);// 传入方法进行计算，求得结果
		System.out.println(l);// 打印结果
	}

	private static long g(int i) {// 循环求斐波那契数
		if (i == 1 || i == 2) {
			return 1;
		}
		// 1,1,2,3,5,8,13,21,34,55……
		// a b
		// b=a+b
		// a=b-a
		long a = 1, b = 1;

		for (int j = 3; j <= i; j++) {
			b = a + b;
			a = b - a;
		}
		return b;
	}

	private static long f(int i) {// 递归求斐波那契数，多次递归运算量大
		if (i == 1 || i == 2) {
			return 1;
		}
		return f(i - 1) + f(i - 2);
	}
}
