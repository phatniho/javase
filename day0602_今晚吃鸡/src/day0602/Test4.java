package day0602;

import java.util.Scanner;

/*
 * 100��ʿ������̼�ս��
 * [
 * 		{id,blood,weapon:{name,bullets}},
 * ]
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("��ӭ����̼�ս����");// ��ʾ���
		Soldier[] a = new Soldier[100];// �½�ʿ����������
		for (int i = 0; i < a.length; i++) {// ��������
			Soldier s = new Soldier();// �½�ʿ������
			s.id = i + 1;// ����ʿ�����
			s.weapon = new Weapon("��ǹ" + (i + 1));// ����ʿ������
			a[i] = s;// ������õ�ʿ����ŵ�������
		}
		System.out.println("���س�ִ��");// ��ʼ��ʾ
		while (true) {// ѭ����ʼ
			String s = new Scanner(System.in).nextLine();// �жϽ������
			if (s.equals("r")) {// �������
				System.out.println("ս��������");// ��ʾ����
				break;// ѭ������
			}
			for (int i = 0; i < a.length; i++) {// ������������
				a[i].attack();// ����ִ�й���
				if (a[i].blood == 0) {// �ж��Ƿ������ʿ������
					Soldier[] b = new Soldier[a.length - 1];// �½���ԭ������һλ��������
					System.arraycopy(a, 0, b, 0, i);// ������ʿ��ǰ��ʿ�����Ƶ�������
					// ������ʿ�����ʿ����ֵ��������
					System.arraycopy(a, i + 1, b, i, a.length - i - 1);
					a = b;// ��ԭ���������ָ��������
					i--;// Ϊ����������ǰλ����ʿ�������еݼ�
				}
			}
			// �������鳤�ȴ�ӡ����ս���е�ʿ������
			System.out.println("��ʣ" + a.length + "��ʿ����ս��-------");
		}
	}
}
