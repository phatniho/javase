package day0208;

import java.util.Scanner;

/*
 * ���󣺶�����
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n------------");
		f1();
		System.out.println("\n------------");
		f2();
		System.out.println("\n------------");
		f3();
	}

	static void f1() {
		System.out.println(0b1);
		System.out.println(0b10);
		System.out.println(0b11);
		System.out.println(0b100);
		System.out.println(0b101);
		System.out.println(0b110);
		System.out.println(0b111);
		System.out.println(0b1000);
	}

	static void f2() {
		System.out.print("����������");
		int a = new Scanner(System.in).nextInt();
		// ������2������ʾ����
		// ��������ɶ����Ƹ�ʽ���ַ���
		System.out.println(Integer.toBinaryString(a));
	}

	static void f3() {
		System.out.println(0b1);// 1,2��0�η�
		System.out.println(0b10);// 2,2��1�η�
		System.out.println(0b100);// 4,2��2�η�
		System.out.println(0b1000);// 8,2��3�η�
		System.out.println(0b10000);// 16,2��4�η�
		System.out.println(0b100000);// 32,2��5�η�
		System.out.println(0b1000000);// 64,2��6�η�
		System.out.println(0b10000000);// 128,2��7�η�
		System.out.println(0b100000000);// 256,2��8�η�
		System.out.println(0b1000000000);// 512,2��9�η�
		System.out.println(0b10000000000);// 1024,2��10�η�
		System.out.println(0b100000000000);// 2048,2��11�η�
		System.out.println(0b1000000000000);// 4096,2��12�η�
		System.out.println(0b10000000000000);// 8192,2��13�η�
	}
}
