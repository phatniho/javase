package day1101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺲�������������������������б�
 * ʹ��ArrayList��������
 * �ص㣺�����Զ���������1.5��
 * ��ɾ�����Ĳ�졣���ݸ�����λ�Զ�����
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();// �½�����
		System.out.println("�س�ִ��,q�˳�");// ��ʾ���
		while (true) {// ѭ��ִ��
			String s = new Scanner(System.in).nextLine();// ��ȡ������ַ���
			if (s.equals("q")) {// �ж��Ƿ�Ϊ�������
				System.out.println("���������");// ������ʾ
				break;// ����ѭ��
			}
			int a = new Random().nextInt(1000);// ���������
			int index = Collections.binarySearch(al, a);// ���ϵĶ��ֲ���
			if (index < 0) {// �жϽǱ�λ�ã����Ϊ����û�������
				index = -index - 1;// �����صĽǱ�ֵ���д���
			}
			al.add(index, a);// ����������뼯����
			System.out.println(al);// ��ӡ����

		}
		// ��������������
		// Iterator - ������
		Iterator<Integer> it = al.iterator();// ���õ�����
		while (it.hasNext()) {// �ж��Ƿ�����һ��Ԫ��
			Integer n = it.next();// �������ȡ����һ��Ԫ�ر���
			System.out.println(n);// ��ӡȡ����Ԫ��
		}
		System.out.println(al);// ��ӡ����
	}
}
