package day12;

import java.util.Scanner;

/*
 * ������ʾ����������������
 * ��������
 * ���������0���ý��Infinity
 */
public class Test2 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c = divide(a, b);// ��������
			System.out.println(c);
		} catch (ArithmeticException e) {// �����ض��쳣
			System.out.println("��������Ϊ0");// ��ʾ�쳣��ʾ��Ϣ���û�
			e.printStackTrace();
		}
	}

	private static double divide(double a, double b) {
		if (b == 0) {// �쳣��������
			// ��ʾ�쳣��ʾ��Ϣ������Ա
			ArithmeticException e = new ArithmeticException("/ by zero");// �½��쳣
			throw e;// �׳��쳣
		}
		return a / b;// ���ؽ��
	}
}
