package day11_猜游戏;

import java.util.Random;

public class GuessLetterGame extends GuessGame {

	@Override
	public String suiJi() {
		StringBuilder s = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < s.length(); i++) {
			int j = i + new Random().nextInt(s.length() - i);
			char t = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, t);
		}
		String ss = s.substring(0, 5);
		return ss;
	}

	@Override
	public void tiShi() {
		System.out.println("已经产生了5个不重复的大写字母，请猜这5个字母是什么");
	}

	@Override
	public String biJiao(String s, String l) {
		int a = 0, b = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < l.length(); j++) {
				if (s.charAt(i) == l.charAt(j)) {
					if (i == j) {
						a++;
					} else if (i != j) {
						b++;
					}
					break;
				}
			}
		}
		return a + "A" + b + "B";
	}

	@Override
	public boolean caiDui(String s) {
		return s.equals("5A0B");
	}

}
