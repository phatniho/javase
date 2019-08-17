package 冒泡排序;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入随机数组长度");
		int i = new Scanner(System.in).nextInt();
		int[] a = add(i);
		System.out.println(Arrays.toString(a));
		System.out.println("\n-------");
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean b = false;
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
					b = true;
				}
			}
			if (!b) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("\n-------");
	}

	private static int[] add(int i) {
		int[] a = new int[i];
		for (int j = 0; j < a.length; j++) {
			a[j] = new Random().nextInt(1000);
		}
		return a;
	}
}
