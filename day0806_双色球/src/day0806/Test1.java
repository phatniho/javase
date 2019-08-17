package day0806;

import java.util.Arrays;
import java.util.Random;

/*
 * ����˫ɫ�����ɣ�����ֵ6������Χ1-33���ظ�������ֵһ������Χ1-16
 */
public class Test1 {
	public static void main(String[] args) {
		int[] r = add(33);// ��������
		int[] b = add(16);// ��������

		System.out.println(Arrays.toString(r));// ��ӡ��������
		System.out.println(Arrays.toString(b));

		int[] red = getRed(r);// ȡ���򣬴浽һ��������
		int blue = getBlue(b);// ȡ����
		System.out.println("����");
		System.out.println(Arrays.toString(red));// ��ӡȡ���ĺ�������
		System.out.println("����");
		System.out.println(blue);// ��ӡȡ��������
	}

	private static int[] getRed(int[] r) {// ȡ���򷽷�
		for (int i = 0; i < 6; i++) {// ���峤�ȣ���ʼ����
			int j = i + new Random().nextInt(33 - i);// �����
			int t = r[i];// ����������λ�������λ�ý���
			r[i] = r[j];
			r[j] = t;
		}
		int[] a = Arrays.copyOf(r, 6);// ����ǰ6��ֵ��������
		return a;// ����������
	}

	private static int getBlue(int[] b) {
		return b[new Random().nextInt(16)];// ����������������е�һ��ֵ
	}

	private static int[] add(int i) {// ������ĳ����������
		int[] a = new int[i];// �½�����
		for (int j = 0; j < a.length; j++) {// ѭ������
			a[j] = j + 1;// ����ÿ��ֵ
		}
		return a;// �������ɵ�����
	}
}
