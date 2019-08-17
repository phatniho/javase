package day0303;

import java.util.Random;

/*
 * 需求：循环嵌套
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("\n--------------");
		f1();
		System.out.println("\n--------------");
		f2();
		System.out.println("\n--------------");
		f3();
		System.out.println("\n--------------");
		f4();
	}

	private static void f1() {// 依次打印1-3*a-c
		for (int i = 1; i <= 3; i++) {
			for (char j = 'a'; j <= 'c'; j++) {
				System.out.println(i + "," + j);
			}
		}
	}

	private static void f2() {// 打印一个正方形,使用随机整数
		int x = 5 + new Random().nextInt(50);// 随机生成一个整数
		System.out.println(x + "行正方形");// 打印提示
		for (int i = 1; i <= x; i++) {// 外循环-行
			for (int j = 1; j <= x; j++) {// 内循环-列
				System.out.print("*");// 行内不换行，连续打印
			}
			System.out.println();// 行尾换行
		}
	}

	private static void f3() {// 打印一个三角形，使用随机整数
		int x = 5 + new Random().nextInt(50);// 随机生成一个整数
		System.out.println(x + "行三角形");// 打印提示
		for (int i = 1; i <= x; i++) {// 外循环-行
			for (int j = 1; j <= i; j++) {// 内循环-列，不超过外循环，形成三角形
				System.out.print("*");// 行内不换行，连续打印
			}
			System.out.println();// 行尾换行
		}
	}

	private static void f4() {// 打印等腰三角形，内嵌两个并列循环
		int x = 5 + new Random().nextInt(5);// 随机生成一个整数
		System.out.println(x + "行三角形");// 打印提示
		for (int i = 1; i <= x; i++) {// 外循环-行
			for (int j = i; j < x; j++) {// 左内循环-空白列，倒三角形，边界与正三角形相反
				System.out.print("-");// 行内不换行，连续打印
			}
			for (int j = 1; j <= i * 2 - 1; j++) {// 右内循环-三角形，正三角形，边界与倒三角形相反，等腰需要计算边界值
				System.out.print("*");// 行内不换行，连续打印
			}
			for (int j = i; j < x; j++) {// 左内循环-空白列，倒三角形，边界与正三角形相反
				System.out.print("-");// 行内不换行，连续打印
			}
			System.out.println();// 行尾换行
		}
	}
}
