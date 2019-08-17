package test03今晚吃鸡;

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
		System.out.println(id + "号士兵加入战场");
	}

	public void attack() {
		if (blood <= 0) {
			System.out.println(id + "号士兵已经阵亡了");
			return;
		}
		if (this.weapon != null) {
			this.weapon.fire();
		}
		int x = new Random().nextInt(10);
		if (x > blood) {
			x = blood;
		}
		System.out.println(id + "号士兵受到" + x + "点伤害");
		blood -= x;
		System.out.println(id + "号士兵剩余血量" + blood);
	}
}
