package day10_猜游戏;

import java.util.Random;

public class GuessNumberGame extends GuessGame {

	@Override
	public boolean caiDui(String result) {

		return result.equals("中");
	}

	@Override
	public String biJiao(String s, String l) {
		int ss = Integer.parseInt(s);
		int ll = Integer.parseInt(l);
		if (ss > ll) {
			return "小";
		} else if (ss < ll) {
			return "大";
		}
		return "中";
	}

	@Override
	public void tiShi() {
		System.out.println("已经产生了一个[1,1000)的随机数，猜：");
	}

	@Override
	public String suiJi() {
		int i = 1 + new Random().nextInt(1000);
		return Integer.toString(i);
	}

}
