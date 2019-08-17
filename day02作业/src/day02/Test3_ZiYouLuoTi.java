package day02;

import java.util.Scanner;

/*
 * 需求：
 * 输入时间（秒），求自由落体的距离
 * 输入降落时间（秒）：x
 * x秒降落了xx.xx米
 * 分析：
 * 定义一个变量，保存输入的时间（秒）
 * 根据公式计算这个时间内自由落体的距离，并保存在一个变量中
 * 输出打印结果
 */
public class Test3_ZiYouLuoTi {
	public static void main(String[] args) {
		System.out.print("输入降落时间（秒）：");// 提示输入时间，单位为秒
		double t = new Scanner(System.in).nextDouble();// 从键盘获取输入的时间，并保存到变量中
		double s = 0.5 * 9.8 * t * t;// 计算这个时间降落的距离，并保存到变量中
		System.out.println(t + "秒降落了" + s + "米");// 输出打印结果
	}
}
