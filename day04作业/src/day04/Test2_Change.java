package day04;

import java.util.Scanner;

/*
 * ���������������������浽������������������������ֵ
 * ������
 * ������ʾ�Ӽ�����������������
 * ��������������������������������
 * �����ӡһ����Ҫ��������������ֵ
 * ������ʱ����������a��ֵ
 * ��b��ֵ��ֵ��a
 * ����ʱ���������a��ֵ��ֵ��b
 * ������ɣ������ӡ���
 */
public class Test2_Change {
	public static void main(String[] args) {
		System.out.print("�����һ����a��");
		int a = new Scanner(System.in).nextInt();// ��ȡ��һ���������

		System.out.print("����ڶ�����b��");
		int b = new Scanner(System.in).nextInt();// ��ȡ�ڶ����������

		int[] arr = { a, b };// ����һ�����飬�����������������������ڲ���

		System.out.println("��������ǣ�");
		System.out.println("a=" + arr[0] + "\nb=" + arr[1]);// ��ӡ�������������ԭֵ
		System.out.println("��ʼ��������");

		change(arr);// ���÷���������ֵ����

//		int s = a;// ������ʱ�����洢��һ������ֵ
//		a = b;// ����һ������ֵ�޸�Ϊ�ڶ�������ֵ
//		b = s;// ���ڶ�������ֵ�޸�Ϊ�洢�ĵ�һ������ֵ

		System.out.println("������Ľ��Ϊ��");
		System.out.println("a=" + arr[0] + "\nb=" + arr[1]);// �����ӡ���
		System.out.println("������ɣ�");
	}

	public static void change(int[] arr) {// ��ֵ��������
		int t = arr[0];// ������ʱ�����洢��һ������ֵ
		arr[0] = arr[1];// ����һ������ֵ�޸�Ϊ�ڶ�������ֵ
		arr[1] = t;// ���ڶ�������ֵ�޸�Ϊ����ĵ�һ������ֵ
	}
}
