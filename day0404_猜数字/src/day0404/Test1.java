package day0404;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺲�����
 * �Ѿ�����·һ��[1,1001)��Χ������
 * ��²���������Ǽ�
 * 
 * ��:1
 * С��������
 * ��:1000
 * �󣨼�����
 * ��:455
 * �ԣ�������
 */
public class Test1 {
	public static void main(String[] args) {
		int i = 1 + new Random().nextInt(1000);// ���������[1,1000)
		System.out.println("�Ѿ�����·һ��[1,1001)��Χ������");// ��ӡ��ʾ
		System.out.println("��²���������Ǽ�");

		guess(i);// ���ò����ַ���
	}

	private static void guess(int i) {
		int count = 1;// ��������ֵĴ���������
		while (true) {// ѭ�������ж�
			System.out.print("�£�");
			int b = new Scanner(System.in).nextInt();// ��ȡ�������
			if (i > b) {// �жϴ�С
				System.out.println("С");// ��ӡ��ʾ
				count++;// ��������1
				continue;// ����ѭ��
			}
			if (i < b) {
				System.out.println("��");
				count++;
				continue;
			}
			System.out.println("�в���" + count + "��");// ����������
			break;// ����ѭ��
		}

	}
}
