package 猜游戏;

import java.util.Random;

public class GuessNumberGame extends GuessGame {

	@Override
	protected String suiJi() {
		int i = 1 + new Random().nextInt(1000);
		return Integer.toString(i);
	}

	@Override
	protected void tishi() {
		System.out.println("已经产生了一个1-1001的整数，请猜");
	}

	@Override
	protected String biJiao(String s, String l) {
		int ss = Integer.parseInt(s);
		int ll = Integer.parseInt(l);
		String m = null;
		if (ss > ll) {
			m = "小";
		} else if (ss < ll) {
			m = "大";
		} else {
			m = "中";
		}
		return m;
	}

	@Override
	public boolean caiDui(String result) {
		return result.equals("中");
	}

}
