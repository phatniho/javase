package day0902;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * ��������������飬ÿ�ΰ��س����һ��Ԫ�أ���������Ԫ������
 */
public class Test1 {
	public static void main(String[] args) {
		Number[] a = addArr();// ���÷����������飬�������Ͳ�ȷ���������������
	}

	public static Number[] addArr() {
		Number[] a = new Number[0];// ���������������
		while (true) {// ѭ���������Ԫ��
			System.out.println("���س���ʼ�����������");// ��ʾ���
			new Scanner(System.in).nextLine();// �س�ִ��
			Number n = null;// �½�Ԫ�ض���
			if (Math.random() > 0.5) {// ���ֵѡ��
				n = new Random().nextInt(1000);// ��������
			} else {
				double d = Math.random() * 1000;// ���ɸ�����
				// ���þ�ȷС�����еķ��������ɵ�С�����д���
				d = BigDecimal.valueOf(d).// �����������������뱣��һλ
						setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();//
				n = d;// ���洦���ĸ�����
			}

			int c = binarySearch(a, n);// �Զ�����ֲ��ҷ�����ȡָ��Ԫ���������е�λ��
			if (c < 0) {// �жϷ��صĽǱ��Ƿ�С����
				c = -c - 1;// �����صĽǱ�ֵ
			}
			// �����鸴�Ƶ������飬��������һλ
			a = Arrays.copyOf(a, a.length + 1);
			// ��ԭ����Ӳ���㿪ʼ��Ԫ�������һλ
			System.arraycopy(a, c, a, c + 1, a.length - c - 1);
			a[c] = n;// �����ݷ�������λ��
			System.out.println(Arrays.toString(a));// ��ӡ����
		}
	}

	private static int binarySearch(Number[] a, Number n) {// ���ֲ��ҷ�
		int lo = 0;// ������ͷ�Χ
		int hi = a.length - 1;// ������߷�Χ
		int mid;// �����м䷶Χ
		while (lo <= hi) {// �ж��Ƿ񽻲�
			mid = (lo + hi) / 2;// �����м�ֵ
			if (a[mid].doubleValue() < n.doubleValue()) {// �Ƚ��м�ֵ�봫��ֵ�Ĵ�С
				lo = mid + 1;// ���ֵ��Χ����
			} else if (a[mid].doubleValue() > n.doubleValue()) {
				hi = mid - 1;// ���ֵ��Χ��С
			} else {
				return mid;// ����ҵ����ֵ���򷵻��м�ֵ
			}
		}
		return -(lo + 1);// ���û�ҵ����ֵ���򷵻ؿ��Բ����λ�ü�һ�ĸ���
	}
}
