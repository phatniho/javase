package day04;

import java.util.Scanner;

/*
 * ���󣺽׳�
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public class Test6_JX {
	public static void main(String[] args) {
		System.out.print("������һ����Ҫ�׳˵�����");
		int i = new Scanner(System.in).nextInt();// ��ȡ��Ҫ�׳˼������

		long n = f(i);// ���ý׳˼��㷽�����м��㣬����������ر��浽������
		System.out.println(i + "�Ľ׳˽����" + n);// �����ӡ���
	}

	private static long f(int i) {// �����������׳�
		if (i == 0) {// ����ֵ�ж�
			return 1;// 0�Ľ׳�=1
		}
		long f = i;// ����������������ֵ
		for (int j = i - 1; j >= 1; j--) {// ѭ���׳�
			f = f * j;// ѭ���׳�
		}
		return f;// ���ؽ��
	}
}
