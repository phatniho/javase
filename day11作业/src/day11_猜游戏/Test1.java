package day11_����Ϸ;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1.������");
			System.out.println("2.����ĸ");
			System.out.println("ѡ��");
			try {
				int i = new Scanner(System.in).nextInt();
				GuessGame game = null;
				if (i != 1 && i != 2) {
					System.out.println("û�����ѡ����������룡");
					continue;
				}
				if (i == 1) {
					game = new GuessNumberGame();
				} else {
					game = new GuessLetterGame();
				}
				game.start();
				if (game.caiDui("��") || game.caiDui("5A0B")) {
					System.out.println("��Ϸ������");
					break;
				}
			} catch (Exception e) {
				System.out.println("��Ϸѡ����������������ѡ����Ϸ��");
				continue;
			}
		}
	}
}
