package day0405;

import java.util.Scanner;

/*
 * ���󣺽���ѧ������ʹ�÷��������ѧ������Ϣ
 */
public class Test1 {
	public static void main(String[] args) {
		Student s1 = addStu(new Student());// ������һ�����󣬵��ñ��ط���
		Student s2 = addStu(new Student());

		s1.show();// �ö������������еķ���
		s2.show();

		f(s1);// ���������ñ��ط���
		f(s2);
	}

	private static Student addStu(Student s) {// ����ѧ������ķ���
		System.out.println("¼��ѧ����Ϣ��");// ��ʾ����

		s = new Student();// ��������

		System.out.print("ѧ�ţ�");// ��ʾ����
		s.id = new Scanner(System.in).nextInt();// ��ȡ�����ֵ

		System.out.print("������");
		s.name = new Scanner(System.in).nextLine();

		System.out.print("�Ա�");
		s.gender = new Scanner(System.in).nextLine();

		System.out.print("���䣺");
		s.age = new Scanner(System.in).nextInt();
		return s;// ���ش������
	}

	private static void f(Student s1) {// ��ӡ����
		System.out.println("��¼���ѧ����ϢΪ��");// ��ʾ���
		s1.show();// ����ѧ������ڲ����������ӡ
	}
}
