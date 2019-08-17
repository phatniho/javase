package day0204;

import java.util.Scanner;

/*
 * 需求：平年闰年：闰年的条件
 * 能被4整除，并且不能被100整除
 * 能被400整除
 * 分析：
 * 提示输入年份
 * 定义一个变量来保存这个输入的年份
 * 通过取余运算，判断是否能被4，100，400整除
 * 通过对条件的比较，判断是否为闰年
 * 输出打印结果
 */
public class Test1 {

	public static void main(String[] args) {
//		System.out.print("请输入需要判断的年份：");// 提示输入需要判断的年份，必须是整数
//		int y = new Scanner(System.in).nextInt();// 用一个整数变量来获取输入的年份
//
//		String s = "平年";// 将一个字符串变量默认值设置为平年
//		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// 进行闰年条件判断
//			s = "闰年";// 如果满足条件，则将默认字符串的值修改为闰年，不满足则不修改
//		}
//		System.out.println(y + "年是" + s);// 输出打印结果
		/*
		 * if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) { System.out.println(y +
		 * "年是闰年"); }
		 */
		/*
		 * 思考： 
		 * 1.如果输入年份不是整数，如何提高程序的健壮性？ 
		 * 可以使用异常捕捉处理来提示 
		 * 2.如果需要判断一段时间内有多少闰年，每一年是什么年，如何实现？
		 * 可以使用循环语句来进行循环判断
		 */
		// 1.循环判断
		System.out.print("请输入开始判断的年份：");//提示输入起始年份
		int y1 = new Scanner(System.in).nextInt();//获取起始年份

		System.out.print("请输入结束判断的年份：");//提示输入结束的年份
		int y2 = new Scanner(System.in).nextInt();//获取结束年份

		int count = 0;//定义闰年个数计数变量
		for (int i = y1; i <= y2; i++) {//建立循环判断是否为闰年
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {//判断是否为闰年
				System.out.println(i + "年是闰年");//如果是闰年，则输出闰年结果
				count++;//闰年计数器加1
			} else {
				System.out.println(i + "年是平年");//如果不是闰年，则输出是平年结果
			}
		}
		System.out.println("从" + y1 + "年到" + y2 + "年之间，一共有" + count + "个闰年。");//输出结果
	}
}
