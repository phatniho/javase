package day0303;

import java.util.Random;

/*
 * ����ѭ��Ƕ��
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

	private static void f1() {// ���δ�ӡ1-3*a-c
		for (int i = 1; i <= 3; i++) {
			for (char j = 'a'; j <= 'c'; j++) {
				System.out.println(i + "," + j);
			}
		}
	}

	private static void f2() {// ��ӡһ��������,ʹ���������
		int x = 5 + new Random().nextInt(50);// �������һ������
		System.out.println(x + "��������");// ��ӡ��ʾ
		for (int i = 1; i <= x; i++) {// ��ѭ��-��
			for (int j = 1; j <= x; j++) {// ��ѭ��-��
				System.out.print("*");// ���ڲ����У�������ӡ
			}
			System.out.println();// ��β����
		}
	}

	private static void f3() {// ��ӡһ�������Σ�ʹ���������
		int x = 5 + new Random().nextInt(50);// �������һ������
		System.out.println(x + "��������");// ��ӡ��ʾ
		for (int i = 1; i <= x; i++) {// ��ѭ��-��
			for (int j = 1; j <= i; j++) {// ��ѭ��-�У���������ѭ�����γ�������
				System.out.print("*");// ���ڲ����У�������ӡ
			}
			System.out.println();// ��β����
		}
	}

	private static void f4() {// ��ӡ���������Σ���Ƕ��������ѭ��
		int x = 5 + new Random().nextInt(5);// �������һ������
		System.out.println(x + "��������");// ��ӡ��ʾ
		for (int i = 1; i <= x; i++) {// ��ѭ��-��
			for (int j = i; j < x; j++) {// ����ѭ��-�հ��У��������Σ��߽������������෴
				System.out.print("-");// ���ڲ����У�������ӡ
			}
			for (int j = 1; j <= i * 2 - 1; j++) {// ����ѭ��-�����Σ��������Σ��߽��뵹�������෴��������Ҫ����߽�ֵ
				System.out.print("*");// ���ڲ����У�������ӡ
			}
			for (int j = i; j < x; j++) {// ����ѭ��-�հ��У��������Σ��߽������������෴
				System.out.print("-");// ���ڲ����У�������ӡ
			}
			System.out.println();// ��β����
		}
	}
}
