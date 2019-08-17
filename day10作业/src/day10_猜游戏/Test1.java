package day10_猜游戏;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1.猜数字");
			System.out.println("2.猜字母");
			System.out.print("请选择：");
			int i = new Scanner(System.in).nextInt();
			if (i != 1 && i != 2) {
				System.out.print("没有这个选项，请重新输入：");
				continue;
			}
			GuessGame game;
			if (i == 1) {
				game = new GuessNumberGame();
				game.start();
			} else {
				game = new GuessLetterGame();
				game.start();
			}

		}
	}
}
