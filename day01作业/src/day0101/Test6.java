package day0101;

import java.util.Scanner;

/*
 * ���󣺴�����ĸ�����Ϣ�У�����ѧϰ���
 */
public class Test6 {
	public static void main(String[] args) {
		System.out.print("����������������");
		String name = new Scanner(System.in).nextLine();

		System.out.print("���������ķ�����");
		double score = new Scanner(System.in).nextDouble();

		if (score >= 90 && score <= 100) {
			System.out.println(name + "�����㣬�뱣�֣�");
		} else if (score >= 80 && score < 90) {
			System.out.println(name + "���ֲ������������Ը�Ŭ����");
		} else if (score >= 70 && score < 80) {
			System.out.println("����̫���ˣ�����" + name + "��Ʈ�ˣ�");
		} else if (score >= 60 && score < 70) {
			System.out.println(name + "�������ɲ��а����ͱ���̬�ǲ��Եģ�");
		} else if (score >= 0 && score < 60) {
			System.out.println(name + "��ؼ�׼������ɣ�");
		} else {
			System.out.println(name + "���ң���������ǲ������еģ�");
		}
	}
}
