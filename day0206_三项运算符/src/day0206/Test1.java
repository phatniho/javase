package day0206;

import java.util.Scanner;

/*
 * �����������������������ֵ
 * ������ʹ��������������ж�
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("�������һ������");// ��ʾ�����һ����
		int a = new Scanner(System.in).nextInt();// ���������ȡ����ĵ�һ������ֵ

		System.out.print("������ڶ�������");// ��ʾ����ڶ�����
		int b = new Scanner(System.in).nextInt();// ���������ȡ����ĵڶ�������ֵ

		System.out.print("���������������");// ��ʾ�����������
		int c = new Scanner(System.in).nextInt();// ���������ȡ����ĵ���������ֵ

		System.out.println("���������������Ϊ��" + a + "," + b + "," + c);// ��ӡ�������������ֵ

//		int max = a < b ? b : a;//��һ�αȽϣ���ȡ�ϴ����������һ����ʱ��������
//		max = max < c ? c : max;//����ʱ��������ĵ�һ�αȽ��нϴ��������������Ƚϣ���ȡ������
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);// ����д��
		System.out.println("���������е����ֵΪ��" + max);// ���������
		System.out.println("\n-------��д��������");// max��c�������������ӡ
		System.out.println("����ǰ��ֵΪ��\nmax=" + max + "\nc=" + c);// ��ӡ����ǰ��������ֵ
		int d = max;// ������ʱ�����洢max��ֵ
		max = c;// ��c��ֵ��ֵ��max
		c = d;// ����ʱ���������ֵ��ֵ��c
		System.out.println("�������ֵΪ��\nmax=" + max + "\nc=" + c);// ��ӡ��������������ֵ
	}
}
