package day0402;

import java.util.Scanner;

/*
 * 需求：输入二进制或十六进制，显示10进制的值
 * 0b  开头为二进制
 * 0x  开头为十六进制
 * 要取出开头之后的字符串，进行转换
 * 循环输入，直到输入q退出
 */
public class Teat1 {
	public static void main(String[] args) {
		outer: while (true) {// 循环输入判断
			System.out.print("请输入二进制数（0b）或者十六进制数（0x），退出请按q/Q：");// 提示语句
			String s = new Scanner(System.in).nextLine();// 获取输入的字符串
			s.trim();

			if (s.equals("Q") || s.equals("q")) {// 判断输入的字符串是否为特定结束标记
				System.out.println("程序结束");// 输出结束语句
				break;// 结束循环
			}
			if (!(s.startsWith("0b") || s.startsWith("0x"))) {
				System.out.println("输入的不是有效十六进制或二进制，请重新输入");
				continue;
			}
			// 字符串长度至少3
			if (s.length() < 3) {
				System.out.println("长度错误");
				continue;
			}
			if (s.startsWith("0b")) {
				for (int i = 2; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!(c == '0' || c == '1')) {
						System.out.println("不是有效的二进制数");
						continue outer;
					}
				}
			}
			if (s.startsWith("0x")) {
				for (int i = 2; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f'))) {
						System.out.println("不是有效的十六进制数");
						continue outer;
					}
				}
			}
			int x = f(s);// 定义变量保存f函数的值
			if (x == -1) {// 判断值是否为-1
				System.out.print("输入有误,");// 若为-1，则输入错误
			} else {// 否则输出结果
				System.out.println(s + "的十进制是：" + x);// 打印结果
				System.out.println("\n----------");// 分隔符
			}
		}

	}

	private static int f(String s) {
		String m = s.toLowerCase();// 将字符串中的大写字母转换为小写（s.toUpperCase()小写转换为大写）
		String n = m.substring(2);// 从指定位置开始取子串
		int a = 0;// 定义变量保存转换后的值，默认值设为0
		if (m.startsWith("0b")) {// 判断字符串开头是否为特定值
			a = Integer.parseInt(n, 2);// 字符串转换为整数类型（按特定进制转换为十进制）
		} else if (m.startsWith("0x")) {
			a = Integer.parseInt(n, 16);
		} else {// 都不满足则返回-1
			return -1;
		}
		return a;// 返回a的值
	}
}
