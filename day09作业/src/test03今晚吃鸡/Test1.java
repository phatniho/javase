package test03今晚吃鸡;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("欢迎来到刺激战场，请按回车开始游戏！q退出");
		while (true) {
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("游戏结束！");
				break;
			}
			Soldier[] s0 = strat();
			fight(s0);
		}
	}

	private static void fight(Soldier[] s0) {
		System.out.println("按回车开始战斗");
		while (true) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < s0.length; i++) {
				s0[i].attack();
				if (s0[i].blood <= 0) {
					Soldier[] s = new Soldier[s0.length - 1];
					System.arraycopy(s0, 0, s, 0, i);
					System.arraycopy(s0, i + 1, s, i, s0.length - i - 1);
					s0 = s;
					i--;
				}
				if (s0.length == 1) {
					System.out.println(s0[0].id + "号士兵是最后的胜利者！");
					return;
				}
			}
			System.out.println("还剩" + s0.length + "个士兵在战斗--------");
		}
	}

	private static Soldier[] strat() {
		Soldier[] s = new Soldier[100];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Soldier(i + 1);
			s[i].go();
		}
		return s;
	}
}
