package 变形金刚;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			Transformer t = new Transformer();
			Sword s = new Sword();
			Gun g = new Gun();
			Nuclear n = new Nuclear();
			System.out.println("回车执行，q退出");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("q")) {
				System.out.println("游戏结束");
				break;
			}
			int i = new Random().nextInt(4);
			switch (i) {
			case 0:
				t.setWeapon(s);
				break;
			case 1:
				t.setWeapon(g);
				break;
			case 2:
				t.setWeapon(n);
				break;
			case 3:
				t.setWeapon(null);
				break;
			}
			t.attack();
		}
	}
}
