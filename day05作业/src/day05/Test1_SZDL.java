package day05;

import java.util.Arrays;
import java.util.Random;

/*
 * �����½�һ�����飬��[1,2,3,4,5,6����]
 * ������˳����д���
 * 	iѭ����������
 * 	�����λһ��jλ��
 * 	i��jλ�õ�ֵ����
 */

public class Test1_SZDL {
	public static void main(String[] args) {

		int[] a = addArr(10);// ���÷����½����飬�����浽���������

		System.out.println("����˳��ǰΪ��\n" + Arrays.toString(a));// ��������

		daLuan(a);// ���÷�����������

		System.out.println("����˳���Ϊ��\n" + Arrays.toString(a));// ��������
	}

	private static int[] addArr(int x) {// �½����鷽��
		int[] a = new int[x];// �½����鲢�������鳤��
		for (int i = 0; i < a.length; i++) {// ��������
			a[i] = i + 1;// Ϊ����ָ���Ǳ����θ�ֵ
		}
		return a;// ��������
	}

	private static void daLuan(int[] a) {// ��������Ԫ��˳�򷽷�
		for (int i = 0; i < a.length; i++) {// ��������
			int j = new Random().nextInt(a.length);// �������λ��
			int t = a[i];// ������ÿ��λ�������λ��Ԫ�ص�ֵ����λ��
			a[i] = a[j];
			a[j] = t;
		}
	}
}
