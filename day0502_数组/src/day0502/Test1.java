package day0502;

import java.util.Arrays;

/*
 * �������������ϰ
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n----------------");
		f1();
		System.out.println("\n----------------");
		f2();
		System.out.println("\n----------------");
		f3();
	}

	private static void f1() {

		// ���½�[]String[],����5
		// �ٰ������ַ���浽����a
		// a = [ null , null , null , null , null ]
		// ���±�3λ�÷���"abc"

		String[] a = new String[5];// �½�ָ���������͵�����
		// Arrays.toString(a);�������е����ݣ����ӳ��ַ���
		System.out.println(Arrays.toString(a));// ������ӡ
		a[3] = "abc";// ��ָ��λ���޸�Ϊ�ض�ֵ
		System.out.println(Arrays.toString(a));// ������ӡ
	}

	private static void f2() {
		int[] a = { 6, 2, 7, 3, 7, 3, 1, 5 };// �½����飬ֱ����������Ԫ��
		System.out.println(Arrays.toString(a));// ���������ӡ
		a = new int[] { 5, 6, 3, 7, 2, 8, 3, 8, 9 };// ����������ָ����һ������
		System.out.println(Arrays.toString(a));// ���������ӡ
	}

	private static void f3() {
		int[] a = new int[5];// �½�ָ����������
		a[2] = 324;// ��ָ��λ���޸�Ϊ�ض�ֵ
		System.out.println(a[2]);// ֱ�Ӵ�ӡָ��λ��
		System.out.println(a[2] * 2);// ָ��λ��ֱ�Ӳ������㲢��ӡ
		a[2]++;// ָ��λ�ý�����������
		System.out.println(a[2]);// ��ӡ���

//		����2��3λ�õ�ֵ
		System.out.println(Arrays.toString(a));// ������ӡ����
		int temp = a[2];// ����λ��
		a[2] = a[3];
		a[3] = temp;
		System.out.println(Arrays.toString(a));// ������ӡ����
	}
}
