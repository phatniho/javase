package day0901;

import java.util.Random;
import java.util.Scanner;

/*
 * ����ѭ��������ɸ���ͼ��
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("���س�ִ��");
		Shape s = null;

		while (true) {
			new Scanner(System.in).nextLine();
			int l = new Random().nextInt(4);
			switch (l) {
			case 0:
				// �����಻�ܴ�������ʵ��
				System.out.println("Shape�����࣬���ܴ���ʵ��");
				continue;
			case 1:
				s = new Line();
				break;
			case 2:
				s = new Square();
				break;
			case 3:
				s = new Circle();
				break;
			}
			f(s);
		}
	}

	public static void f(Shape s) {
		System.out.println("---���������ʹ���");
		String n = s.getClass().getName();// ��ȡ�����ͷ�����
		System.out.println("��ʵ���ͣ�" + n);
		s.draw();// ��ȡͨ�÷���

		if (s instanceof Line) {// ����������ʶ��
			System.out.println("����ת�ͳ�Line���ͣ��ٵ��ó��ȷ���");
			Line l = (Line) s;// ����ת��
			l.length();// �����������з���
		}

		new Scanner(System.in).nextLine();
		s.clear();// ͨ�÷���
	}
}
