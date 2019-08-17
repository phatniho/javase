package day06_soldier;

import java.util.Random;

/*
 * ʿ���ࣺ���ԣ�
 * ���id��Ѫ��blood=100
 * ������
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
		System.out.println(this.id + "ǰ����");
	}

	public void attack() {
		if (this.blood == 0) {
			return;
		}
		int x = 3 + new Random().nextInt(10);
		if (x > this.blood) {
			x = this.blood;
			this.blood -= x;
			System.out.println(this.id + "��ʿ���ܵ���" + x + "���˺���ʣ��Ѫ����" + this.blood);
			System.out.println(this.id + "��ʿ�������ˣ�");
			return;
		}
		this.blood -= x;
		System.out.println(this.id + "��ʿ���ܵ���" + x + "���˺���ʣ��Ѫ����" + this.blood);
	}
}
