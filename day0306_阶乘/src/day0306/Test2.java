package day0306;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * ���󣺽׳�
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.print("����һ��������");
		int n = new Scanner(System.in).nextInt();
		String r = f(n);// �и��������������
		System.out.println(r);
	}

	private static String f(int n) {
		if (n == 0) {
			return "1";
		}
		BigInteger i = BigInteger.valueOf(n);
		for (int j = n - 1; j > 0; j--) {
			i = i.multiply(BigInteger.valueOf(j));
		}
		return i.toString();
	}

}
