package test03����Լ�;

import java.util.Random;

public class Soldier {
	int id;
	int blood = 100;
	Weapon weapon;

	public Soldier() {
		super();
		this.weapon = new Weapon();
	}

	public Soldier(int id) {
		super();
		this.id = id;
		this.weapon = new Weapon();
	}

	public void go() {
		System.out.println(id + "��ʿ������ս��");
	}

	public void attack() {
		if (blood <= 0) {
			System.out.println(id + "��ʿ���Ѿ�������");
			return;
		}
		if (this.weapon != null) {
			this.weapon.fire();
		}
		int x = new Random().nextInt(10);
		if (x > blood) {
			x = blood;
		}
		System.out.println(id + "��ʿ���ܵ�" + x + "���˺�");
		blood -= x;
		System.out.println(id + "��ʿ��ʣ��Ѫ��" + blood);
	}
}
