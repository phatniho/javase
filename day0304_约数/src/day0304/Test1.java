package day0304;

import java.util.Scanner;

/*
 * ��������һ�����������������������Լ�������Լ���ĸ���С�ڵ���2���������Ϊ����
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("����һ��������");
		int n = new Scanner(System.in).nextInt();// ��ȡһ�����������浽������

		f(n);// ����ȡ������������f���������в�������
	}

	static void f(int n) {
		if (n == 1) {// �ж��Ƿ�Ϊ1
			System.out.println(n + "�Ȳ���������Ҳ���Ǻ�����");
			return;
		}
		if (n <= 0) {// �ж��Ƿ�Ϊ������
			System.out.println(n + "����һ����������������һ����������");
			return;
		}
		int count = 0;// �����������
		System.out.println("����" + n + "��Լ���У�");// ��ӡ������ʾ��Ϣ
		for (int i = 1; i <= n; i++) {// ����ѭ���ж�
			if (i != n) {// �ж��Ƿ�Ϊ���һ��ѭ��
				if (n % i == 0) {
					System.out.print(i + ",");// ��������������ѭ���������ʽ
					count++;// ����������1
				}
			} else {// �������������ѭ��
				System.out.println(i + "��");// ���һ��ѭ���������ʽ
				count++;// ����������1
			}
		}
		System.out.println("����" + n + "һ����" + count + "��Լ��");// �����ӡ���
		if (count == 2) {// ���ݼ��������ж�Լ�������Ƿ�������������
			System.out.println(n + "�Ǹ�������");// ����������������
		}
	}
}
