package day0605;

import java.util.Scanner;

/*
 * ���󣺵ݹ���쳲�������
 * 1,1,2,3,5,8,13,21,34,55����
 * ����Ҫ��ڼ���쳲�������
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("��ڼ���쳲���������");
		int i = new Scanner(System.in).nextInt();// ���ռ������������
		long l = g(i);// ���뷽�����м��㣬��ý��
		System.out.println(l);// ��ӡ���
	}

	private static long g(int i) {// ѭ����쳲�������
		if (i == 1 || i == 2) {
			return 1;
		}
		// 1,1,2,3,5,8,13,21,34,55����
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

	private static long f(int i) {// �ݹ���쳲�����������εݹ���������
		if (i == 1 || i == 2) {
			return 1;
		}
		return f(i - 1) + f(i - 2);
	}
}
