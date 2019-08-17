package day0904;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 需求：输入一个整数，将这个整数分割成4段，存到一个数组，再组合成这个整数
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.print("输入一个整数：");// 提示信息
		int n = new Scanner(System.in).nextInt();// 获取输入的值
		byte[] a = f1(n);// 调用方法分割这个数，将结果保存到byte数组中
		System.out.println(Arrays.toString(a));// 打印结果

		int r = f2(a);// 将byte数组中的数拼回这个数
		System.out.println(r);// 打印结果

	}

	private static int f2(byte[] a) {// 拼接方法
		int r = 0;// 定义一个变量
		for (int i = 0, j = 24; i < a.length; i++, j -= 8) {// 循环遍历
			r = ((a[i] & 0x000000ff) << j) | r;// 循环|依次取8位添加到变量中
		}
		return r;// 返回拼接结果
	}

	private static byte[] f1(int n) {// 拆分方法
		byte[] b = new byte[4];// 定义byte数组
		for (int i = 0, j = 24; i < b.length; i++, j -= 8) {// 循环遍历
			b[i] = (byte) (n >> j);// 依次取8位放入数组
		}
		return b;// 返回数组
	}
}
