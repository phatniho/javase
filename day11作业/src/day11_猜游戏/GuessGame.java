package day11_����Ϸ;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String s = suiJi();
		tiShi();
		while (true) {
			System.out.print("�£�");
			String l = new Scanner(System.in).nextLine();
			try {
				String m = biJiao(s, l);
				System.out.println(m);
				if (caiDui(m)) {
					System.out.println("�¶�����");
					break;
				}
			} catch (Exception e) {
				System.out.println("����������������룡");
				continue;
			}
		}
	}

	public abstract String suiJi();

	public abstract void tiShi();

	public abstract String biJiao(String s, String l);

	public abstract boolean caiDui(String s);
}
