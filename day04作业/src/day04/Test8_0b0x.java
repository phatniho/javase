package day04;

import java.util.Scanner;

/*
 * 需求：输入二进制或十六进制，显示10进制的值
 * 0b  开头为二进制
 * 0x  开头为十六进制
 * 要取出开头之后的字符串，进行转换
 * 循环输入，直到输入q退出
 * 分析：
 * 需要用到的工具：
 * 字符串比较：s.equals("需要比较的字符串")，返回true或者false
 * 大小写转换：s.toLowerCase();s.toUpperCase();
 * 提取子串：s.substring(角标号);
 * 判断字段开头：s.startsWith("字符串");
 * 进制转换：Integer.parseInt(需要转换的字符串，按特定进制转换为十进制);
 */
public class Test8_0b0x {
	public static void main(String[] args) {
		while (true) {// 循环输入
			System.out.print("输入一个二进制或十六进制数：");
			String s = new Scanner(System.in).nextLine();// 获取输入的字符串

			if (s.equals("Q") || s.equals("q")) {// 判断是否为结束标记
				System.out.println("结束程序。");// 如果是结束标记，则提示结束程序
				break;// 跳出循环，结束程序
			}
			if (f(s) == -1) {// 判断输入的数据经转换后是否有效
				System.out.println("输入错误，请重新输入");// 若数据无效则提示错误，重新输入
				continue;// 重新执行循环，重新输入
			} else {
				long x = f(s);// 输入有效则返回有效值
				System.out.println(s + "的十进制是" + x);// 输出打印结果
			}
		}
	}

	private static long f(String s) {// 进制转换方法
		String m = s.toLowerCase();// 将输入的字符串中的字母全部改为小写
		String n = m.substring(2);// 将有效数字位取子串
		long l = -1;// 定义返回值变量，默认值为-1
		if (m.startsWith("0b")) {// 判断是否为2进制开头
			l = Integer.parseInt(n, 2);// 将数据按2进制转换后保存
		} else if (m.startsWith("0x")) {// 判断是否为16进制开头
			l = Integer.parseInt(n, 16);// 将数据按16进制转换后保存
		} else {
			l = -1;// 如果都不满足则返回-1
		}
		return l;// 返回运算结果
	}
}
