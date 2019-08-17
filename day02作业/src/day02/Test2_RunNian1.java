package day02;

import java.util.Scanner;

/*
 * 需求：
 * 获取输入的年份，判断这一年是平年还是闰年
 * 闰年的判断条件：年份能被4整除，但不能被100整除；或者能被400整除
 * 分析：
 * 获取输入的年份，保存到变量中
 * 定义一个字符串变量，默认值为平年
 * 使用闰年的判断条件，判断这一年是否为闰年，如果是闰年，则将默认值中的平年修改为闰年
 * 输出打印结果
 */
public class Test2_RunNian1 {
	public static void main(String[] args) {
		System.out.print("请输入需要判断的年份：");// 提示输入需要判断的年份
		int year = new Scanner(System.in).nextInt();// 定义变量获取输入的年份，并保存

		String y = "平年";// 定义变量，默认值为平年
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {// 进行是否是闰年的判断
			y = "闰年";// 如果是闰年，则将默认值修改为闰年，如果不是则跳过
		}
		System.out.println(year + "年是" + y);// 输出打印结果
	}
}
