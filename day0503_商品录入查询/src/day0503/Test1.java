package day0503;

import java.util.Scanner;

/*
 * ���󣺰�����ִ�в���
 * 1.��Ʒ�б�
 * 2.��Ʒ¼��
 * 3.��Ʒ��ѯ
 * 4.ͳ����Ϣ
 * 5.�˳�
 * ѡ��-> 2
 */
public class Test1 {

	static Item[] items = { // ��Ʒ�б�
			new Item(1, "����", 35.5, 300), // 0
			new Item(2, "����", 25.5, 400), // 1
			new Item(3, "������", 10.5, 200), // 2
			new Item(4, "ơ��", 15.5, 30), // 3
			new Item(5, "����", 9.8, 500), // 4
	};

	public static void main(String[] args) {
		outer: while (true) {
			// ����caiDan()��������ʾ�˵������ѡ���ֵ
			int c = caiDan();
			// �ж�ѡ��ֵ
			switch (c) {
			case 1:
				f1();// ������ʾ��Ʒ�б���
				break;
			case 2:
				f2();// ������Ʒ��ѯ����
				break;
			case 3:
				f3();// ������Ʒ¼�뷽��
				break;
			case 4:
				f4();// ����ͳ����Ϣ����
				break;
			case 5:// �˳�ѡ��
				break outer;// �������ѭ��
			default:
				System.out.println("û�����ѡ����������룡");// ��������������ʾ������Χ
				continue outer;// �������ѭ������ִ��
			}
		}
	}

	private static int caiDan() {
		System.out.println("--------------");// ��ʾ��Ϣ
		System.out.println("��������Ҫִ�еĲ�����");
		System.out.println("1.��Ʒ�б�");
		System.out.println("2.��Ʒ��ѯ");
		System.out.println("3.��Ʒ¼��");
		System.out.println("4.ͳ����Ϣ");
		System.out.println("5.�˳�");
		System.out.println("--------------");
		System.out.print("ѡ��> ");
		int a = new Scanner(System.in).nextInt();// ��ȡ���������ѡ��
		return a;// ���ظ�����λ��
	}

	private static void f1() {// ��ʾ��Ʒ�б�
		for (int i = 0; i < items.length; i++) {// �������
			System.out.println(items[i].toString());// ��ӡ����Ԫ����Ʒ������ַ�����ʾ��ʽ
		}
	}

	private static void f2() {// ��Ʒ��ѯ
		while (true) {// ѭ����ѯ
			System.out.print("��ѯ����Ʒ����");// ��ʾ��Ϣ
			String a = new Scanner(System.in).nextLine();// ��ȡ����Ĺؼ���
			if (a.equals("Q") || a.equals("q")) {// �жϽ�����ѯ����
				System.out.println("��ѯ������");
				break;// ������ѯѭ��
			}
			for (int i = 0; i < items.length; i++) {// ѭ���ж�
				if (items[i].name.indexOf(a) >= 0) {// �ж������Ӵ��Ƿ��������Ĺؼ���
					System.out.println(items[i]);// ���������򷵻������Ʒ��������Ϣ
				}
			}
		}
	}

	private static void f3() {// ��Ʒ¼��
		for (int i = 0; i < items.length; i++) {// ѭ��¼��
			System.out.println("¼���" + (i + 1) + "����Ʒ");// ��ʾ¼��ڼ�����Ʒ
			System.out.print("��ţ�");// ¼������ʾ
			items[i].id = new Scanner(System.in).nextInt();// ����ǰ��Ʒ����޸�Ϊ¼��ı��

			System.out.print("���ƣ�");
			items[i].name = new Scanner(System.in).nextLine();

			System.out.print("�۸�");
			items[i].price = new Scanner(System.in).nextDouble();

			System.out.print("������");
			items[i].number = new Scanner(System.in).nextInt();
		}
		f1();// ���÷���������ʾ�б�
	}

	private static void f4() {// ͳ����Ϣ
		// ��Ʒ�ܼ�
		// ���۾���
		// ����ܼ�
		// ��ߵ���
		double spzj = 0;// ��Ʒ�ܼ�
		double djjj = 0;// ���۾���
		double zgzj = 0;// ����ܼ�
		double zgdj = 0;// ��ߵ���

		for (int i = 0; i < items.length; i++) {// ��������
			Item s = items[i];// ��ȡ�����������壬�������
			spzj += s.price * s.number;// �����ܼۣ��ۼ�
			djjj += s.price;// ���㵥�ۣ��ۼ�
			if (s.price * s.number > zgzj) {// �ж��Ƿ�Ϊ����ܼ�
				zgzj = s.price * s.number;// ������ܼ۱���
			}
			if (s.price > zgdj) {// �ж��Ƿ�Ϊ��ߵ���
				zgdj = s.price;// ����ߵ��۱���
			}
		}
		System.out.println("��Ʒ�ܼۣ�" + spzj);// �����ӡ���
		System.out.println("���۾��ۣ�" + djjj / items.length);// ������Ҫ������Ʒ���������鳤�ȣ�
		System.out.println("����ܼۣ�" + zgzj);
		System.out.println("��ߵ��ۣ�" + zgdj);
	}
}
