package day0703;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺵��ӳ���
 * ����ѡ����ʾ��ѡ����Ҫ�����ĳ���
 * ѡ��ɹ��󣬸�������������
 * �ظ����÷����Գ�������������
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("1.è");// ������ʾ��������
		System.out.println("2.��");
		System.out.print("ѡ��>");
		int i = new Scanner(System.in).nextInt();
		if (i != 1 && i != 2) {// �ж��Ƿ���������Чѡ��
			System.out.println("û�����ѡ�");
		} else {
			System.out.print("�������������");
			String s = new Scanner(System.in).nextLine();// ��ȡ������ַ�������Ϊ������

//			Cat cat = null;// Ԥ�����������
//			Dog dog = null;// Ԥ�����������
			Pet pet = null;//

			if (i == 1) {// �����ض�Ҫ��ʱ
				pet = new Cat(s);// ��Ԥ�����Ķ�������ָ���ض�����
				f(pet);// ���÷��������������
			} else {
				pet = new Dog(s);
				f(pet);
			}
		}
	}

	public static void f(Pet p) {
		System.out.println("���س�ִ��");// ��ʾ���
		while (true) {// ѭ������
			new Scanner(System.in).nextLine();// �س���ʼִ��
			int r = new Random().nextInt(9);// ���ֵ
			switch (r) {// �������ֵ�жϸ�ִ��ʲô����
			case 0:
				p.feed();// ����ιʳ����
				break;// ����
			case 1:
				p.play();// ������ˣ����
				break;// ����
			default:// �������
				p.punish();// ���óͷ�����
			}
		}
	}
}
