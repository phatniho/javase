package day0102;

import java.util.Scanner;

/*
 * ����¼�������Ϣ�����������������Ա����䣬����ӡ�ڿ���̨��
 * ����������Scanner����ʹ�ù��ߣ����Ի�ȡ�����������Ϣ��
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("���������Ϣ��");// ��ʾ��Ϣ����β����
		System.out.print("����������");// ��ʾ��Ϣ����β������
		String name = new Scanner(System.in).nextLine();// ��ȡ����������ַ����������浽����name��

		System.out.print("�����Ա�");// ��ʾ��Ϣ����β������
		String gender = new Scanner(System.in).nextLine();// ��ȡ����������ַ����������浽����gender��

		System.out.print("�������䣺");// ��ʾ��Ϣ����β������
		int age = new Scanner(System.in).nextInt();// ��ȡ������������֣������浽����age��

		// �ڿ���̨�������ӡ�Ѿ�¼�����Ϣ��\n�������ַ����м任��
		System.out.println("������ĸ�����Ϣ�ǣ�\n������" + name + "\n�Ա�" + gender + "\n���䣺" + age);
		System.out.println("���ڴ���һ��ҪŬ��ĥ�����������Ա�ͬѧ��дһ����룬нˮһ��Ҫ���Ա�ͬѧ�ߣ�");
	}
}
