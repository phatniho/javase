package day0602;

import java.util.Random;

/*
 * ������
 * name
 * bullets
 * fire()
 * reload()
 */
public class Weapon {
	String name;// ��������
	int bullets = 100;// Ĭ���ӵ�����

	public Weapon() {// �ղ�
		this.name = "��ǹ";
		this.bullets = 100;
	}

	public Weapon(String name) {// ����
		this(name, 100);
	}

	public Weapon(String name, int bullets) {// ˫��
		this.name = name;
		this.bullets = bullets;
	}

	public void fire() {// ���𷽷�
		if (this.bullets == 0) {// �ж��ӵ��Ƿ���
			reload();// ���������װ��
		}
		System.out.println(this.name + "����");// ������ʾ
		int a = 3 + new Random().nextInt(10);// ������ֿ���
		if (a > this.bullets) {// �жϿ��������Ƿ����ʣ���ӵ�����
			a = this.bullets;// ��������ʣ���ӵ����
		}
		this.bullets -= a;// ʣ���ӵ����п������
		for (int i = 0; i < a; i++) {// ѭ����ӡ������Ч
			System.out.print("��");// ������Ч�����ڲ�����
		}
		System.out.println("~");// ��β����
		System.out.println(this.name + "ʣ���ӵ���" + this.bullets);// ��ʾ�ӵ�����
	}

	public void reload() {// ����װ������
		System.out.println(this.name + "����װ����");// ��ʾ���
		this.bullets = 100;// װ��ָ���������ӵ�
	}
}
