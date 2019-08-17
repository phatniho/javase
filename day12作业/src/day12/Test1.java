package day12;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();
		Sword s = new Sword();
		Gun g = new Gun();
		Nuclear n = new Nuclear();
		System.out.println("按回车执行，q退出");
		while (true) {
			String l = new Scanner(System.in).nextLine();
			if (l.equals("q")) {
				System.out.println("战斗结束");
				break;
			}
			int i = new Random().nextInt(4);
			switch (i) {
			case 0:
				t.setW(s);
				break;
			case 1:
				t.setW(g);
				break;
			case 2:
				t.setW(n);
				break;
			case 3:
				t.setW(null);
				break;
			}
			t.attack();
		}
	}
}
