package test02ʿ��;

import java.util.Random;

public class Soldier {
	int id;
	int blood = 100;

	public Soldier(int id) {
		super();
		this.id = id;
	}

	public void go() {
		System.out.println(id + "��ʿ������ս����");
	}

	public void attack() {
		if (blood <= 0) {
			blood = 0;
			System.out.println(id + "��ʿ���Ѿ�������");
			return;
		}
		int a = new Random().nextInt(10);
		if (a > blood) {
			a = blood;
			System.out.println(id + "��ʿ���ܵ���������");
		}
		blood -= a;
		System.out.println(id + "��ʿ��ʣ��Ѫ����" + blood);
	}
}
