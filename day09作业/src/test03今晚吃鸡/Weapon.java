package test03����Լ�;

import java.util.Random;

public class Weapon {
	String name = "��ǹ";
	int bullets = 100;

	public Weapon() {
		this.name = "��ǹ";
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
		System.out.print("����" + i + "ǹ��");
		for (int j = 0; j < i; j++) {
			System.out.print("��");
		}
		System.out.println();
		if (i > bullets) {
			i = bullets;
		}
		bullets -= i;
		System.out.println("ʣ���ӵ���" + bullets);
	}

	public void reload() {
		bullets = 100;
	}
}
