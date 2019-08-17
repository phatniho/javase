package day0604;

/*
 * 需求：方法递归
 * 用递归方法求阶乘
 */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数求阶乘：");// 提示信息
		int i = new Scanner(System.in).nextInt();// 获取输入的数
		long l = f(i);// 传入到方法中求结果，并将结果保存到变量中
		System.out.println(l);// 打印变量
	}

	private static long f(int i) {// 数值太大容易栈内存溢出
		if (i == 0) {// 最简问题
			return 1;// 从最简问题向前返回
		}
		return i * f(i - 1);// 递归调用
	}
}
