package ���ӳ���;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("ѡ����Ҫ�ĳ��q�˳�");
			System.out.println("1.è");
			System.out.println("2.��");
			System.out.print("ѡ��->");
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("��Ϸ����");
				break;
			}
			try {
				int i = Integer.parseInt(s);
				if (i < 1 || i > 2) {
					System.out.println("û�����ѡ�������ѡ��");
					continue;
				}
				System.out.println("����ĳ���������ְ�");
				String name = new Scanner(System.in).nextLine();
				Pet pet = null;
				switch (i) {
				case 1:
					pet = new Cat(name);
					fun(pet);
					break;
				case 2:
					pet = new Dog(name);
					fun(pet);
					break;
				}
			} catch (Exception e) {
				System.out.println("������������������");
				continue;
			}
		}
	}

	private static void fun(Pet pet) {
		while (true) {
			System.out.println("ѡ��Ҫ���еĲ�����q�˳�");
			System.out.println("1.ιʳ");
			System.out.println("2.��ˣ");
			System.out.println("3.�ͷ�");
			System.out.println("ѡ��");
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("�˳���Ϸ");
				break;
			}
			try {
				int i = Integer.parseInt(s);
				if (i > 3 || i < 1) {
					System.out.println("û�����ѡ�����������");
					continue;
				}
				switch (i) {
				case 1:
					pet.feed();
					break;
				case 2:
					pet.play();
					break;
				case 3:
					pet.punish();
					break;
				}
				pet.show();

			} catch (Exception e) {
				System.out.println("�����������������룡");
				continue;
			}
		}
	}
}
