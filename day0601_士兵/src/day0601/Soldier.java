package day0601;

import java.util.Random;

/*
 * ʿ���ࣺ
 * ���ԣ�
 * ���id��
 * Ѫ��blood=100
 * ������
 * go()
 * attack()
 */
public class Soldier {
	int id;// ���
	int blood = 100;// Ĭ�ϳ�ʼ��Ѫ��

	public Soldier() {// �ղι��캯��
		this.blood = 100;// ��ʼ��Ѫ��
	}

	public Soldier(int id) {// ���ι��캯��
		this.id = id;// ���ñ��ֵ
		this.blood = 100;// Ĭ��Ѫ��
	}

	public Soldier(int id, int blood) {// ˫�ι��캯��
		this.id = id;// ���ñ��ֵ
		this.blood = blood;// ����Ѫ��ֵ
	}

	public void go() {// ��������
		System.out.println(id + "��ʿ��ǰ��");
	}

	public void attack() {// ��������
		if (this.blood == 0) {// �жϸ�ʿ��Ѫ���Ƿ�Ϊ0
			System.out.println(id + "��ʿ���Ѿ������ˣ�");// Ѫ��Ϊ0���ʾ����
			return;// ��������
		}
		System.out.println(id + "��ʿ������");// �������
		int d = new Random().nextInt(10);// ģ���ܵ��˺�������һ������ļ�Ѫ��
		this.blood -= d;// Ѫ�����ټ���
		if (this.blood <= 0) {// �ж�Ѫ���Ƿ�Ϊ����
			this.blood = 0;// ��Ѫ����Ϊ��������Ѫ������Ϊ0
			System.out.println(id + "��ʿ�������ˣ�");// ��ʾ��ʿ��������
		}
	}
}
