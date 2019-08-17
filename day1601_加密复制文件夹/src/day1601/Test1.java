package day1601;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * ���󣺼��ܸ����ļ����µ���������
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("����ԭ�ļ���");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if (!from.isDirectory()) {// �ж��ļ����Ƿ���Ч
			System.out.println("��������ȷ���ļ���");
			return;
		}
		System.out.println("Ŀ���ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if (to.exists()) {// �ж��Ƿ��Ѿ�����Ŀ���ļ���
			System.out.println("Ŀ���Ѿ�����");
			return;
		}
		System.out.println("���룺");
		int key = new Scanner(System.in).nextInt();
		try {
			encryptCopyDir(from, to, key);// �����ļ��з���
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
	}

	private static void encryptCopyDir(File from, File to, int key) throws Exception {
		if (!to.mkdirs()) {// �ж��Ƿ��ܳɹ��������ļ���
			throw new FileNotFoundException();// �����ҵ���Чλ���쳣
		}
		File[] list = from.listFiles();// ��ȡԭ�ļ����б�
		if (list == null) {// ����ǿ��ļ�����ֱ�ӷ���
			return;
		}
		for (File f : list) {// ѭ������
			File toFile = new File(to, f.getName());// �����ļ�����
			if (f.isFile()) {// �ж��Ƿ�Ϊ�ļ�
				encryptCopyFile(f, toFile, key);// ������ļ�����÷�������
			} else {// ��������ļ�
				encryptCopyDir(f, toFile, key);// �ݹ�����ļ��и��Ʒ���
			}
		}
	}

	private static void encryptCopyFile(File from, File to, int key) throws Exception {
		FileInputStream fis = new FileInputStream(from);// �ļ�����������ȡ����
		FileOutputStream fos = new FileOutputStream(to);// �ļ��������������д��Ŀ���ļ�
		byte[] b = new byte[8 * 1024];// ����������������
		int n;// �������ͳ��ÿ�θ��Ƶ���Ч������
		while ((n = fis.read(b)) != -1) {// �ж��Ƿ������
			for (int i = 0; i < n; i++) {// ѭ������ÿ�θ��Ƶ�������
				b[i] ^= key;// ��ÿ�����ݽ��м���
			}
			fos.write(b, 0, n);// �����ܺ������д��Ŀ���ļ�
		}
		fis.close();// �ر�������
		fos.close();// �ر������
	}
}
