package test07随机生成有序数组;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Number[] a = addArr();
	}

	private static Number[] addArr() {
		Number[] a = new Number[0];
		while (true) {
			System.out.println("按回车开始随机生成数字");
			new Scanner(System.in).nextLine();

			double d = Math.random();
			Number n = null;
			if (d > 0.5) {
				double s = Math.random() * 100;
				n = BigDecimal.valueOf(s).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
			} else {
				n = new Random().nextInt(100);
			}
			int c = binarySearch(a, n);
			if (c < 0) {
				c = -c - 1;
			}
			a = Arrays.copyOf(a, a.length + 1);
			System.arraycopy(a, c, a, c + 1, a.length - c - 1);
			a[c] = n;
			System.out.println(Arrays.toString(a));
		}
	}

	private static int binarySearch(Number[] a, Number n) {
		int lo = 0;
		int hi = a.length - 1;
		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (a[mid].doubleValue() < n.doubleValue()) {
				lo = mid + 1;
			} else if (a[mid].doubleValue() > n.doubleValue()) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -(lo + 1);
	}
}
