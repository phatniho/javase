package day0101;

import java.util.Scanner;

/*
 * ���󣺸��������Բ�뾶����Բ���ܳ������
 * ������
 * ��ȡ��������İ뾶
 * ������ع�ʽ���м��㣬�ܳ�=2*��*r�����=��*r*r
 * �����ӡ���
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.print("��������Ҫ�����Բ�뾶r=");// ��ʾ������Ҫ�����Բ�İ뾶
		double r = new Scanner(System.in).nextDouble();// �Ӽ��̻�ȡ�����Բ�İ뾶

		double pi = 3.14;// ����Բ���ʵ���ֵ
		double l = 2 * pi * r;// ����Բ���ܳ��������浽һ��������
		double s = pi * r * r;// ����Բ������������浽��һ��������
		System.out.println("�뾶Ϊ" + r + "��Բ���ܳ�Ϊ" + l + ",���Ϊ" + s);// �����ӡ���
	}
}
