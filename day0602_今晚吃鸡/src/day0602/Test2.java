package day0602;

import java.util.Scanner;

/*
 * 需求：武器试用
 * 按要求新建武器
 * 按提示进行连续开火
 * 若子弹打光，可通过指定指令来进行装弹
 */
public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon("手枪");// 按要求新建武器
		Weapon w2 = new Weapon("机枪", 200);

		System.out.println("回车发射，输入r装载子弹");// 提示开火
		while (true) {// 循环开火
			String s = new Scanner(System.in).nextLine();// 判断是否装弹
			if (s.equals("r")) {// 若输入装弹指令，则进行装弹
				w1.reload();// 装弹方法
				w2.reload();
				System.out.println("弹夹已装满");// 提示
				continue;// 继续循环
			}
			w1.fire();// 开火方法
			w2.fire();
		}
	}
}
