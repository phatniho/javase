package day0101;

import java.util.Scanner;

/*
 * ���󣺴Ӽ��̻�ȡ������ݣ��жϸ����Ƿ�Ϊ���꣬�������ӡ�����
 * ���궨�壺�ܱ�4�����������ܱ�100�������ܱ�400����
 * ������
 * ����һ�����������ڱ���Ӽ��̻�ȡ����ݡ�
 * ʹ��if�ж�������ж��Ƿ���������������
 * �����ӡ���
 * ���������ݲ�����Ч���֣���������Ӧ��ʾ��
 */
public class Test1 {
	public static void main(String[] args) {
		/*
		 * System.out.print("��������ݣ�"); int year = new Scanner(System.in).nextInt();
		 * 
		 * if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		 * System.out.println(year + "������"); } else { System.out.println(year + "��������");
		 * }
		 */
		System.out.print("��������ݣ�");// ��ʾ�������
		String year = new Scanner(System.in).nextLine();// ����һ��������ȡ��������

		try {
			int a = Integer.parseInt(year);// ���������ת��Ϊ���ֲ������㣬�����Ƿ�Ϊ������ж�
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {// �ж��Ƿ�Ϊ����
				System.out.println(year + "������");
			} else {
				System.out.println(year + "��ƽ��");
			}
		} catch (Exception e) {// ��������ݲ���ת��Ϊ��Ч���֣��������쳣��׽��ʾ����
			System.out.println("���������ݲ���һ����Ч���");
		}
	}
}
