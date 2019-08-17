package day10_����Ϸ;

import java.util.Random;

public class GuessLetterGame extends GuessGame {

	@Override
	public boolean caiDui(String result) {
		return result.equals("5A0B");
	}

	@Override
	public String biJiao(String s, String l) {
		int a = 0, b = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < l.length(); j++) {
				if (s.charAt(i) == l.charAt(j)) {
					if (i == j) {
						a++;
					} else {
						b++;
					}
				}
			}
		}
		return a + "A" + b + "B";
	}

	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������5����д��ĸ����£�");
	}

	@Override
	public String suiJi() {
		StringBuilder s = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < 5; i++) {
			int j = i + new Random().nextInt(s.length() - i);
			char t = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, t);
		}
		s.delete(5, s.length());
		return s.toString();
	}

}
