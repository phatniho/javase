package day02;

import java.util.Scanner;

/*
 * 需求：
 * 闰年判断进阶
 * 根据输入的数据，判断是否为有效年份，如果不是有效年份则提示年份错误
 * 可以由用户决定是否判断一段时间内所有的闰年
 * 分析：
 * 提示输入年份，并保存到变量中
 * 保存完成后，提示用户是否还要继续输入
 * 如果继续输入则判断这一个阶段内所有的年份是否为闰年，并判断后输入的一年不能比之前输入的年份小
 * 如果不继续输入，则判断输入的这一年是否为闰年
 * 判断输入的年份是否为有效的年份，如不是有效数字，则提示年份输入错误
 * 按区别输出打印结果
 */
public class Test5_RunNian2 {
	public static void main(String[] args) {
		System.out.print("请输入需要判断的年份：");// 提示输入需要判断的年份
		String y1 = new Scanner(System.in).nextLine();// 定义变量获取这个年份字符串

		try {// 异常捕捉，如果输入的字符串不能转换为有效整数则提示错误
			int year1 = Integer.parseInt(y1);// 将获取到的字符串转变为整数类型

			while (true) {// 建立循环判断，满足特定条件后跳回此循环运行
				System.out.print("还要继续输入另一个年份吗？y/n");// 提示是否还要继续输入另一个年份
				String yn = new Scanner(System.in).nextLine();// 获取输入的字符串，进行判断是否有另一个年份输入

				if ((yn.equals("y")) || (yn.equals("Y"))) {// 如果输入Y/y，则继续输入另一个年份
					System.out.print("请输入另一个年份，不能比刚才输入的年份小：");// 提示输入另一个年份，不能比第一个小
					String y2 = new Scanner(System.in).nextLine();//// 获取输入的字符串，保存到另一个变量中
					int year2 = Integer.parseInt(y2);// 将保存的字符串转变为整数类型

					if (year2 >= year1) {// 判断第二次输入的年份是否不小于第一次输入的年份
						year(year1, year2);// 如果不小于，则满足条件，调用方法判断两次输入的年份之间的所有年份是否为闰年
					} else {// 如果第二次输入的年份小于第一次输入的年份
						System.out.println("输入有误，第二次输入的年份不能比第一年小");// 则提示输入有误，需要按要求输入
						continue;// 返回循环开头
					}
					break;// 分支执行完成，终止循环

				} else if ((yn.equals("n")) || (yn.equals("N"))) {// 如果输入N/n，则不继续输入另一个年份
					year(year1);// 调用方法判断这一年是否为闰年
					break;// 分支执行完成，终止循环

				} else {
					System.out.println("输入有误，请输入Y/N（不区分大小写）。");// 如果输入其他字符，则提示需要按要求重新输入
					continue;// 返回循环开头
				}
			}
		} catch (Exception e) {// 如果输入年份不能转换为有效数字，则提示异常错误
			System.out.println("输入有误，您输入的年份不是一个有效数字");// 提示输入年份有误，无法继续，需要重新执行程序
		}
	}

	static void year(int year1) {// 单参数方法，获取一个有效年份值，判断是否为闰年
		String y = "平年";// 定义变量，将年份属性的默认值设置为平年
		if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0) {// 进行是否为闰年的判断
			y = "闰年";// 如果满足条件，则将年份属性修改为闰年，不满足则不执行
		}
		System.out.println(year1 + "年是" + y);// 输出打印这一年是否为闰年的结果
	}

	static void year(int year1, int year2) {// 方法重载，双参数方法，判断两个参数之间的所有年份是否为闰年
		for (int i = year1; i <= year2; i++) {// 通过输入的两个年份来分别定义循环判断的开头和结尾
			year(i);// 重复调用单参数方法，传入一个年份，判断是否为闰年
		}
	}
}
