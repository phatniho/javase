package day02;

import java.util.Scanner;

/*
 * ����
 * ����ʱ�䣨�룩������������ľ���
 * ���뽵��ʱ�䣨�룩��x
 * x�뽵����xx.xx��
 * ������
 * ����һ�����������������ʱ�䣨�룩
 * ���ݹ�ʽ�������ʱ������������ľ��룬��������һ��������
 * �����ӡ���
 */
public class Test3_ZiYouLuoTi {
	public static void main(String[] args) {
		System.out.print("���뽵��ʱ�䣨�룩��");// ��ʾ����ʱ�䣬��λΪ��
		double t = new Scanner(System.in).nextDouble();// �Ӽ��̻�ȡ�����ʱ�䣬�����浽������
		double s = 0.5 * 9.8 * t * t;// �������ʱ�併��ľ��룬�����浽������
		System.out.println(t + "�뽵����" + s + "��");// �����ӡ���
	}
}
