package test04�ݹ���׳�;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����һ����Ҫ��׳˵�����");
		int i = new Scanner(System.in).nextInt();
		long l = f(i);
		System.out.println(i + "�Ľ׳���" + l);
	}

	private static long f(int i) {
		if (i == 0) {
			return 1;
		}
		return i * f(i - 1);
	}
}
