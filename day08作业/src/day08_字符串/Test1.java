package day08_字符串;

import java.util.Scanner;

/*
 * 需求：输入email地址，提取名字部分
 * abc@def.com  提取abc
 * \w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入电子邮箱地址，按q退出");
			String e = new Scanner(System.in).nextLine();

			if (e.equals("q")) {
				System.out.println("程序结束！");
				break;
			}
			if (!(e.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))) {
				System.out.println("不是一个有效的邮箱地址，请重新输入");
				continue;
			} else {
				String[] s = e.split("@");
				System.out.println(s[0]);
			}
		}
	}
}
