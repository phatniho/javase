package day04;

import java.util.Scanner;

/*
 * 需求：输入两个数，求这两个数的最大公约数和最小公倍数 
 * 24 1,2,3,4,6,8,12,24 
 * 16 1,2,4,8,16 
 * 48 
 * 分析：
 * 最大公约数，从小值向前找
 * 最小公倍数，从大值向后一直累加大值
 * 
 */
public class Test1_MaxMin {
	public static void main(String[] args) {
		System.out.print("请输入第一个数：");
		int a = new Scanner(System.in).nextInt();// 获取输入的第一个数

		System.out.print("请输入第二个数：");
		int b = new Scanner(System.in).nextInt();// 获取输入的第二个数

		int x = max(a, b);// 调用求最大公约数方法，将结果存到变量中
		int y = min(a, b);// 调用求最小公倍数方法，将结果存到变量中

		System.out.println(a + "和" + b + "两个数的最大公约数为：" + x);// 输出打印结果
		System.out.println(a + "和" + b + "两个数的最小公倍数为：" + y);// 输出打印结果

	}

	private static int max(int a, int b) {// 求最大公约数方法
		if (a == b) {// 判断两个数是否相等，如果相等，最大公约数和最小公倍数都为这两个数的值
			return a;// 返回两个数中任意一个的值
		}
		int x = 0;// 定义变量，用来保存最大公约数的值
		int big = a > b ? a : b;// 取两个数中较大的数，存到变量中
		int small = a < b ? a : b;// 取两个数中较小的数，存到变量中
		for (int i = small; i >= 1; i--) {// 定义循环进行判断
			if (small % i == 0 && big % i == 0) {
				// 从小的值开始判断，如果能被小值整除，再判断能否被大值整除
				x = i;// 满足条件时将i的值赋给x
				break;// 结束循环
			}
		}
		return x;// 返回x的值
	}

	private static int min(int a, int b) {
		if (a == b) {// 判断两个数是否相等，如果相等，最大公约数和最小公倍数都为这两个数的值
			return a;// 返回两个数中任意一个的值
		}
		int y = 0;// 定义变量，用来保存最小公倍数的值
		int big = a > b ? a : b;// 取两个数中较大的数，存到变量中
		int small = a < b ? a : b;// 取两个数中较小的数，存到变量中
//		for (int i = big; i <= a * b; i++) {//依次判断，效率低
//			if (i % big == 0 && i % small == 0) {
//				y = i;
//				break;
//			}
//		}
		for (int i = 1; i <= small; i++) {// 定义循环进行判断
			if ((big * i) % small == 0) {// 从大值开始，向后累加将结果与小值进行判断
				y = big * i;// 满足条件则将值赋给y
				break;// 结束循环
			}
		}
		return y;// 返回结果
	}
}
