package day0502;

import java.util.Arrays;
import java.util.Random;

/*
 * ��������һ��������飬�ٻ�ȡ��Сֵ�ĽǱ�
 */
public class Test2 {
	public static void main(String[] args) {
		// ����suiJi()������һ���������飬�浽����a
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));

		// �����鴫�ݵ�f()��������Сֵ��λ���±�
		int min = f(a);// ����Сֵ�����������ص�������
		System.out.println("��Сֵ�±�Ϊ��" + min);// ��ӡ���
	}

	private static int f(int[] a) {// ����Сֵ����
		int m = 0;// ������СֵĬ�ϽǱ����
		for (int i = 1; i < a.length; i++) {// ѭ������
			// m = a[i] < a[m] ? i : m;//��Ԫ������жϻ�ȡ��Сֵ�Ǳ�
			if (a[i] < a[m]) {// �жϽ�Сֵ�Ǳ�
				m = i;// ����Сֵ�Ǳ걣�浽����
			}
		}
		return m;// ������Сֵ�Ǳ�
	}

	private static int[] suiJi() {// �������һ������
		// �½�int[]���飬����10
		// a[] = [0,0,0,0,0,0,0,0,0,0]
		// ��������100���������
		// a[] = [47,33,78,23,43,77,32,1,99,40]

		int[] a = new int[10];// �½����飬���趨����
		for (int i = 0; i < a.length; i++) {// ��������
			a[i] = new Random().nextInt(100);// �����ֵ���뵽������
		}
		return a;// ��������
	}
}
