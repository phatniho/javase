package ����Ϸ;

import java.util.Random;

public class GuessNumberGame extends GuessGame {

	@Override
	protected String suiJi() {
		int i = 1 + new Random().nextInt(1000);
		return Integer.toString(i);
	}

	@Override
	protected void tishi() {
		System.out.println("�Ѿ�������һ��1-1001�����������");
	}

	@Override
	protected String biJiao(String s, String l) {
		int ss = Integer.parseInt(s);
		int ll = Integer.parseInt(l);
		String m = null;
		if (ss > ll) {
			m = "С";
		} else if (ss < ll) {
			m = "��";
		} else {
			m = "��";
		}
		return m;
	}

	@Override
	public boolean caiDui(String result) {
		return result.equals("��");
	}

}
