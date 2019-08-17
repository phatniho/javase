package day0302;

import java.util.Scanner;

/*
 * 需求：输入年、月，求这个月的天数
 * 1、3、5、7、8、10、12月有31天，
 * 4、6、9、11月有30天，
 * 闰年2月有29天，平年2月有28天
 * 分析：
 * 从键盘获取输入年月，使用switch语句进行判断
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("年：");
		int y = new Scanner(System.in).nextInt();// 获取键盘输入的年份，并保存到变量中

		System.out.print("月：");
		int m = new Scanner(System.in).nextInt();// 获取键盘输入的月份，并保存到变量中

		f(y, m);// if嵌套方法
		f1(y, m);// if并列方法
	}

	/*
	 * if并列方法，不使用嵌套，直接用return返回错误结果，可以保证程序执行效率
	 */
	static void f1(int y, int m) {
		if (y < 0) {// 判断年份是否有效
			System.out.println("年份输入错误");// 无效则输出错误提示语句
			return;// 返回主函数
		}
		if (m > 12 || m < 1) {// 判断月份是否有效
			System.out.println("月份输入错误");// 无效则输出错误提示语句
			return;// 返回主函数
		}
		int d = 31;// 定义天数默认值
		switch (m) {// 用switch语句进行月份判断
		case 4:// 合并判断4个相同处理条件
		case 6:
		case 9:
		case 11:
			d = 30;// 满足以上4个条件中任意一个时，执行这一条，将默认天数修改为30天
			break;// 修改完成后停止继续判断
		case 2:// 特殊月份条件判断
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// 判断是否为闰年
				d = 29;// 如果是闰年，则修改为29天
			} else {// 如果不是闰年
				d = 28;// 则修改为28天
			}
			break;// 修改完成后停止继续判断
		}
		System.out.println(y + "年" + m + "月有" + d + "天");// 输出打印结果
	}

	/*
	 * if嵌套方法，嵌套层数增加会引起执行效率降低
	 */
	static void f(int y, int m) {
		if (y < 0) {// 判断年份是否为有效年份
			System.out.println("输入年份有误，年份不能为负数！");// 如果不是有效年份，则输出打印提示错误语句
		} else {// 否则年份有效，继续执行
			if (m > 12 || m < 1) {// 判断月份是否有效
				System.out.println("输入月份有误，月份不在有效范围内");// 如果月份为无效月份，则输出打印提示错误语句
			} else {// 否则月份有效，继续执行
				int d = 31;// 同f1()
				switch (m) {
				case 4:
				case 6:
				case 9:
				case 11:
					d = 30;
					break;
				case 2:
					if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
						d = 29;
					} else {
						d = 28;
					}
					break;
				}
				System.out.println(y + "年" + m + "月有" + d + "天");
			}
		}
	}
}
