package chickendinner;

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
public class Soldier {
	private int id;// ˽�г�Ա��������֤��ȫ��
	private int blood = 100;// �趨Ĭ��ֵ
	Weapon weapon;

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

	public Soldier(int id, int blood, Weapon weapon) {// ����
		this.id = id;
		this.blood = blood;
		this.weapon = weapon;
	}

	public int getId() {// ���÷�����ȡ˽��ֵ
		return id;
	}

	public void setId(int id) {// ���÷����趨˽��ֵ
		this.id = id;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public void attack() {// ��������
		if (this.blood <= 0) {// �ж��Ƿ���
			return;// ��������򲻼�������
		}
		System.out.println(this.id + "��ʿ�����������");
		if (this.weapon != null) {// �ж��Ƿ�������
			this.weapon.fire();// �����������ʹ����������
		}
		int i = new Random().nextInt(10);// ����˺�ֵ
		if (i > this.blood) {// �ж��Ƿ��������ʣ��Ѫ��
			i = this.blood;// ����������˺�ֵ��ʣ��Ѫ�����
			this.blood -= i;// ʣ��Ѫ�����˺�ֵ���
			// ��ʾ��Ϣ
			System.out.println(this.id + "��ʿ���ܵ���" + i + "���˺���ʣ��Ѫ����" + this.blood);
			System.out.println(this.id + "��ʿ�������ˣ�");
			return;// ֹͣ����ִ��
		}
		this.blood -= i;// ʣ��Ѫ�����˺�ֵ���
		System.out.println(this.id + "��ʿ���ܵ���" + i + "���˺���ʣ��Ѫ����" + this.blood);
	}

	public void go() {// ����ս��
		System.out.println(this.id + "��ʿ������ս����");
	}
}
