package day1303;

import java.io.FileInputStream;
import java.util.Arrays;

/*
 * ����������ȡ�ļ��е�����
 */
public class Test3 {
	public static void main(String[] args) throws Exception {
		// �����������뵽�ڴ���
		FileInputStream fis = new FileInputStream("d:/abc/f2");

		byte[] b = new byte[5];// ����һ�����飬��������һ�ζ�ȡ�ĳ���
		int n;// ����������淵�ظ���
		// Ƕ���ж϶�ȡ�����Ƿ�Ϊ-1
		while ((n = fis.read(b)) != -1) {// һ�ζ�ȡ���鳤�ȸ������ֽ�
			System.out.println(n + "��" + Arrays.toString(b));// ��ӡ
		}
		fis.close();// �ر���
	}
}
