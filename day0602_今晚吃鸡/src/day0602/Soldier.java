package day0602;

import java.util.Random;

/*
 * ʿ���ࣺ
 * ���ԣ�
 * ���id��
 * Ѫ��blood=100
 * ������
 * go();
 * attack();
 */
public class Soldier {// ʿ����
	int id;// ʿ�����
	int blood = 100;// ʿ��Ѫ��
	Weapon weapon;// Ĭ������

	public Soldier() {// �ղ�
		this.blood = 100;
	}

	public Soldier(int id) {// ����
		this.id = id;
		this.blood = 100;
	}

	public Soldier(int id, int blood) {// ˫��
		this.id = id;
		this.blood = blood;
	}

	public void go() {// ǰ������
		System.out.println(id + "��ʿ��ǰ��");
	}

	public void attack() {// ��������
		if (this.blood <= 0) {// �ж��Ƿ���
			return;// ��Ѫ��С�ڵ���0������ʿ����������������ִ�й���
		}
		System.out.println(id + "��ʿ������");// �������
		if (this.weapon != null) {// �ж��Ƿ�������
			this.weapon.fire();// ��������ʹ���������������
		}
		int d = new Random().nextInt(10);// ģ���ܵ��˺�������һ������ļ�Ѫ��
		if (d > this.blood) {// �ж��ܵ��˺��Ƿ����ʣ��Ѫ��
			d = this.blood;// ���������˺���ʣ��Ѫ����ȣ�����Ѫ�����ָ���
			this.blood -= d;// ʣ��Ѫ�����˺�ֵ���м���
			System.out.println(this.id + "��ʿ��Ѫ����ʣ" + this.blood);// ��ӡ��Ϣ
			System.out.println(id + "��ʿ�������ˣ�");// ������Ϣ
			return;// ���أ�������ִ��
		}
		this.blood -= d;// ʣ��Ѫ�����˺�ֵ���м���
		System.out.println(this.id + "��ʿ��Ѫ����ʣ" + this.blood);// ��ӡ��Ϣ
	}
}
