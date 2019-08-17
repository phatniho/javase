package day13��д;

import java.io.File;
import java.util.Scanner;

/*
 * ��������һ���ļ��У���������ļ��е��ܴ�С
 * �����������ַ���
 * �����ļ����󣬽�����ĵ�ַ��������ж��Ƿ�Ϊ��Ч�ļ���
 * ���÷�������ļ����ܴ�С
 * ��ӡ����ֵ
 * ������
 * ��ȡ�ļ����µ������ļ��������浽�ļ�����������
 * �жϸ��ļ����Ƿ�Ϊ�գ����Ϊ���򷵻�0
 * ������������ļ��д�С
 * ѭ�������ļ���������
 * ��ȡÿ�������ж��Ƿ�Ϊ�ļ���������ļ����򽫴�С���Լӵ�������
 * ��������ļ���������ݹ����ļ����ڵ��ļ���С
 * ���������
 */
public class Test1_�ļ����ܴ�С {
	public static void main(String[] args) {
		System.out.print("����·����");
		String l = new Scanner(System.in).nextLine();
		File f = new File(l);
		if (!f.isDirectory()) {
			System.out.println("����һ���ļ���");
			return;
		}
		long s = tongJi(f);
		System.out.println(l + "�ļ��е��ܴ�СΪ��" + s + "�ֽ�");
	}

	private static long tongJi(File f) {
		File[] f1 = f.listFiles();
		if (f1 == null) {
			return 0;
		}
		long sum = 0;
		for (int i = 0; i < f1.length; i++) {
			File f2 = f1[i];
			if (f2.isFile()) {
				sum += f2.length();
			} else {
				sum += tongJi(f2);
			}
		}
		return sum;
	}
}
