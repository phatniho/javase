package day10_ʿ��;

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
		System.out.println("ʿ��������");
		int n = new Scanner(System.in).nextInt();
		Soldier[] a = new Soldier[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Soldier();
			a[i].id = i + 1;
		}
		System.out.println("���س�ִ��");
		while (Soldier.count != 0) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < a.length; i++) {
				if (a[i].blood != 0) {
					a[i].attack();
				}
			}
			System.out.println("���ʿ��������" + Soldier.count);
			System.out.println("\n------------------");
		}
	}
}
