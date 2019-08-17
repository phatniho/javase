package day0704;

import java.util.Arrays;
import java.util.Random;

/*
 * ����ð������
 */
public class Test1 {
	public static void main(String[] args) {
		// ���һ�������������
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("------------------");

		sort(a);

		System.out.println("------------------");
		System.out.println(Arrays.toString(a));

	}

	private static int[] suiJi() {
		int n = 5 + new Random().nextInt(6);// ����һ��5+[0,6)��Χ�������浽����n
		int[] a = new int[n];// �½�int[] ����a������n
		for (int i = 0; i < a.length; i++) {// ��������
			a[i] = new Random().nextInt(100);// ����100�ڵ��������
		}
		return a;// ��������a
	}

	private static void sort(int[] a) {
		// ð�������ڲ�ѭ�������ã��ѽ�Сֵ��ǰ��������Сֵ���ձ�������iλ��
		for (int i = 0; i < a.length; i++) {// ��ͷ��β�������飬���ѭ��
			boolean flag = false;// ����������
			for (int j = a.length - 1; j > i; j--) {// ��β��ͷ�������飬�ڲ�ѭ��
				if (a[j] < a[j - 1]) {// �ж���������Ԫ�ش�С
					int t = a[j];// ��������н���
					a[j] = a[j - 1];
					a[j - 1] = t;
					flag = true;// ��������˽������򽫽�������޸�
				}
			}
			if (!flag) {// �ж��Ƿ�������
				break;// ���û�з�����������˵��������ɣ���������
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
