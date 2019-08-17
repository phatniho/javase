package day11_猜游戏;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame extends GuessGame {

	@Override
	public String suiJi() {
		int l = 1 + new Random().nextInt(1000);
		return Integer.toString(l);
	}

	@Override
	public void tiShi() {
		System.out.println("已经产生了一个[1,1001)范围内的整数，请猜这个数是几");
	}

	@Override
	public String biJiao(String s, String l) {
		int ss = Integer.parseInt(s);
		int ll = Integer.parseInt(l);
		String n;
		if (ss < ll) {
			n = "大";
		} else if (ss > ll) {
			n = "小";
		} else {
			n = "中";
		}
		return n;
	}

	@Override
	public boolean caiDui(String s) {
		return s.equals("中");
	}

}
