package day0306;

import java.util.Scanner;

/*
 * ���󣺽׳�
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("����һ��������");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);// �и��������������
		System.out.println(r);
		long s = f1(n);// ֻ������Ҫ��ֵ��������
		System.out.println(s);
	}

	private static long f1(int n) {// ֻ������Ҫ��ֵ
		if (n == 0) {// �����ж��Ƿ�Ϊ0
			return 1;// ֱ�ӷ��ؽ��
		}
		long x = n;// ����һ���������洫���ֵ
		for (int i = n - 1; i >= 1; i--) {// ����ѭ����ʼ����
			x = x * i;// ����
		}
		return x;// ���ؽ��
	}

	private static long f(int n) {// �ж������
		if (n == 0) {// �ж��Ƿ�Ϊ0
			return 1;// ֱ�ӷ��ؽ��
		}
		long x = n;// ����һ���������洫���ֵ
		System.out.print(n + "�Ľ׳�Ϊ��\n" + n + "! = ");// ���������ʾ
		for (int i = n; i > 0; i--) {// ����ѭ����ʼ����
			if (i != 1) {// �ж��Ƿ�Ϊѭ��ĩβ
				x = x * (i - 1);// ����
				System.out.print(i + "*");// �����ӡ�������
			} else {// �����ѭ��ĩβ
				System.out.print(i + " = ");// �����ӡ
			}
		}
		return x;// ���ؽ��
	}
}
