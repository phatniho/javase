package day04;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺲�����
 * �Ѿ�����·һ��[1,1001)��Χ������
 * ��²���������Ǽ�
 * 
 * ��:1
 * С��������
 * ��:1000
 * �󣨼�����
 * ��:455
 * �ԣ�������
 */
public class Test9_Num {
	public static void main(String[] args) {
		int i = 1 + new Random().nextInt(1000);
		System.out.println("�Ѿ�������һ��[1,1000)���������²��Ǽ���");

		while (true) {
			System.out.print("��:");
			int j = new Scanner(System.in).nextInt();

			if (j > i) {
				System.out.println("��");
			} else if (j < i) {
				System.out.println("С");
			} else {
				System.out.println("�У�");
				break;
			}
		}
	}

}
