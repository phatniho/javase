package day02;

import java.util.Scanner;

/*
 * ����
 * ���������Բ�뾶������Բ���ܳ������
 * ������
 * ����һ�����������������Բ�뾶
 * ���ݹ�ʽ����Բ���ܳ������
 * �ܳ���l=2*pi*r
 * �����s=pi*r*r
 * �����ӡ���
 */
public class Test4_Yuan {
	public static void main(String[] args) {
		System.out.print("��������Ҫ�����Բ�İ뾶�ף�");// ��ʾ������Ҫ�����Բ�İ뾶����λΪ��
		double r = new Scanner(System.in).nextDouble();// ����һ����������������İ뾶
		double pi = 3.14;// ����һ������������Բ����
		double l = 2 * pi * r;// ��������İ뾶�Ͷ����Բ���ʣ�����Բ���ܳ�
		double s = pi * r * r;// ��������İ뾶�Ͷ����Բ���ʣ�����Բ�����
		System.out.println("�������Բ�뾶Ϊ" + r + "�ף��ܳ�Ϊ" + l + "�ף����Ϊ" + s + "ƽ����");// �����ӡ���
	}
}
