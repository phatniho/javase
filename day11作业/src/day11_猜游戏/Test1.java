package day11_猜游戏;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1.猜数字");
			System.out.println("2.猜字母");
			System.out.println("选择：");
			try {
				int i = new Scanner(System.in).nextInt();
				GuessGame game = null;
				if (i != 1 && i != 2) {
					System.out.println("没有这个选项，请重新输入！");
					continue;
				}
				if (i == 1) {
					game = new GuessNumberGame();
				} else {
					game = new GuessLetterGame();
				}
				game.start();
				if (game.caiDui("中") || game.caiDui("5A0B")) {
					System.out.println("游戏结束！");
					break;
				}
			} catch (Exception e) {
				System.out.println("游戏选择输入有误，请重新选择游戏！");
				continue;
			}
		}
	}
}
