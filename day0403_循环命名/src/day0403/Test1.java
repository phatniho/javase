package day0403;

import java.util.Scanner;

/*
 * ����ѭ������
 * �����ڵ�״̬��
 * 1.����Ӵ~
 * 2.�о������Ѿ������˸߳�~
 * 3.�о������Ѿ�����·�۷�~
 * 4.���뾲����bye~
 * ѡ��>
 */
public class Test1 {
	public static void main(String[] args) {
		outer: while (true) {// ���ѭ������
			int c = caiDan();// ���÷�����ȡ���
			switch (c) {// �ڲ�ѭ���ж�
			case 1:// �ض�ѡ��
				System.out.println("����Ӵ~");// �����Ӧ���
				break;// ����ѭ��
			case 2:
				System.out.println("�о������Ѿ������˸߳�~");
				break;
			case 3:
				System.out.println("�о������Ѿ�����·�۷�~");
				break;
			case 4:
				System.out.println("���뾲����bye~");
				break outer;// ����ָ��ѭ����һ��������ѭ��
			default:
				System.out.println("û�����ѡ�����������1-4�е�һ����");
			}
		}
	}

	private static int caiDan() {
		System.out.println("\n------------------");
		System.out.println("�����ڵ�״̬��");
		System.out.println("1.����Ӵ~");
		System.out.println("2.�о������Ѿ������˸߳�~");
		System.out.println("3.�о������Ѿ�����·�۷�~");
		System.out.println("4.���뾲����bye~");
		System.out.print("ѡ��>");
		int i = new Scanner(System.in).nextInt();
		return i;// ��ȡ�����ֵ�����ص�����λ��
	}
}
