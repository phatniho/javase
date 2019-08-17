package day0101;

import java.util.Scanner;

/*
 * 需求：从键盘获取输入年份，判断该年是否为闰年，并输出打印结果。
 * 闰年定义：能被4整除，但不能被100整除。能被400整除
 * 分析：
 * 定义一个变量，用于保存从键盘获取的年份。
 * 使用if判断语句来判断是否满足闰年条件。
 * 输出打印结果
 * 如果输入年份不是有效数字，则做出相应提示。
 */
public class Test1 {
	public static void main(String[] args) {
		/*
		 * System.out.print("请输入年份："); int year = new Scanner(System.in).nextInt();
		 * 
		 * if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		 * System.out.println(year + "是闰年"); } else { System.out.println(year + "不是闰年");
		 * }
		 */
		System.out.print("请输入年份：");// 提示输入年份
		String year = new Scanner(System.in).nextLine();// 定义一个变量获取输入的年份

		try {
			int a = Integer.parseInt(year);// 将输入年份转换为数字参与运算，进行是否为闰年的判断
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {// 判断是否为闰年
				System.out.println(year + "是闰年");
			} else {
				System.out.println(year + "是平年");
			}
		} catch (Exception e) {// 若输入年份不能转换为有效数字，则利用异常捕捉提示错误
			System.out.println("您输入的年份不是一个有效年份");
		}
	}
}
