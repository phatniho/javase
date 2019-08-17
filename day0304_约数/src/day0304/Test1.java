package day0304;

import java.util.Scanner;

/*
 * 需求：输入一个整数，求这个整数的所有约数，如果约数的个数小于等于2，则这个数为质数
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入一个整数：");
		int n = new Scanner(System.in).nextInt();// 获取一个整数，保存到变量中

		f(n);// 将获取到的整数传到f（）函数中参与运算
	}

	static void f(int n) {
		if (n == 1) {// 判断是否为1
			System.out.println(n + "既不是质数，也不是合数。");
			return;
		}
		if (n <= 0) {// 判断是否不为正整数
			System.out.println(n + "不是一个正整数，请输入一个正整数！");
			return;
		}
		int count = 0;// 定义计数变量
		System.out.println("整数" + n + "的约数有：");// 打印依次提示信息
		for (int i = 1; i <= n; i++) {// 进入循环判断
			if (i != n) {// 判断是否为最后一次循环
				if (n % i == 0) {
					System.out.print(i + ",");// 如果不是最后依次循环，输出方式
					count++;// 计数变量加1
				}
			} else {// 否则是最后依次循环
				System.out.println(i + "。");// 最后一次循环的输出方式
				count++;// 计数变量加1
			}
		}
		System.out.println("整数" + n + "一共有" + count + "个约数");// 输出打印结果
		if (count == 2) {// 根据计数变量判断约数个数是否满足质数条件
			System.out.println(n + "是个质数。");// 如果满足则输出质数
		}
	}
}
