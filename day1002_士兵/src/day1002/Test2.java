package day1002;

import java.util.Scanner;

/*
 * �����½����飬�����������½�soldierʵ��
 * [{},{},{}]
 * 
 * ���д��ʿ����ʿ������!=0
 * ��ʿ������
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("ʿ��������");// ��ʾ��Ϣ
		int n = new Scanner(System.in).nextInt();// ��ȡ�����ֵ
		Soldier[] a = new Soldier[n];// �½�ʿ����������
		for (int i = 0; i < a.length; i++) {// ѭ������
			a[i] = new Soldier();// �½�ʿ�����󣬱��浽ʿ������������
			a[i].id = i + 1;// ����ʿ��idֵ
		}
		System.out.println("���س�ִ��");// ��ʾ��Ϣ
		while (Soldier.count != 0) {// ѭ��ִ�У�ֻҪ��Ϊ0��һֱִ��
			new Scanner(System.in).nextLine();// �س�����ʼ
			for (int i = 0; i < a.length; i++) {// ѭ������
				if (a[i].blood != 0) {// �ж��Ƿ���
					a[i].attack();// ����򷢶�����
				}
			}
			System.out.println("���ʿ��������" + Soldier.count);// ��ӡʣ��ʿ������
			System.out.println("\n------------------");// �ָ���
		}
	}
}
