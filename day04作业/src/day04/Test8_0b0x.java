package day04;

import java.util.Scanner;

/*
 * ������������ƻ�ʮ�����ƣ���ʾ10���Ƶ�ֵ
 * 0b  ��ͷΪ������
 * 0x  ��ͷΪʮ������
 * Ҫȡ����ͷ֮����ַ���������ת��
 * ѭ�����룬ֱ������q�˳�
 * ������
 * ��Ҫ�õ��Ĺ��ߣ�
 * �ַ����Ƚϣ�s.equals("��Ҫ�Ƚϵ��ַ���")������true����false
 * ��Сдת����s.toLowerCase();s.toUpperCase();
 * ��ȡ�Ӵ���s.substring(�Ǳ��);
 * �ж��ֶο�ͷ��s.startsWith("�ַ���");
 * ����ת����Integer.parseInt(��Ҫת�����ַ��������ض�����ת��Ϊʮ����);
 */
public class Test8_0b0x {
	public static void main(String[] args) {
		while (true) {// ѭ������
			System.out.print("����һ�������ƻ�ʮ����������");
			String s = new Scanner(System.in).nextLine();// ��ȡ������ַ���

			if (s.equals("Q") || s.equals("q")) {// �ж��Ƿ�Ϊ�������
				System.out.println("��������");// ����ǽ�����ǣ�����ʾ��������
				break;// ����ѭ������������
			}
			if (f(s) == -1) {// �ж���������ݾ�ת�����Ƿ���Ч
				System.out.println("�����������������");// ��������Ч����ʾ������������
				continue;// ����ִ��ѭ������������
			} else {
				long x = f(s);// ������Ч�򷵻���Чֵ
				System.out.println(s + "��ʮ������" + x);// �����ӡ���
			}
		}
	}

	private static long f(String s) {// ����ת������
		String m = s.toLowerCase();// ��������ַ����е���ĸȫ����ΪСд
		String n = m.substring(2);// ����Ч����λȡ�Ӵ�
		long l = -1;// ���巵��ֵ������Ĭ��ֵΪ-1
		if (m.startsWith("0b")) {// �ж��Ƿ�Ϊ2���ƿ�ͷ
			l = Integer.parseInt(n, 2);// �����ݰ�2����ת���󱣴�
		} else if (m.startsWith("0x")) {// �ж��Ƿ�Ϊ16���ƿ�ͷ
			l = Integer.parseInt(n, 16);// �����ݰ�16����ת���󱣴�
		} else {
			l = -1;// ������������򷵻�-1
		}
		return l;// ����������
	}
}
