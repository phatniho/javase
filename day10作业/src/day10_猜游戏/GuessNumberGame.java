package day10_����Ϸ;

import java.util.Random;

public class GuessNumberGame extends GuessGame {

	@Override
	public boolean caiDui(String result) {

		return result.equals("��");
	}

	@Override
	public String biJiao(String s, String l) {
		int ss = Integer.parseInt(s);
		int ll = Integer.parseInt(l);
		if (ss > ll) {
			return "С";
		} else if (ss < ll) {
			return "��";
		}
		return "��";
	}

	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������һ��[1,1000)����������£�");
	}

	@Override
	public String suiJi() {
		int i = 1 + new Random().nextInt(1000);
		return Integer.toString(i);
	}

}
