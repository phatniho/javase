package day08_���ӳ���;

import java.util.Scanner;

public abstract class Pet {
	String name;
	int full;
	int happy;

	public Pet(String name) {
		this(name, 50, 50);
	}

	public Pet(String name, int full, int happy) {
		super();
		this.name = name;
		this.full = full;
		this.happy = happy;
	}

	public void feed() {
		if (full >= 100) {
			System.out.println("�Ա��ˣ������ٳ��ˣ�");
			return;
		}
		System.out.println("��" + name + "ιʳ");
		full += 50;
		System.out.println("��ʳ�ȣ�" + full);
	}

	public void play() {
		if (full <= 0) {
			System.out.println(name + "�����ˣ��治���ˣ��Ƿ�ιʳ��y/n");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("y") || l.equals("Y")) {
				feed();
			}
			return;
		}
		System.out.println("���ĳ���" + name + "��ǰ��״̬Ϊ��\n��ʳ�ȣ�" + full + "\n���ֶȣ�" + happy);
		System.out.println("��ѡ����Ҫ����ˣ��Ŀ��");
		System.out.println("1.ι��ʳ");
		System.out.println("2.��һ��");
		System.out.println("3.��һ��");
		System.out.println("4.��һ��");
		System.out.println("5.������");
		System.out.println("6.ιʳ");
		System.out.print("�����룺");
		int i = new Scanner(System.in).nextInt();

		if (i > 6 || i < 1) {
			System.out.println("û�����ѡ����������룡");
			return;
		}
		switch (i) {
		case 1:
			System.out.println("��" + name + "ιʳ��һЩ��ʳ��" + name + "�������ˣ�");
			full += 10;
			happy += 10;
			break;
		case 2:
			System.out.println("��" + name + "����һ��С��Ϸ��" + name + "�������ˣ�");
			full -= 10;
			happy += 20;
			break;
		case 3:
			System.out.println("��" + name + "��ȥ����һȦ��" + name + "�������ˣ�");
			full -= 20;
			happy += 50;
			break;
		case 4:
			System.out.println("��һ�̫�˷��ˣ�����" + name + "һ�٣�" + name + "������" + cry() + "�Ľ�����");
			full -= 10;
			happy -= 50;
			break;
		case 5:
			System.out.println("��һ�̫�������ˣ�������������" + name + "��ʵ�ˣ�");
			happy = 0;
			break;
		case 6:
			feed();
			break;
		}
		System.out.println("��ǰ״̬��\n��ʳ�ȣ�" + full + "\n���ֶȣ�" + happy);

	}

	// �����ͣ���һ�ַ��������ͣ�
	// ��Щ���಻ͬ���룬�ڸ�����û��д��
	// ����ѡ����ɳ��󷽷�

	// ��Ϊͨ�÷����ڸ����ж���
	// Ҫ����������б���ʵ���������
	public abstract String cry();
}
