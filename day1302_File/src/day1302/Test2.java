package day1302;

import java.io.File;
import java.util.Scanner;

/*
 * ����
 * d:/abc/aa/
 * d:/abc/aa/f1
 * ɾ��f1
 * ɾ��aa�ļ���
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("���س�ִ��");
		new Scanner(System.in).nextLine();

		File f = new File("d:/abc/aa");
		f.mkdirs();// ��㴴���ļ��У�f.mkdir()ֻ�������һ���ļ���

		new Scanner(System.in).nextLine();
		File f1 = new File(f, "f1");// �����ļ����󣬴��������·�� ���ļ���

		f1.createNewFile();// �����ļ�

		new Scanner(System.in).nextLine();
		f1.delete();// ɾ���ļ�
		new Scanner(System.in).nextLine();
		f.delete();// ɾ���ļ���
	}
}
