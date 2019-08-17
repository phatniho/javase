package day08_字符串;

import java.util.Scanner;

/*
 * 输入字符串，判断是否对称
 * abcdedcba
 */
public class Test2 {
	public static void main(String[] args) {
		outer: while (true) {
			System.out.println("请输入一个需要判断的字符串");
			String l = new Scanner(System.in).nextLine();
			if (!(l.matches("\\w+"))) {
				System.out.println("输入有误，请重新输入英文字母");
				continue;
			} else {
				for (int i = 0, j = l.length() - 1; i < l.length(); i++, j--) {
					if (!(l.charAt(i) == l.charAt(j))) {
						System.out.println("这个字符串不是对称的！");
						break outer;
					}
				}
				System.out.println("这个字符串是对称的！");
			}
		}
	}
}
