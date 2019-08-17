package day04;

import java.util.Scanner;

/*
 * 需求：输入年、月，求这个月的天数
 * 1、3、5、7、8、10、12月有31天，
 * 4、6、9、11月有30天，
 * 闰年2月有29天，平年2月有28天
 * 分析：
 * 从键盘获取输入年月，使用switch语句进行判断
 */
public class Test4_Days {
	public static void main(String[] args) {
		System.out.print("请输入需要判断的年份：");
		int y = new Scanner(System.in).nextInt();// 获取输入的年份

		System.out.print("请输入需要判断的月份：");
		int m = new Scanner(System.in).nextInt();// 获取输入的月份

		days(y, m);// 调用方法计算判断
	}

	private static void days(int y, int m) {
		if (y < 0) {// 判断年份是否为有效范围
			System.out.println("年份输入错误，不能为负数");// 若不满足则提示错误
			return;// 结束方法
		}
		if (m > 12 || m < 1) {// 判断月份是否为有效范围
			System.out.println("月份输入错误，不在有效范围");// 若不满足则提示错误
			return;// 结束方法
		}
		int d = 31;// 将天数默认值设为31，可以省掉判断大月的过程
		switch (m) {// 用switch语句判断月份
		case 4:// 小月份，穿透执行
		case 6:
		case 9:
		case 11:
			d = 30;// 将天数修改为30天
			break;// 结束循环
		case 2:// 特殊月份的判断
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// 判断是否为闰年
				d = 29;// 是闰年则将天数修改为29天
			} else {// 如果不是闰年
				d = 28;// 则将天数修改为28天
			}
			break;// 结束循环
		}
		System.out.println(y + "年" + m + "月有" + d + "天");// 输出打印结果
	}
}
