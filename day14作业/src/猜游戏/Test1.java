package ����Ϸ;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("ѡ����Ϸ��q�˳�");
			System.out.println("1.����ĸ");
			System.out.println("2.������");
			System.out.print("ѡ��");
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("��Ϸ����");
				break;
			}
			try {
				int i = Integer.parseInt(s);
				if (i > 2 || i < 1) {
					System.out.println("û�����ѡ�����������");
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
				System.out.println("������������������");
				continue;
			}
		}
	}
}
