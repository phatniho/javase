package day0101;

import java.util.Scanner;

/*
 * 需求：根据输入的圆半径，求圆的周长和面积
 * 分析：
 * 获取键盘输入的半径
 * 根据相关公式进行计算，周长=2*π*r，面积=π*r*r
 * 输出打印结果
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.print("请输入需要计算的圆半径r=");// 提示输入需要计算的圆的半径
		double r = new Scanner(System.in).nextDouble();// 从键盘获取输入的圆的半径

		double pi = 3.14;// 定义圆周率的数值
		double l = 2 * pi * r;// 计算圆的周长，并保存到一个变量中
		double s = pi * r * r;// 计算圆的面积，并保存到另一个变量中
		System.out.println("半径为" + r + "的圆，周长为" + l + ",面积为" + s);// 输出打印结果
	}
}
