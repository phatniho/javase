package test02士兵;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Soldier s1 = new Soldier(9527);
		Soldier s2 = new Soldier(9528);

		s1.go();
		s2.go();

		f(s1, s2);
	}

	private static void f(Soldier s1, Soldier s2) {
		System.out.println("输入回车开始战斗");
		while (true) {
			new Scanner(System.in).nextLine();
			if (s1.blood == 0 && s2.blood != 0) {
				System.out.println(s2.id + "号士兵获得了胜利");
				break;
			} else if (s2.blood == 0 && s1.blood != 0) {
				System.out.println(s1.id + "号士兵获得了胜利");
				break;
			}
			s1.attack();
			s2.attack();
		}
	}

}
