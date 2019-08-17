package day0602;

import java.util.Scanner;

/*
 * 100个士兵进入刺激战场
 * [
 * 		{id,blood,weapon:{name,bullets}},
 * ]
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("欢迎进入刺激战场！");// 提示语句
		Soldier[] a = new Soldier[100];// 新建士兵对象数组
		for (int i = 0; i < a.length; i++) {// 循环遍历数组
			Soldier s = new Soldier();// 新建士兵对象
			s.id = i + 1;// 定义士兵编号
			s.weapon = new Weapon("手枪" + (i + 1));// 定义士兵武器
			a[i] = s;// 将建立好的士兵对象存放到士兵数组中
		}
		System.out.println("按回车执行");// 提示信息
		while (true) {// 循环开始
			String s = new Scanner(System.in).nextLine();// 判断是否结束战斗
			if (s.equals("r")) {// 特殊字符串结束战斗
				System.out.println("战斗结束！");// 打印提示
				break;// 结束循环
			}
			for (int i = 0; i < a.length; i++) {// 遍历数组
				if (a[i].blood != 0) {// 判断是否存活
					a[i].attack();// 若存活则发起攻击
				}
			}
			System.out.println("------------------");// 分割线
		}
	}
}
