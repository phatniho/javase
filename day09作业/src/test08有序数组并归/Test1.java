package test08�������鲢��;

import java.util.Arrays;
import java.util.Random;

/*
 * ��������Ĳ���
 * �����������飬�ϲ���һ����������
 * [1,2,2,4,5]
 * j
 * [2,2,4,5,7,7,8,9]
 * k
 * [1 2 2 2 2 4 4 5 5                  ]
 * i
 * j��k�Ľ�Сֵ����iλ�ã���Ӧ�±����
 * jԽ�磬����k�����ֵ
 * kԽ�磬����j�����ֵ
 */
public class Test1 {
	public static void main(String[] args) {
//		System.out.print("�����һ������ĳ��ȣ�");
//		int a1 = new Scanner(System.in).nextInt();
		int a1 = 3 + new Random().nextInt(5);
		int[] a = addArr(a1);
//		System.out.print("����ڶ�������ĳ��ȣ�");
//		int a2 = new Scanner(System.in).nextInt();
		int a2 = 4 + new Random().nextInt(5);
		int[] b = addArr(a2);

		System.out.println("��һ�������ǣ�");
		System.out.println(Arrays.toString(a));
		System.out.println("�ڶ��������ǣ�");
		System.out.println(Arrays.toString(b));

		int[] c = sort(a, b);
		System.out.println("������������в����Ľ���ǣ�");
		System.out.println(Arrays.toString(c));

	}

	private static int[] addArr(int a1) {
		int[] a = new int[a1];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(10);
		}
		Arrays.sort(a);
		return a;
	}

	private static int[] sort(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];// �½����飬����Ϊ��������֮��
		for (int i = 0, j = 0, k = 0; i < c.length; i++) {// ѭ������
			if (j >= a.length) {// �жϽǱ��Ƿ񳬳���Χ
				// ������Χ��ֱ�Ӹ���ʣ��Ԫ�ص�������
				System.arraycopy(b, k, c, i, b.length - k);
				break;
			}
			if (k >= b.length) {
				System.arraycopy(a, j, c, i, a.length - j);
				break;
			}
			if (a[j] < b[k]) {// �ж������Ǳ��Ӧֵ�Ĵ�С
				c[i] = a[j++];// С�ķŵ��������У�Ȼ��Ǳ����
			} else {
				c[i] = b[k++];
			}
		}
		return c;// ����������
//		int[] c = a;
//		int i = 0;
//		while (true) {
//			if (i >= b.length) {
//				break;
//			}
//			int n = binarySearch(c, b[i]);
//			if (n < 0) {
//				n = -n - 1;
//			}
//			c = Arrays.copyOf(c, c.length + 1);
//			System.arraycopy(c, n, c, n + 1, c.length - n - 1);
//			c[n] = b[i];
//			i++;
//		}
//		return c;
	}

	private static int binarySearch(int[] c, int i) {
		int lo = 0;
		int hi = c.length - 1;
		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (c[mid] < i) {
				lo = mid + 1;
			} else if (c[mid] > i) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -(lo + 1);
	}
}
