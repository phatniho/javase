package test08有序数组并归;

import java.util.Arrays;
import java.util.Random;

/*
 * 有序数组的并归
 * 两个有序数组，合并成一个有序数组
 * [1,2,2,4,5]
 * j
 * [2,2,4,5,7,7,8,9]
 * k
 * [1 2 2 2 2 4 4 5 5                  ]
 * i
 * j和k的较小值放入i位置，对应下标递增
 * j越界，复制k后面的值
 * k越界，复制j后面的值
 */
public class Test1 {
	public static void main(String[] args) {
//		System.out.print("输入第一个数组的长度：");
//		int a1 = new Scanner(System.in).nextInt();
		int a1 = 3 + new Random().nextInt(5);
		int[] a = addArr(a1);
//		System.out.print("输入第二个数组的长度：");
//		int a2 = new Scanner(System.in).nextInt();
		int a2 = 4 + new Random().nextInt(5);
		int[] b = addArr(a2);

		System.out.println("第一个数组是：");
		System.out.println(Arrays.toString(a));
		System.out.println("第二个数组是：");
		System.out.println(Arrays.toString(b));

		int[] c = sort(a, b);
		System.out.println("对两个数组进行并归后的结果是：");
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
		int[] c = new int[a.length + b.length];// 新建数组，长度为两个数组之和
		for (int i = 0, j = 0, k = 0; i < c.length; i++) {// 循环遍历
			if (j >= a.length) {// 判断角标是否超出范围
				// 超出范围则直接复制剩余元素到新数组
				System.arraycopy(b, k, c, i, b.length - k);
				break;
			}
			if (k >= b.length) {
				System.arraycopy(a, j, c, i, a.length - j);
				break;
			}
			if (a[j] < b[k]) {// 判断两个角标对应值的大小
				c[i] = a[j++];// 小的放到新数组中，然后角标递增
			} else {
				c[i] = b[k++];
			}
		}
		return c;// 返回新数组
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
