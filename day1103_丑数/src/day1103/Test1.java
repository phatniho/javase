package day1103;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * ��������һ���������������ĳ���
 * �������壺ֻ�ܱ�2,3,5����������������ض�Ϊ1
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("������ڼ���������");
		int n = new Scanner(System.in).nextInt();// ��ȡ�����ֵ
		long r = f(n);// ��ȡ����������
		System.out.println(r);// ��ӡ���
	}

	private static long f(int n) {
		// 10 12 16
		// -------------------2
		// 9 12 15 18 24
		// -------------------3
		// 10 15 20 25 30
		// -------------------5
		//
		// r = 1 2 3 4 5 6 8
		//
		// �ȴ���3������
		// ��ʼ����2,3,5
		// ��ͷ���Ƴ���Сֵ
		// ��Сֵ�ֱ��2��3��5��������������
		if (n == 1) {// �ж��Ƿ���Ҫ���һ��
			return 1;// �������ֱ�ӷ���1
		}
		// �½�3������
		LinkedList<Long> list2 = new LinkedList<>();
		LinkedList<Long> list3 = new LinkedList<>();
		LinkedList<Long> list5 = new LinkedList<>();
		// ��ʼ����2��3��5
		list2.add(2l);
		list3.add(3l);
		list5.add(5l);
		// �����ʼֵ
		long r = 0;
		for (int i = 2; i <= n; i++) {// ѭ������
			long a = list2.getFirst();// ȡ��3�������еĵ�һ����
			long b = list3.getFirst();
			long c = list5.getFirst();
			r = Math.min(a, Math.min(b, c));// �ж���Сֵ
			if (r == a) {// ��Сֵ��ȡ����������
				list2.removeFirst();// ȡ����Сֵ
			}
			if (r == b) {
				list3.removeFirst();
			}
			if (r == c) {
				list5.removeFirst();
			}
			list2.add(r * 2);// �ֱ���Ը����ϵ���
			list3.add(r * 3);
			list5.add(r * 5);
		}
		return r;// ���ؽ��
	}
}
