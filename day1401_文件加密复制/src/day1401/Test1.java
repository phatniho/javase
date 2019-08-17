package day1401;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * �����ļ����ܸ���
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("������Ҫ���ܵ�ԭ�ļ���");// ��ʾ��Ϣ
			// D:/abc/aa/bb/cc/23562342.png
			String from = new Scanner(System.in).nextLine();// ��ȡ������ļ���ַ�ַ���
			File f1 = new File(from);// ��������ļ���ַ�ַ���ת��Ϊ�ļ�����
			if (!f1.isFile()) {// �ж��Ƿ�Ϊ��Ч�ļ�
				System.out.println("����һ����Ч�ļ�������������");// ��ʾ��Ϣ
				continue;// ���������Ч�ļ����������һ��ѭ������������
			}

			System.out.println("����Ŀ���ļ���");// ��ʾ��Ϣ
			// D:/abc/aa/bb/cc/2.png
			String to = new Scanner(System.in).nextLine();// ��ȡ�����Ŀ���ַ�ļ��ַ������ļ�Ҫ�ȴ���
			File f2 = new File(to);// �������Ŀ���ַ�ļ�ת��Ϊ�ļ�����
			if (f2.isDirectory()) {// �ж��Ƿ�Ϊ��Ч�ļ�
				System.out.println("������һ���ļ��У�����������");// ��ʾ��Ϣ
				continue;// ������Ч�ļ���������һ��ѭ������������
			}

			System.out.print("�������루��Χ0-255����");// ��ʾ��Ϣ
			try {// �쳣��׽
				int pw = new Scanner(System.in).nextInt();// ��ȡ�������������ֵ
				if (pw > 255 || pw < 0) {// �ж��Ƿ�Ϊ��Ч��Χ
					System.out.println("���벻����Ҫ������������");// ��ʾ��Ϣ
					continue;// ������Ч��Χ��������һ��ѭ��
				}
				copy(f1, f2, pw);// ���Ʒ���
				System.out.println("�ɹ�");// ���Ƴɹ���ʾ
				break;// ����ѭ��
			} catch (Exception e) {// �쳣����
				System.out.println("ʧ��");// ����ʧ����ʾ
				e.getStackTrace();// ��ȡջ׷����Ϣ
				break;// ����ѭ��
			}
		}
	}

	private static void copy(File f1, File f2, int pw) throws Exception {// �����ļ�����
		FileInputStream fis = new FileInputStream(f1);// �ļ�����������ԭ�ļ��е����ݶ��뵽�ڴ���
		FileOutputStream fos = new FileOutputStream(f2);// �ļ�����������ڴ��е�����д����Ŀ���ļ���
		byte[] b = new byte[8 * 1024];// �������鱣��һ�ζ�ȡ����������8192=8*1024����һ���Լ۱���ߵ�����
		int n;// �����������ÿ�ζ�ȡ����Ч������
		while ((n = fis.read(b)) != -1) {// ѭ����ȡ�����δ��ȡ����Ч���ݣ��򷵻�-1������ѭ��
			for (int i = 0; i < n; i++) {// ѭ��������ȡ�����ݵ�����
				b[i] ^= pw;// ��ÿ�����ݽ���������
			}
			fos.write(b, 0, n);// ��������ɺ������д����Ŀ���ļ���
		}
		fis.close();// �ر�������
		fos.close();// �ر������
	}
}
