package day07��ҵ_���ӳ���;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺵��ӳ���
 * ���س���ʼ��Ϸ����q�˳�
 * ѡ����Ҫ�����ĳ������ͣ�ѡ��ɹ����������֣�����ʾ�������г���ι��
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("������س���ʼ��Ϸ����q�˳�������");// ��ʾ��Ϣ
			String s = new Scanner(System.in).nextLine();// ��ȡ�������Ϣ
			if (s.equals("q")) {// �ж��Ƿ�Ϊ�������
				System.out.println("��Ϸ����");
				break;// ������Ϸ
			}

			System.out.println("����������Ҫ�����ĳ������ͣ�");// ��ʾ��Ϣ
			System.out.println("1.��");
			System.out.println("2.è");
			System.out.println("3.��");
			System.out.println("4.��");
			System.out.println("5.��");
			System.out.println("6.��");
			System.out.print("��ѡ��");
			int i = new Scanner(System.in).nextInt();// ��ȡ�����ѡ��
			if (i > 6 || i < 1) {// ��Чѡ��Χ
				System.out.println("û�����ֳ��������ѡ��");
			} else {// ��Чѡ��Χ
				System.out.print("ѡ��ɹ���������ĳ���������֣�");
				String name = new Scanner(System.in).nextLine();// ��ȡ������ַ�����Ϊ��������
				switch (i) {// ����ѡ���½���Ӧ�ĳ�������
				case 1:
					Dog d = new Dog(name);// ����������ַ�����Ϊ�½������������
					haveFun(d);// ���÷������в���
					break;// ����
				case 2:
					Cat c = new Cat(name);
					haveFun(c);
					break;
				case 3:
					Bird b = new Bird(name);
					haveFun(b);
					break;
				case 4:
					Fish f = new Fish(name);
					haveFun(f);
					break;
				case 5:
					Mouse m = new Mouse(name);
					haveFun(m);
					break;
				case 6:
					Snake ss = new Snake(name);
					haveFun(ss);
					break;
				}
			}
		}
	}

	public static void haveFun(Pet p) {// ��ˣ���������븸�ౣ֤�������඼������������
		System.out.print("���س���ʼ��Ϸ");// ��ʾ��Ϣ
		while (true) {// ѭ������
			System.out.println("��wιʳ��a��ˣ��d�����ˣ��q�˳�");// ��ʾ��Ϣ
			String s = new Scanner(System.in).nextLine();// ��ȡ������ַ���
			if (s.equals("q")) {// �ж��Ƿ�Ϊ�˳����
				System.out.println("�˳���Ϸ");// ��ʾ��Ϣ
				break;// �˳�����
			}
			switch (s) {// ���������ѡ�����Գ�����в���
			case "w":// ƥ���ж�
				p.feet();// ���÷���
				break;// ��������
			case "a":
				p.play();
				break;
			case "d":
				p.punish();
				break;
			default:
				System.out.println("��Ч����������û���κη�Ӧ��");// ����������ʾ
			}
		}
	}

}
