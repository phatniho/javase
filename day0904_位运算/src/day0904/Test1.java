package day0904;

import java.util.Scanner;

/*
 * ����λ����
 * >>���ƣ������ţ�>>>���ƣ��������ţ�
 * <<����
 * ʮ������f���ڶ�����0000
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������");// ��ʾ��Ϣ
		int n = new Scanner(System.in).nextInt();// ��ȡ�����ʮ������
		n = n << 24 >>> 24;// ���������޷������ƣ���ȡ���8λ
		System.out.println(Integer.toBinaryString(n));// ��ӡ���8λ�Ķ����Ʊ�����ʽ

		System.out.print("����������");// ��ʾ��Ϣ
		n = new Scanner(System.in).nextInt();// ��ȡ�����ʮ������
		n = n & 0x000000ff;// &11111111����ȡ���8λ
		System.out.println(Integer.toBinaryString(n));// ��ӡ���8λ�Ķ����Ʊ�����ʽ

	}
}
