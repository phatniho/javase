package day0305;

import java.util.Scanner;

/*
 * 需求：鸡兔同笼
 * 鸡兔同笼，上有35头，下有94脚，求鸡兔各几只。
 * 分析：穷举法求解
 * 鸡兔共35只，鸡从0开始算，兔从35开始算。
 * 分别算每一种组合的脚是不是94只，如果是，则输出打印结果。
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("请输入头的数量:");
		int h = new Scanner(System.in).nextInt();// 获取头的数量
		System.out.print("请输入脚的数量:");
		int f = new Scanner(System.in).nextInt();// 获取脚的数量
		f(h, f);// 定义双参数方法进行运算
		f();// 空参方法运算
	}

	private static void f(int h, int f) {// 双参数方法
		int count = 0;// 定义计数器
		for (int j = 0, t = h; j <= h; j++, t--) {// 循环判断
			int i = j * 2 + t * 4;// 统计循环条件中组合的脚的总数
			if (i == f) {// 判断是否等于要求的数量
				System.out.println("鸡有" + j + "只，兔有" + t + "只。");// 输出打印满足要求的条件
				count++;// 计数器加1
			}
		}
		if (count != 0) {// 判断计数器是否为零
			System.out.println("一共有" + count + "种满足条件的组合");// 如果不为零，则输出组合的种数
		} else {// 如果计数器条件为0
			System.out.println("没有满足条件的组合。");// 没有满足条件的组合
		}
	}

	private static void f() {// 空参数方法
		f(35, 94);// 直接调用双参数方法，输入特定参数
	}
}
