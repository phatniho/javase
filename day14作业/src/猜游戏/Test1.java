package 猜游戏;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("选择游戏：q退出");
			System.out.println("1.猜字母");
			System.out.println("2.猜数字");
			System.out.print("选择：");
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("游戏结束");
				break;
			}
			try {
				int i = Integer.parseInt(s);
				if (i > 2 || i < 1) {
					System.out.println("没有这个选项，请重新输入");
					continue;
				}
				GuessGame game = null;
				switch (i) {
				case 1:
					game = new GuessLetterGame();
					break;
				case 2:
					game = new GuessNumberGame();
					break;
				}
				game.start();

			} catch (Exception e) {
				System.out.println("输入有误，请重新输入");
				continue;
			}
		}
	}
}
