package day0101;

import java.util.Scanner;

/*
 * ���󣺽��Ӽ���¼�����������ֵ���л���
 * ������
 * �ֱ���ʾ�������������ò�ͬ�ı�����ֵ���б���
 * ʹ����ʱ�����������б��棬��ʼ����
 * ������ɺ������ӡ���
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("������һ������a=");// ��ʾ�Ӽ��������һ����
		int a = new Scanner(System.in).nextInt();// ����һ������������Ӽ��̻�ȡ���ĵ�һ����

		System.out.print("������һ������b=");// ��ʾ�Ӽ�������ڶ�����
		int b = new Scanner(System.in).nextInt();// ������һ������������Ӽ��̻�ȡ���ĵڶ�����

		System.out.println("��������ǣ�\na=" + a + "\nb=" + b);// �����ӡ�������������Ӧ��ֵ
		System.out.println("��ʼ��������");// ��ʾ��ʼ����

		int temp = a;// ������ʱ��������a��ֵ
		a = b;// ��b��ֵ����a
		b = temp;// ����ʱ���������a��ֵ����b

		System.out.println("������Ľ��Ϊ��\na=" + a + "\nb=" + b);// ��ӡ������ɺ�Ľ��
		System.out.println("������ɣ�");// ��ʾ�������

		// ��ʹ�õ������������н���
		a = a ^ b;// ���ܽ���ԭ������һ����^��һ�������Σ��õ��Ļ��������
		b = a ^ b;
		a = a ^ b;

		System.out.println("��ʹ�õ���������������Ľ��Ϊ��\na=" + a + "\nb=" + b);
		System.out.println("������ɣ�");
	}
}
