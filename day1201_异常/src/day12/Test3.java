package day12;

import java.io.File;
import java.io.IOException;

/*
 * �����쳣��װ
 */
public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		Date d = new Date();// �½����ڶ���
		String s = d.toString();
		System.out.println(s);// ��ӡĬ�ϵ���toString()����
		// ���ڸ�ʽ�������࣬���Խ����ڽ���ָ����ʽ�Ĵ���
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String s = sf.format(d);// �����걣�浽������
//		System.out.println(s);// ��ӡ�ַ���
		s = s.replaceAll(":", "-");// �����ַ����е�ָ���ַ�
		String path = "D:/" + s + ".txt";// ���ַ��������ֵַ
		File f = new File(path);// �½��ļ����󣬴����ֵַ
		// �������throws
		try {
			f.createNewFile();
		} catch (IOException e) {
			throw new RuntimeException();
		} // �½��ļ�

	}
}
