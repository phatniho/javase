package day0602;

import java.util.Scanner;

/*
 * 100个士兵进入刺激战场
 * [
 * 		{id,blood,weapon:{name,bullets}},
 * ]
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("欢迎进入刺激战场！");// 提示语句
		Soldier[] a = new Soldier[100];// 新建士兵对象数组
		for (int i = 0; i < a.length; i++) {// 遍历数组
			Soldier s = new Soldier();// 新建士兵对象
			s.id = i + 1;// 定义士兵编号
			s.weapon = new Weapon("手枪" + (i + 1));// 定义士兵武器
			a[i] = s;// 将定义好的士兵存放到数组中
		}
		System.out.println("按回车执行");// 开始提示
		while (true) {// 循环开始
			String s = new Scanner(System.in).nextLine();// 判断结束标记
			if (s.equals("r")) {// 结束标记
				System.out.println("战斗结束！");// 提示结束
				break;// 循环结束
			}
			for (int i = 0; i < a.length; i++) {// 遍历对象数组
				a[i].attack();// 对象执行攻击
				if (a[i].blood == 0) {// 判断是否存活，若该士兵阵亡
					Soldier[] b = new Soldier[a.length - 1];// 新建比原数组少一位的新数组
					System.arraycopy(a, 0, b, 0, i);// 将阵亡士兵前的士兵复制到新数组
					// 将阵亡士兵后的士兵赋值到新数组
					System.arraycopy(a, i + 1, b, i, a.length - i - 1);
					a = b;// 将原数组的引用指向新数组
					i--;// 为避免跳过当前位置新士兵，进行递减
				}
			}
			// 根据数组长度打印还在战斗中的士兵数量
			System.out.println("还剩" + a.length + "个士兵在战斗-------");
		}
	}
}
