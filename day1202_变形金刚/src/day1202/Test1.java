package day1202;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺱��ν��ʹ�ò�ͬ�������н���
 * ���������ӿڣ����Է�����ʱ��������
 */
public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();// �½����ν�ն���
		Sword s = new Sword();// �½�������
		AK47 a = new AK47();// �½�ǹ����
		Lyb l = new Lyb();// �½�����������
		System.out.println("���س�ִ��,q�˳�");// ��ʾ��Ϣ
		while (true) {// ѭ��ִ��
			String q = new Scanner(System.in).nextLine();// ��ȡ�����ֵ
			if (q.equals("q")) {// �ж��Ƿ�Ϊ�������
				System.out.println("��Ϸ������");// ������ʾ
				break;// ����ѭ��
			}
			int r = new Random().nextInt(4);// ���������
			switch (r) {// �������ɵ������ʹ�ö�Ӧ����������
			case 0:
				t.setWeapon(s);
				break;
			case 1:
				t.setWeapon(a);
				break;
			case 2:
				t.setWeapon(l);
				break;
			case 3:
				t.setWeapon(null);
				break;
			}
			t.attack();// ���ù�������
		}
	}
}
