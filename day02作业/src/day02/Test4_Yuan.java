package day02;

import java.util.Scanner;

/*
 * 需求：
 * 根据输入的圆半径，计算圆的周长和面积
 * 分析：
 * 定义一个变量，保存输入的圆半径
 * 根据公式计算圆的周长和面积
 * 周长：l=2*pi*r
 * 面积：s=pi*r*r
 * 输出打印结果
 */
public class Test4_Yuan {
	public static void main(String[] args) {
		System.out.print("请输入需要计算的圆的半径米：");// 提示输入需要计算的圆的半径，单位为米
		double r = new Scanner(System.in).nextDouble();// 定义一个变量，保存输入的半径
		double pi = 3.14;// 定义一个变量，保存圆周率
		double l = 2 * pi * r;// 根据输入的半径和定义的圆周率，计算圆的周长
		double s = pi * r * r;// 根据输入的半径和定义的圆周率，计算圆的面积
		System.out.println("您输入的圆半径为" + r + "米，周长为" + l + "米，面积为" + s + "平方米");// 输出打印结果
	}
}
