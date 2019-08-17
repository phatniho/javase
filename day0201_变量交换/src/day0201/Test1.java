package day0201;

import java.util.Scanner;

/*
 * 需求：输入两个整数，保存到两个变量，交换两个变量的值
 * 分析：
 * 首先提示从键盘上输入两个整数
 * 定义两个变量，用来保存着两个整数
 * 输出打印一下需要交换的两个数的值
 * 定义临时变量，保存a的值
 * 将b的值赋值给a
 * 将临时变量保存的a的值赋值给b
 * 交换完成，输出打印结果
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("请输入第一个整数a=");// 提示输入第一个整数a
		int a = new Scanner(System.in).nextInt();// 定义变量a保存输入的第一个整数a

		System.out.print("请输入第二个整数b=");// 提示输入第二个整数b
		int b = new Scanner(System.in).nextInt();// 定义变量b保存输入的第二个整数b

		System.out.println("需要交换的两个数的值为：\na=" + a + "\nb=" + b);// 输出打印交换前两个数的值
		System.out.println("交换开始……");// 提示交换开始

		/*
		 * 正常交换，定义第三方变量。
		 * int temp = a;// 定义临时变量，用来保存a的值
		 * a = b;// 将b的值赋值给a
		 * b = temp;// 将临时变量保存的a的值赋值给b
		 */

		// 不定义第三方变量的交换方式：一个数连续异或（^）两次同一个数，得到的结果还是这个数（加密解密原理）
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("交换完成！交换后两个数的值为：\na=" + a + "\nb=" + b);// 交换完成，打印结果
	}
}
