package day0305;

import java.util.Scanner;

/*
 * ���󣺼���ͬ��
 * ����ͬ��������35ͷ������94�ţ����ø���ֻ��
 * ��������ٷ����
 * ���ù�35ֻ������0��ʼ�㣬�ô�35��ʼ�㡣
 * �ֱ���ÿһ����ϵĽ��ǲ���94ֻ������ǣ��������ӡ�����
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("������ͷ������:");
		int h = new Scanner(System.in).nextInt();// ��ȡͷ������
		System.out.print("������ŵ�����:");
		int f = new Scanner(System.in).nextInt();// ��ȡ�ŵ�����
		f(h, f);// ����˫����������������
		f();// �ղη�������
	}

	private static void f(int h, int f) {// ˫��������
		int count = 0;// ���������
		for (int j = 0, t = h; j <= h; j++, t--) {// ѭ���ж�
			int i = j * 2 + t * 4;// ͳ��ѭ����������ϵĽŵ�����
			if (i == f) {// �ж��Ƿ����Ҫ�������
				System.out.println("����" + j + "ֻ������" + t + "ֻ��");// �����ӡ����Ҫ�������
				count++;// ��������1
			}
		}
		if (count != 0) {// �жϼ������Ƿ�Ϊ��
			System.out.println("һ����" + count + "���������������");// �����Ϊ�㣬�������ϵ�����
		} else {// �������������Ϊ0
			System.out.println("û��������������ϡ�");// û���������������
		}
	}

	private static void f() {// �ղ�������
		f(35, 94);// ֱ�ӵ���˫���������������ض�����
	}
}
