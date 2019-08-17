package day10_²ÂÓÎÏ·;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String s = suiJi();
		tiShi();
		while (true) {
			System.out.println("²Â");
			String l = new Scanner(System.in).nextLine();
			String result = biJiao(s, l);
			System.out.println(result);
			if (caiDui(result)) {
				System.out.println("²ÂÖÐÀ²£¡");
				break;
			}
		}
	}

	protected abstract boolean caiDui(String result);

	protected abstract String biJiao(String s, String l);

	protected abstract void tiShi();

	protected abstract String suiJi();
}
