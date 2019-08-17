package day11_重写;

import java.util.LinkedList;
import java.util.Scanner;

public class Test03_丑数 {
	public static void main(String[] args) {
		System.out.println("输入求第几个丑数：");
		int i = new Scanner(System.in).nextInt();
		long l = f(i);
		System.out.println(l);
	}

	private static long f(int i) {
		if (i == 1) {
			return 1;
		}
		LinkedList<Long> ll2 = new LinkedList<>();
		LinkedList<Long> ll3 = new LinkedList<>();
		LinkedList<Long> ll5 = new LinkedList<>();

		ll2.add(2l);
		ll3.add(3l);
		ll5.add(5l);

		long r = 0;
		for (int j = 2; j <= i; j++) {
			long l2 = ll2.getFirst();
			long l3 = ll3.getFirst();
			long l5 = ll5.getFirst();
			r = Math.min(l2, Math.min(l3, l5));
			if (r == l2) {
				ll2.removeFirst();
			}
			if (r == l3) {
				ll3.removeFirst();
			}
			if (r == l5) {
				ll5.removeFirst();
			}
			ll2.add(r * 2);
			ll3.add(r * 3);
			ll5.add(r * 5);
		}
		return r;
	}
}
