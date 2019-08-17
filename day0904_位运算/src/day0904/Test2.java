package day0904;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ��������һ������������������ָ��4�Σ��浽һ�����飬����ϳ��������
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.print("����һ��������");// ��ʾ��Ϣ
		int n = new Scanner(System.in).nextInt();// ��ȡ�����ֵ
		byte[] a = f1(n);// ���÷����ָ����������������浽byte������
		System.out.println(Arrays.toString(a));// ��ӡ���

		int r = f2(a);// ��byte�����е���ƴ�������
		System.out.println(r);// ��ӡ���

	}

	private static int f2(byte[] a) {// ƴ�ӷ���
		int r = 0;// ����һ������
		for (int i = 0, j = 24; i < a.length; i++, j -= 8) {// ѭ������
			r = ((a[i] & 0x000000ff) << j) | r;// ѭ��|����ȡ8λ��ӵ�������
		}
		return r;// ����ƴ�ӽ��
	}

	private static byte[] f1(int n) {// ��ַ���
		byte[] b = new byte[4];// ����byte����
		for (int i = 0, j = 24; i < b.length; i++, j -= 8) {// ѭ������
			b[i] = (byte) (n >> j);// ����ȡ8λ��������
		}
		return b;// ��������
	}
}
