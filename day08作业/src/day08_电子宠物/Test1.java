package day08_���ӳ���;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("�밴�س���ʼ��Ϸ����q�˳�");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("q")) {
				System.out.println("�˳���Ϸ");
				break;
			}
			System.out.println("����������Ҫ�ĳ������ͣ�");
			System.out.println("1.��");
			System.out.println("2.è");
			System.out.print("��ѡ��");
			int i = new Scanner(System.in).nextInt();
			if (i != 1 && i != 2) {
				System.out.println("û�����ѡ�����������");
				continue;
			}
			System.out.println("�����ĳ���������ɣ�");
			System.out.print("���������֣�");
			String n = new Scanner(System.in).nextLine();
			switch (i) {
			case 1:
				Dog d = new Dog(n);
				System.out.println("��ϲ�㣬����" + d.name + "�����ɹ�����ú��չ�����");
				f(d);
				break;
			case 2:
				Cat c = new Cat(n);
				System.out.println("��ϲ�㣬����" + c.name + "�����ɹ�����ú��չ�����");
				f(c);
				break;
			}
		}
	}

	public static void f(Pet p) {
		System.out.println("���س���ʼ��q����");
		while (true) {
			System.out.println("����ѡ�������q����");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("q")) {
				System.out.println("�˳���Ϸ");
				break;
			}
			p.play();
		}
	}
}
