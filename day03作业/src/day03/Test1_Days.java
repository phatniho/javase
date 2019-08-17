package day03;

import java.util.Scanner;

/*
 * 需求：输入年份，月份，判断这一年的这个月有多少天
 * 分析：
 * 使用switch语句实现
 */
public class Test1_Days {
	public static void main(String[] args) {
		System.out.print("请输入年份：");
		int y = new Scanner(System.in).nextInt();// 获取输入的年份

		System.out.print("请输入月份：");
		int m = new Scanner(System.in).nextInt();// 获取输入的月份

		days(y, m);// 调用方法进行判断
	}

	private static void days(int y, int m) {// 判断年月有多少天的方法
		if (y < 0) {// 判断年是否为有效数字
			System.out.println("年份输入错误");// 如果输入不是有效年份，则提示错误
			return;// 错误后直接返回
		}
		if (m > 12 || m < 1) {// 判断月份是否为有效月份范围
			System.out.println("月份输入错误");// 如果不是有效月份范围，则提示错误
			return;// 错误后直接返回
		}
		int day = 31;// 设置天数默认值为31，可以不用判断月份为大的天数
		switch (m) {// 将月份输入进行判断
		case 4:// 小月执行穿透
		case 6:
		case 9:
		case 11:
			day = 30;// 满足条件将小月的天数修改为30天
			break;// 跳出判断
		case 2:// 特殊月份的判断
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// 判断是否为闰年
				day = 29;// 如果是闰年，特殊月份的天数修改为29天
			} else {// 如果不是闰年
				day = 28;// 天数修改为28天
			}
			break;// 跳出判断
		}
		System.out.println(y + "年" + m + "月有" + day + "天");// 输出打印结果
	}
}
