package day13�����ļ��������е�ͼƬ�ļ�;

import java.io.File;
import java.util.Scanner;

/*
 * ���󣺲����ļ��������е�ͼƬ�ļ�
 * ��ʽ��jpg,png,jpeg...
 * ������
 * �����ļ���·��
 * �����ļ���·���µ������ļ�
 * �ж��Ƿ�Ϊ�ļ��У�������ļ��У���ݹ���ü��������²�
 * ������ļ������ж��Ƿ�ΪͼƬ��ʽ�ļ�
 * �����ҵ����ļ���
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("������Ҫ���ҵ��ļ���");
		String l = new Scanner(System.in).nextLine();
		File f = new File(l);

		if (!f.isDirectory()) {
			System.out.println("����һ���ļ���");
			return;
		}
		find(f);
	}

	private static void find(File f) {
		String[] names = f.list();
		File[] files = f.listFiles();
		if (names == null) {
			System.out.println("�޷�����ļ��б�");
			return;
		}
		for (int j = 0; j < names.length; j++) {
			if (names[j].endsWith(".png")//
					|| names[j].endsWith(".jpg")//
					|| names[j].endsWith(".gif")//
					|| names[j].endsWith(".bmp")) {
				System.out.println(names[j]);
			}
		}
		for (int i = 0; i < files.length; i++) {
			File f1 = files[i];
			if (f1.isDirectory()) {
				System.out.println(f1.getName() + f1.length());
				find(f1);
			}
		}
	}
}
