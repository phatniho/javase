package test03����Լ�;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("��ӭ�����̼�ս�����밴�س���ʼ��Ϸ��q�˳�");
		while (true) {
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("��Ϸ������");
				break;
			}
			Soldier[] s0 = strat();
			fight(s0);
		}
	}

	private static void fight(Soldier[] s0) {
		System.out.println("���س���ʼս��");
		while (true) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < s0.length; i++) {
				s0[i].attack();
				if (s0[i].blood <= 0) {
					Soldier[] s = new Soldier[s0.length - 1];
					System.arraycopy(s0, 0, s, 0, i);
					System.arraycopy(s0, i + 1, s, i, s0.length - i - 1);
					s0 = s;
					i--;
				}
				if (s0.length == 1) {
					System.out.println(s0[0].id + "��ʿ��������ʤ���ߣ�");
					return;
				}
			}
			System.out.println("��ʣ" + s0.length + "��ʿ����ս��--------");
		}
	}

	private static Soldier[] strat() {
		Soldier[] s = new Soldier[100];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Soldier(i + 1);
			s[i].go();
		}
		return s;
	}
}
