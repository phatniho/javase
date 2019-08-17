package day04;

import java.util.Scanner;

/*
 * �������������������������������Լ������С������ 
 * 24 1,2,3,4,6,8,12,24 
 * 16 1,2,4,8,16 
 * 48 
 * ������
 * ���Լ������Сֵ��ǰ��
 * ��С���������Ӵ�ֵ���һֱ�ۼӴ�ֵ
 * 
 */
public class Test1_MaxMin {
	public static void main(String[] args) {
		System.out.print("�������һ������");
		int a = new Scanner(System.in).nextInt();// ��ȡ����ĵ�һ����

		System.out.print("������ڶ�������");
		int b = new Scanner(System.in).nextInt();// ��ȡ����ĵڶ�����

		int x = max(a, b);// ���������Լ��������������浽������
		int y = min(a, b);// ��������С������������������浽������

		System.out.println(a + "��" + b + "�����������Լ��Ϊ��" + x);// �����ӡ���
		System.out.println(a + "��" + b + "����������С������Ϊ��" + y);// �����ӡ���

	}

	private static int max(int a, int b) {// �����Լ������
		if (a == b) {// �ж��������Ƿ���ȣ������ȣ����Լ������С��������Ϊ����������ֵ
			return a;// ����������������һ����ֵ
		}
		int x = 0;// ��������������������Լ����ֵ
		int big = a > b ? a : b;// ȡ�������нϴ�������浽������
		int small = a < b ? a : b;// ȡ�������н�С�������浽������
		for (int i = small; i >= 1; i--) {// ����ѭ�������ж�
			if (small % i == 0 && big % i == 0) {
				// ��С��ֵ��ʼ�жϣ�����ܱ�Сֵ���������ж��ܷ񱻴�ֵ����
				x = i;// ��������ʱ��i��ֵ����x
				break;// ����ѭ��
			}
		}
		return x;// ����x��ֵ
	}

	private static int min(int a, int b) {
		if (a == b) {// �ж��������Ƿ���ȣ������ȣ����Լ������С��������Ϊ����������ֵ
			return a;// ����������������һ����ֵ
		}
		int y = 0;// �������������������С��������ֵ
		int big = a > b ? a : b;// ȡ�������нϴ�������浽������
		int small = a < b ? a : b;// ȡ�������н�С�������浽������
//		for (int i = big; i <= a * b; i++) {//�����жϣ�Ч�ʵ�
//			if (i % big == 0 && i % small == 0) {
//				y = i;
//				break;
//			}
//		}
		for (int i = 1; i <= small; i++) {// ����ѭ�������ж�
			if ((big * i) % small == 0) {// �Ӵ�ֵ��ʼ������ۼӽ������Сֵ�����ж�
				y = big * i;// ����������ֵ����y
				break;// ����ѭ��
			}
		}
		return y;// ���ؽ��
	}
}
