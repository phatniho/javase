package day1001;

import java.util.Scanner;

/*
 * ���󣺲����ֻ����ĸ��Ϸ
 * ����ѡ����벻ͬ��Ϸ
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("1.������");// ѡ����ʾ
		System.out.println("2.����ĸ");
		System.out.println("ѡ��");
		int c = new Scanner(System.in).nextInt();// ��ȡ�����ѡ��

		GuessGame game;// �½��������
		if (c == 1) {// �ж������ֵ�Ƿ���������
			game = new GuessNumberGame();// ������Ӧ���������
			game.start();// ���������÷�������
		} else if (c == 2) {
			game = new GuessLetterGame();
			game.start();
		} else {
			System.out.println("û�������Ϸ�����������룡");
		}
	}
}
