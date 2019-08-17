package day14_�ļ��м��ܸ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * ���󣺽�һ���ļ��м��ܸ��Ƶ���һ���ļ�����
 * ������
 * ������Ҫ���Ƶ��ļ����ļ���
 * ����Ŀ���ַ
 * �������루0-255��
 * ���÷�������
 * �����ļ�������������Ҫ���Ƶ��ļ�������
 * �����ļ����������Ŀ���ַ������
 * �������鱣��һ�θ��Ƶ�������
 * ���������ж�ÿ�θ��Ƶ���Ч������
 * ѭ�������������
 * ������ɺ�ʼ����
 * �ж��Ƿ�Ϊ�ļ��У�������ļ��У���ݹ����ڲ��Ҹ���
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println("������Ҫ���Ƶ��ļ��У�");
		String from = new Scanner(System.in).nextLine();
		File f1 = new File(from);

		System.out.println("����Ŀ���ַ��");
		String to = new Scanner(System.in).nextLine();
		File t1 = new File(to);

		System.out.println("�������루0-255����");
//		try {
		int pw = new Scanner(System.in).nextInt();
		if (pw > 255 || pw < 0) {
			System.out.println("���벻���Ϲ���������0-255֮���һ������");
			return;
		}

		copy(f1, t1, pw);

		File t2 = new File(to + "/" + "���룺" + pw + ".txt");
		t2.createNewFile();
		FileWriter fw = new FileWriter(t2);
		fw.write("���룺" + pw);
		fw.close();
//		System.out.println("�ɹ�");
//		} catch (Exception e) {
//			System.out.println("ʧ��");
//			e.getStackTrace();
//			return;
//		}
	}

	private static void copy(File f1, File t1, int pw) throws Exception {
		File[] f = f1.listFiles();

		for (int i = 0; i < f.length; i++) {
			if (f[i].isDirectory()) {
				String s = f[i].getName();
				File f2 = new File(t1.getAbsoluteFile() + "/" + s);
				f2.mkdirs();
				copy(f[i], f2, pw);
			} else {

				String s = f[i].getName();
				File t2 = new File(t1, s);
				t2.createNewFile();

				FileInputStream fis = new FileInputStream(f[i]);
				FileOutputStream fos = new FileOutputStream(t2);
				byte[] b = new byte[8 * 1024];
				int n;
				while ((n = fis.read(b)) != -1) {
					for (int j = 0; j < n; j++) {
						b[j] ^= pw;
					}
					fos.write(b, 0, n);
				}
				fis.close();
				fos.close();
			}
		}
	}
}
