package day0904;

import java.util.Scanner;

/*
 * 需求：位运算
 * >>右移（带符号）>>>右移（不带符号）
 * <<左移
 * 十六进制f等于二进制0000
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数：");// 提示信息
		int n = new Scanner(System.in).nextInt();// 获取输入的十进制数
		n = n << 24 >>> 24;// 先左移再无符号右移，获取最后8位
		System.out.println(Integer.toBinaryString(n));// 打印最后8位的二进制表现形式

		System.out.print("输入整数：");// 提示信息
		n = new Scanner(System.in).nextInt();// 获取输入的十进制数
		n = n & 0x000000ff;// &11111111可以取最后8位
		System.out.println(Integer.toBinaryString(n));// 打印最后8位的二进制表现形式

	}
}
