package day0602;

import java.util.Scanner;

/*
 * ������������
 * ��Ҫ���½�����
 * ����ʾ������������
 * ���ӵ���⣬��ͨ��ָ��ָ��������װ��
 */
public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon("��ǹ");// ��Ҫ���½�����
		Weapon w2 = new Weapon("��ǹ", 200);

		System.out.println("�س����䣬����rװ���ӵ�");// ��ʾ����
		while (true) {// ѭ������
			String s = new Scanner(System.in).nextLine();// �ж��Ƿ�װ��
			if (s.equals("r")) {// ������װ��ָ������װ��
				w1.reload();// װ������
				w2.reload();
				System.out.println("������װ��");// ��ʾ
				continue;// ����ѭ��
			}
			w1.fire();// ���𷽷�
			w2.fire();
		}
	}
}
