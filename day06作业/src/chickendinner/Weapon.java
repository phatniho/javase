package chickendinner;

import java.util.Random;

/*
 * ������
 * name
 * bullets
 * fire()
 * reload()
 */
public class Weapon {
	private String name;// ˽�г�Ա��������֤��ȫ
	private int bullets = 100;// ˽�г�Ա��������ʼ��ֵΪ100

	public Weapon() {// �ղ�
		this.name = "��ǹ";
		this.bullets = 100;
	}

	public Weapon(String name) {// ����
		this.name = name;
		this.bullets = 100;
	}

	public Weapon(String name, int bullets) {// ˫��
		this.name = name;
		this.bullets = bullets;
	}

	public String getName() {// ��ȡ˽��ֵ�ķ���
		return name;// ����ֵ��������
	}

	public void setName(String name) {// ����˽��ֵ�ķ���
		this.name = name;// ����˽��ֵ
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

	public void fire() {// ���𷽷�
		if (this.bullets == 0) {// �ж��Է����ӵ�
			reload();// ���û���ӵ��͵���װ��
		}
		System.out.println("����");// ������ʾ
		int i = 3 + new Random().nextInt(10);// �������ӵ�����
		if (i > this.bullets) {// �ж��������ӵ��Ƿ����ʣ���ӵ�
			i = this.bullets;// �������������ӵ���������Ϊʣ���ӵ�����
		}
		this.bullets -= i;// ʣ���ӵ����������ӵ��������
		for (int j = 0; j < i; j++) {// ѭ����ʾ����ӵ���Ч
			System.out.print("��");// ���ڲ�����
		}
		System.out.println("~");// ��β����
		System.out.println(this.name + "ʣ���ӵ�����" + this.bullets);// ��ʾ��Ϣ
	}

	private void reload() {// ����װ������
		this.bullets = 100;// ���ô˷���ʱ���ӵ���������Ϊ100
	}
}
