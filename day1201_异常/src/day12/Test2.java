package day12;

import java.util.Scanner;

/*
 * 需求：提示输入两个浮点数：
 * 除法运算
 * 如果除数是0，得结果Infinity
 */
public class Test2 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c = divide(a, b);// 除法方法
			System.out.println(c);
		} catch (ArithmeticException e) {// 处理特定异常
			System.out.println("除数不能为0");// 显示异常提示信息给用户
			e.printStackTrace();
		}
	}

	private static double divide(double a, double b) {
		if (b == 0) {// 异常发生条件
			// 显示异常提示信息给程序员
			ArithmeticException e = new ArithmeticException("/ by zero");// 新建异常
			throw e;// 抛出异常
		}
		return a / b;// 返回结果
	}
}
