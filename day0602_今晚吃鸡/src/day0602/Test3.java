package day0602;

import java.util.Scanner;

/*
 * 100��ʿ������̼�ս��
 * [
 * 		{id,blood,weapon:{name,bullets}},
 * ]
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("��ӭ����̼�ս����");// ��ʾ���
		Soldier[] a = new Soldier[100];// �½�ʿ����������
		for (int i = 0; i < a.length; i++) {// ѭ����������
			Soldier s = new Soldier();// �½�ʿ������
			s.id = i + 1;// ����ʿ�����
			s.weapon = new Weapon("��ǹ" + (i + 1));// ����ʿ������
			a[i] = s;// �������õ�ʿ�������ŵ�ʿ��������
		}
		System.out.println("���س�ִ��");// ��ʾ��Ϣ
		while (true) {// ѭ����ʼ
			String s = new Scanner(System.in).nextLine();// �ж��Ƿ����ս��
			if (s.equals("r")) {// �����ַ�������ս��
				System.out.println("ս��������");// ��ӡ��ʾ
				break;// ����ѭ��
			}
			for (int i = 0; i < a.length; i++) {// ��������
				if (a[i].blood != 0) {// �ж��Ƿ���
					a[i].attack();// ��������𹥻�
				}
			}
			System.out.println("------------------");// �ָ���
		}
	}
}
