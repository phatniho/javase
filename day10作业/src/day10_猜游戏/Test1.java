package day10_����Ϸ;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1.������");
			System.out.println("2.����ĸ");
			System.out.print("��ѡ��");
			int i = new Scanner(System.in).nextInt();
			if (i != 1 && i != 2) {
				System.out.print("û�����ѡ����������룺");
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
