package chickendinner;

import java.util.Scanner;

/*
 * �����½�����ʿ������
 * ����ʿ�������е�ǰ������
 * ����ʿ�������еĹ�������
 * 100��ʿ������̼�ս��
 * [
 * 		{id,blood,weapon:{name,bullets}},
 * ]
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("��ӭ�����̼�ս����");// ��ʾ��Ϣ
		Soldier[] a = new Soldier[100];// ����ʿ����������
		for (int i = 0; i < a.length; i++) {// �����������
			Soldier s = new Soldier();// �½�ʿ������
			s.setId(i + 1);// �趨ʿ��id
			s.weapon = new Weapon("��ǹ" + (i + 1));// �趨ʿ������
			a[i] = s;// �������õ�ʿ�����󱣴浽����������
			s.go();// ��ʾʿ������ս��
		}
		System.out.println("�밴�س�����ʼ��Ϸ����q������ս��");// ��ʾ��ʼ��Ϸ
		while (true) {// ѭ����ʼ
			String n = new Scanner(System.in).nextLine();// �жϿ�ʼ/�������
			if (n.equals("q")) {// �������
				System.out.println("ս��������");// ��ʾ��Ϣ
				break;// ����ѭ��
			}
			for (int i = 0; i < a.length; i++) {// ѭ������
				a[i].attack();// ִ�й���
				if (a[i].getBlood() == 0) {// �ж��Ƿ���
					Soldier[] b = new Soldier[a.length - 1];// ������ʿ���������飬���ȱ�ԭ������1
					System.arraycopy(a, 0, b, 0, i);// ������ʿ��֮ǰ��ʿ�����Ƶ���������
					System.arraycopy(a, i + 1, b, i, a.length - i - 1);// ����ʿ����ĸ��Ƶ�������
					a = b;// ��ԭ���������ָ��������
					i--;// Ϊ�����λ�õ���ʿ����������ִ���Լ�
				}
			}
			System.out.println("��ʣ" + a.length + "��ʿ����-----------");// ��ʾ��Ϣ
		}
	}
}
