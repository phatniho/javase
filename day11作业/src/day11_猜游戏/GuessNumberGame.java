package day11_����Ϸ;

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
		System.out.println("�Ѿ�������һ��[1,1001)��Χ�ڵ����������������Ǽ�");
	}

	@Override
	public String biJiao(String s, String l) {
		int ss = Integer.parseInt(s);
		int ll = Integer.parseInt(l);
		String n;
		if (ss < ll) {
			n = "��";
		} else if (ss > ll) {
			n = "С";
		} else {
			n = "��";
		}
		return n;
	}

	@Override
	public boolean caiDui(String s) {
		return s.equals("��");
	}

}
