package day1303;

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
public class Test4 {
	public static void main(String[] args) {
		System.out.println("����ԭ�ļ���");// ��ʾ��Ϣ
		String s1 = new Scanner(System.in).nextLine();// ��ȡ����ĵ�ַ�ַ���
		File from = new File(s1);// ����������ַ��������ļ��ж���
		if (!from.isFile()) {// �ж��Ƿ���һ����Ч�ļ���
			System.out.println("�ļ�����");// ��ʾ��Ϣ
			return;// ������Ч�ļ���ֱ�ӷ��أ�������ִ��
		}
		System.out.println("����Ŀ���ļ���");// ��ʾ��Ϣ
		String s2 = new Scanner(System.in).nextLine();// ��ȡ����ĵ�ַ�ַ���
		File to = new File(s2);// �������Ŀ���ַ����Ϊ�ļ��ж���
		if (to.isDirectory()) {// �ж��Ƿ�Ϊ��Ч�ļ�
			System.out.println("����嵽�ļ����������ļ��У�");// ������ļ�������ʾ
			return;// ���أ�������ִ��
		}
		try {// �쳣��׽����
			copy(from, to);// ���Ʒ���
			System.out.println("���");// ���������ʾ
		} catch (Exception e) {// �쳣����
			System.out.println("ʧ��");// ����ʧ����ʾ
			e.printStackTrace();// ��ӡջ׷�٣���������
		}

	}

	private static void copy(File from, File to) throws Exception {
		FileInputStream fis = new FileInputStream(from);// �ļ�����������Ŀ���ļ��е����ݶ�ȡ���ڴ�
		// C:\Users\tarena\Pictures\Saved Pictures\����.png
		FileOutputStream fos = new FileOutputStream(to);// �ļ�����������ڴ��е�����д����ָ���ļ�
		// D:\abc\aa\1.png

		// ���ֽڸ���
//		int c;
//		while ((c = fis.read()) != -1) {
//			fos.write(c);
//		}
//		fis.close();
//		fos.close();

		// �������� Ĭ�� 8k - 8*1024 - 8192
		byte[] b = new byte[8 * 1024];// ���建��ռ�����
		int n;// ���帴�Ƹ�������
		while ((n = fis.read(b)) != -1) {// �жϸ����˶��ٸ����������-1���Ƕ�ȡ���
			fos.write(b, 0, n);// ����д��
		}
		fis.close();// �ر���
		fos.close();// �ر���
	}
}
