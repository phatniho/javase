package day1302;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;

//		path = "D:/Count.java";
//		path = "D:/����";
		path = "F:/Count.java";

		File f = new File(path);// ��װ·��
		System.out.println(f.getName());// ��ȡ�ļ���
		System.out.println(f.getParent());// ��ȡ�ļ���Ŀ¼
		System.out.println(f.getAbsolutePath());// ��ȡ�ļ�����·��
		System.out.println(f.length());// ��ȡ�ļ��ֽ������ļ�����Ч
		System.out.println(f.isFile());// �ж��Ƿ����ļ�
		System.out.println(f.isDirectory());// �ж��Ƿ����ļ���

	}
}
