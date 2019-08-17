package chickendinner;

import java.util.Scanner;

/*
 * 需求：新建两个士兵对象
 * 调用士兵对象中的前进方法
 * 调用士兵对象中的攻击方法
 * 100个士兵进入刺激战场
 * [
 * 		{id,blood,weapon:{name,bullets}},
 * ]
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("欢迎来到刺激战场！");// 提示信息
		Soldier[] a = new Soldier[100];// 建立士兵对象数组
		for (int i = 0; i < a.length; i++) {// 对象数组遍历
			Soldier s = new Soldier();// 新建士兵对象
			s.setId(i + 1);// 设定士兵id
			s.weapon = new Weapon("手枪" + (i + 1));// 设定士兵武器
			a[i] = s;// 将建立好的士兵对象保存到对象数组中
			s.go();// 提示士兵进入战场
		}
		System.out.println("请按回车键开始游戏，按q键结束战斗");// 提示开始游戏
		while (true) {// 循环开始
			String n = new Scanner(System.in).nextLine();// 判断开始/结束标记
			if (n.equals("q")) {// 结束标记
				System.out.println("战斗结束！");// 提示信息
				break;// 结束循环
			}
			for (int i = 0; i < a.length; i++) {// 循环遍历
				a[i].attack();// 执行攻击
				if (a[i].getBlood() == 0) {// 判断是否存活
					Soldier[] b = new Soldier[a.length - 1];// 建立新士兵对象数组，长度比原数组少1
					System.arraycopy(a, 0, b, 0, i);// 将阵亡士兵之前的士兵复制到新数组中
					System.arraycopy(a, i + 1, b, i, a.length - i - 1);// 阵亡士兵后的复制到新数组
					a = b;// 将原数组的引用指向新数组
					i--;// 为避免该位置的新士兵被跳过，执行自减
				}
			}
			System.out.println("还剩" + a.length + "个士兵存活！-----------");// 提示信息
		}
	}
}
