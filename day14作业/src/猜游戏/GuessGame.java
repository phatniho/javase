package ����Ϸ;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String s = suiJi();
		tishi();
		while (true) {
			System.out.println("��");
			String l = new Scanner(System.in).nextLine();
			String result = biJiao(s, l);
			if (caiDui(result)) {
				System.out.println("�¶���");
				break;
			}
		}
	}

	protected abstract String suiJi();

	protected abstract void tishi();

	protected abstract String biJiao(String s, String l);

	public abstract boolean caiDui(String result);
}
