package test02士兵;

import java.util.Random;

public class Soldier {
	int id;
	int blood = 100;

	public Soldier(int id) {
		super();
		this.id = id;
	}

	public void go() {
		System.out.println(id + "号士兵加入战场！");
	}

	public void attack() {
		if (blood <= 0) {
			blood = 0;
			System.out.println(id + "号士兵已经阵亡了");
			return;
		}
		int a = new Random().nextInt(10);
		if (a > blood) {
			a = blood;
			System.out.println(id + "号士兵受到了致命伤");
		}
		blood -= a;
		System.out.println(id + "号士兵剩余血量：" + blood);
	}
}
