package day1405;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * ���󣺱���ת����
 * f4   61 d6 d0
 * f5   61 e4 b8 ad
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		f("d:/abc/f4", "GBK");// ���ļ���ָ��������ת��
		f("d:/abc/f5", "UTF-8");// ���ļ���ָ��������ת��

	}

	private static void f(String path, String charset) throws Exception {
		FileInputStream fis = new FileInputStream(path);// �ļ�������
		// ����ת��������ָ�����ת��ָ���ļ�������
		InputStreamReader isr = new InputStreamReader(fis, charset);

		System.out.println((char) isr.read());// �����ת��������ݴ�ӡ
		System.out.println((char) isr.read());

		fis.close();// �ļ��������ر�
		isr.close();// �������ת�����ر�
	}
}
