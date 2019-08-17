package day06_soldier;

import java.util.Random;

/*
 * 士兵类：属性：
 * 编号id，血量blood=100
 * 方法：
 * go();
 * attack();
 */
public class Soldier {
	private int id;
	private int blood = 100;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public Soldier(int id) {
		this.id = id;
		this.blood = 100;
	}

	public Soldier(int id, int blood) {
		this.id = id;
		this.blood = blood;
	}

	public void go() {
		System.out.println(this.id + "前进！");
	}

	public void attack() {
		if (this.blood == 0) {
			return;
		}
		int x = 3 + new Random().nextInt(10);
		if (x > this.blood) {
			x = this.blood;
			this.blood -= x;
			System.out.println(this.id + "号士兵受到了" + x + "点伤害，剩余血量：" + this.blood);
			System.out.println(this.id + "号士兵阵亡了！");
			return;
		}
		this.blood -= x;
		System.out.println(this.id + "号士兵受到了" + x + "点伤害，剩余血量：" + this.blood);
	}
}
