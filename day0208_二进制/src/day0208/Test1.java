package day0208;

import java.util.Scanner;

/*
 * 需求：二进制
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n------------");
		f1();
		System.out.println("\n------------");
		f2();
		System.out.println("\n------------");
		f3();
	}

	static void f1() {
		System.out.println(0b1);
		System.out.println(0b10);
		System.out.println(0b11);
		System.out.println(0b100);
		System.out.println(0b101);
		System.out.println(0b110);
		System.out.println(0b111);
		System.out.println(0b1000);
	}

	static void f2() {
		System.out.print("输入整数：");
		int a = new Scanner(System.in).nextInt();
		// 整数用2进制显示出来
		// 把整数变成二进制格式的字符串
		System.out.println(Integer.toBinaryString(a));
	}

	static void f3() {
		System.out.println(0b1);// 1,2的0次方
		System.out.println(0b10);// 2,2的1次方
		System.out.println(0b100);// 4,2的2次方
		System.out.println(0b1000);// 8,2的3次方
		System.out.println(0b10000);// 16,2的4次方
		System.out.println(0b100000);// 32,2的5次方
		System.out.println(0b1000000);// 64,2的6次方
		System.out.println(0b10000000);// 128,2的7次方
		System.out.println(0b100000000);// 256,2的8次方
		System.out.println(0b1000000000);// 512,2的9次方
		System.out.println(0b10000000000);// 1024,2的10次方
		System.out.println(0b100000000000);// 2048,2的11次方
		System.out.println(0b1000000000000);// 4096,2的12次方
		System.out.println(0b10000000000000);// 8192,2的13次方
	}
}
