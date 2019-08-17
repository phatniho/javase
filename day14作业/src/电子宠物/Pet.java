package ���ӳ���;

import java.util.Scanner;

public abstract class Pet {
	private String name;
	private int full;
	private int happy;

	public Pet() {
	}

	public Pet(String name) {
		this(name, 50, 50);
	}

	public Pet(String name, int full, int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}

	public void show() {
		System.out.println("��ǰ��ʳ�ȣ�" + this.full);
		System.out.println("��ǰ���ֶȣ�" + this.happy);
	};

	public void feed() {
		System.out.println("��" + this.name + "ιʳ����ʳ������");
		this.full += 50;
	}

	public void play() {
		if (this.full <= 0) {
			System.out.print("�����治����,");
			while (true) {
				System.out.println("�Ƿ�ιʳ��y/n");
				String s = new Scanner(System.in).nextLine();
				if (s.equals("y")) {
					feed();
					break;
				} else if (s.equals("n")) {
					System.out.println("��ιʳ�Ͳ�����");
					continue;
				} else {
					System.out.println("������������������");
					continue;
				}
			}
		}
		System.out.println("������ˣ");
		this.full -= 10;
		this.happy += 20;
	}

	public void punish() {
		if (this.happy <= 0) {
			System.out.println("�Ѿ���ô�����ˣ��Ͳ�Ҫ�ͷ�����");
			while (true) {
				System.out.println("�Ƿ��������棿y/n");
				String s = new Scanner(System.in).nextLine();
				if (s.equals("y")) {
					play();
					break;
				} else if (s.equals("n")) {
					System.out.println("���ﲻ�������ˣ�����������");
					continue;
				} else {
					System.out.println("������������������");
					continue;
				}
			}
		}
		System.out.println("��ѵ��������" + cry() + "�Ľ���");
		this.happy -= 10;
	}

	public abstract String cry();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFull() {
		return full;
	}

	public void setFull(int full) {
		this.full = full;
	}

	public int getHappy() {
		return happy;
	}

	public void setHappy(int happy) {
		this.happy = happy;
	}

}
