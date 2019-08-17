package day03;

import java.util.Scanner;

/*
 * ����������ݣ��·ݣ��ж���һ���������ж�����
 * ������
 * ʹ��switch���ʵ��
 */
public class Test1_Days {
	public static void main(String[] args) {
		System.out.print("��������ݣ�");
		int y = new Scanner(System.in).nextInt();// ��ȡ��������

		System.out.print("�������·ݣ�");
		int m = new Scanner(System.in).nextInt();// ��ȡ������·�

		days(y, m);// ���÷��������ж�
	}

	private static void days(int y, int m) {// �ж������ж�����ķ���
		if (y < 0) {// �ж����Ƿ�Ϊ��Ч����
			System.out.println("����������");// ������벻����Ч��ݣ�����ʾ����
			return;// �����ֱ�ӷ���
		}
		if (m > 12 || m < 1) {// �ж��·��Ƿ�Ϊ��Ч�·ݷ�Χ
			System.out.println("�·��������");// ���������Ч�·ݷ�Χ������ʾ����
			return;// �����ֱ�ӷ���
		}
		int day = 31;// ��������Ĭ��ֵΪ31�����Բ����ж��·�Ϊ�������
		switch (m) {// ���·���������ж�
		case 4:// С��ִ�д�͸
		case 6:
		case 9:
		case 11:
			day = 30;// ����������С�µ������޸�Ϊ30��
			break;// �����ж�
		case 2:// �����·ݵ��ж�
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// �ж��Ƿ�Ϊ����
				day = 29;// ��������꣬�����·ݵ������޸�Ϊ29��
			} else {// �����������
				day = 28;// �����޸�Ϊ28��
			}
			break;// �����ж�
		}
		System.out.println(y + "��" + m + "����" + day + "��");// �����ӡ���
	}
}
