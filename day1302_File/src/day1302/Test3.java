package day1302;

import java.io.File;
import java.util.Scanner;

/*
 * ���������ļ��У���ʾ�ļ��������е��ļ����ļ��У�����ʾ�ļ���С
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.print("����һ���ļ��У�");// ��ʾ��Ϣ
		String s = new Scanner(System.in).nextLine();// ��ȡ������ַ���
		File dir = new File(s);// ��������ַ����½�Ϊ�ļ��ж���

		if (!dir.isDirectory()) {// �ж��Ƿ�Ϊ��Ч�ļ���
			System.out.println("�����ļ���");// ��ʾ��Ϣ
			return;// ������Ч�ļ����򲻼���ִ��
		}

		String[] names = dir.list();// �����ַ������飬��������ļ��ж����е����е��ļ����ļ��е�����
		File[] files = dir.listFiles();// �����ļ��������飬��������ļ����������ļ����ļ��еĶ���
		if (names == null) {// �ж��Ƿ�Ϊ��
			System.out.println("�޷����Ŀ¼�б�");// ��ʾ��Ϣ
			return;// ���ļ�����ֱ�ӷ��أ�������ִ��
		}
		for (int i = 0; i < names.length; i++) {// ѭ�������ַ�������
			System.out.println(names[i]);// ��ӡ�����ļ����ļ��е������ַ���
		}
		System.out.println("\n-------------------");// �ָ���
		for (int i = 0; i < files.length; i++) {// �����ļ���������
			File f = files[i];// ��ȡÿ���ļ�����
			System.out.println(f.getName() + "--" + f.length());// ��ӡ�ļ������ļ���С
		}
	}
}
