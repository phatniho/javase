package day0101;

import java.util.Scanner;

/*
 * ���󣺴Ӽ��̻�ȡ3�������Ƚ���3�����Ĵ�С�������������Ǹ���
 * ������
 * �Ӽ������λ�ȡ����������������浽����������
 * ʹ����Ԫ����������������������αȽϣ����ؽϴ���Ǹ���
 * ���αȽ�����������Ϊ������
 * ʹ����ʱ��������������ֵ
 * ����ʱ������ӡ������̨��
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.print("��������Ҫ�Ƚϵĵ�һ������");// ��ʾ�����һ����
		int a = new Scanner(System.in).nextInt();// �Ӽ��̻�ȡ��������������浽������

		System.out.print("��������Ҫ�Ƚϵĵڶ�������");
		int b = new Scanner(System.in).nextInt();

		System.out.print("��������Ҫ�Ƚϵĵ���������");
		int c = new Scanner(System.in).nextInt();

		int temp = a > b ? a : b;// ���������������бȽϣ�ȡ�ϴ���Ǹ������浽������
		temp = temp > c ? temp : c;// ���ϴ������ʣ�µ������бȽϣ��ٴ�ȡ�ϴ���Ǹ������浽������
		// int d = (a > b ? a : b) > c ? (a > b ? a : b) : c;//�Ķ��Բ�
		System.out.println("���������������ǣ�" + temp);// �����ӡ������������ı���
	}
}
