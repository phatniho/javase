package test03今晚吃鸡;

import java.util.Random;

public class Weapon {
	String name = "手枪";
	int bullets = 100;

	public Weapon() {
		this.name = "手枪";
		this.bullets = 100;
	}

	public Weapon(String name) {
		super();
		this.name = name;
	}

	public void fire() {
		if (bullets <= 0) {
			reload();
		}
		int i = new Random().nextInt(10);
		System.out.print("打了" + i + "枪：");
		for (int j = 0; j < i; j++) {
			System.out.print("哒");
		}
		System.out.println();
		if (i > bullets) {
			i = bullets;
		}
		bullets -= i;
		System.out.println("剩余子弹：" + bullets);
	}

	public void reload() {
		bullets = 100;
	}
}
