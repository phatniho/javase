package 猜游戏;

import java.util.Random;

public class GuessLetterGame extends GuessGame {

	@Override
	protected String suiJi() {
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < sb.length(); i++) {
			int x = i + new Random().nextInt(sb.length() - i);
			char c = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(x));
			sb.setCharAt(x, c);
		}
		sb.delete(5, sb.length());
		return sb.toString();
	}

	@Override
	protected void tishi() {
		System.out.println("已经产生了5个不重复的大写字母，请猜是什么");
	}

	@Override
	protected String biJiao(String s, String l) {
		int a = 0, b = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < l.length(); j++) {
				if (s.charAt(i) == l.charAt(j)) {
					if (i == j) {
						a++;
					} else {
						b++;
					}
					break;
				}
			}
		}
		return a + "A" + b + "B";
	}

	@Override
	public boolean caiDui(String result) {
		return result.equals("5A0B");
	}

}
