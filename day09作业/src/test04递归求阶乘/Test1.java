package test04递归求阶乘;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入一个需要求阶乘的数：");
		int i = new Scanner(System.in).nextInt();
		long l = f(i);
		System.out.println(i + "的阶乘是" + l);
	}

	private static long f(int i) {
		if (i == 0) {
			return 1;
		}
		return i * f(i - 1);
	}
}
