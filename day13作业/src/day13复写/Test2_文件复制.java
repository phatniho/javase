package day13��д;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * ��������һ���ļ���·����������ļ����Ƶ���һ��ָ��λ��
 * ����������ԭ�ļ�·��
 * �ж��Ƿ�������ļ�
 * ����Ŀ��λ��
 * �ж��Ƿ���嵽�ļ�
 * ���÷��������ļ�������ԭ�ļ���Ŀ���ļ�
 * �쳣����������ɺ�ʧ�ֱܷ���ʾ��Ϣ
 * ��ӡ�쳣��Ϣ
 * ���Ʒ�����
 * �½��ļ�����������ԭ�ļ����뵽�ڴ�
 * �½��ļ�����������ڴ��е�����д����Ŀ���ļ�
 * �������������洢���Ƶ�����
 * ���帴�Ƹ��������������ж��Ƿ��ƽ���
 * ѭ�������ļ��е����ݣ�С����Ƕ��ѭ������
 * �ر���
 */
public class Test2_�ļ����� {
	public static void main(String[] args) {
		System.out.println("����ԭ�ļ���");
		// D:/abc/aa/bb/cc/23562342.png
		String from = new Scanner(System.in).nextLine();
		File f1 = new File(from);
		if (!f1.isFile()) {
			System.out.println("����һ����Ч�ļ�");
			return;
		}
		System.out.println("����Ŀ���ļ���");
		// D:/abc/aa/bb/cc/2.png
		String to = new Scanner(System.in).nextLine();
		File f2 = new File(to);
		if (f2.isDirectory()) {
			System.out.println("������һ���ļ��У�����嵽�ļ�");
			return;
		}
		try {
			copy(f1, f2);
			System.out.println("�ɹ�");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.getStackTrace();
		}
	}

	private static void copy(File f1, File f2) throws Exception {
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		byte[] b = new byte[8 * 1024];
		int n;
		while ((n = fis.read(b)) != -1) {
			fos.write(b, 0, n);
		}
		fis.close();
		fos.close();
	}
}
