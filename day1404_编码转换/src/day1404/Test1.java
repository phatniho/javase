package day1404;

import java.util.Arrays;

/*
 * ����ת��
 * encoding ����
 * charset �ַ���
 *                a    ��
 * Unicode     00 61   4e 2d
 * UTF-8          61   e4 b8 ad
 * GBK            61   d6 d0
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc����";
		System.out.println(s);
		f(s, null);// [97, 98, 99, -42, -48, -50, -60]
		f(s, "Unicode");//
		f(s, "GBK");// [97, 98, 99, -42, -48, -50, -60]
		f(s, "UTF-8");// [97, 98, 99, -28, -72, -83, -26, -106, -121]
	}

	private static void f(String s, String charset) throws Exception {
		byte[] a;// �����ַ�����
		if (charset == null) {// �ж�����Ƿ�Ϊ��
			a = s.getBytes();// ������Ϊ�գ���Ĭ�����ת��
		} else {
			a = s.getBytes(charset);// ������Ϊ�գ���ָ�����ת��
		}
		System.out.println(charset + "\t" + Arrays.toString(a));// ��ӡ������Ͷ�Ӧ��ֵ
		// ת��Unicode�ַ�
		if (charset == null) {// �ж�����Ƿ�Ϊ��
			s = new String(a);// ������Ϊ����Ĭ�����ת��Ϊ�ַ���
		} else {
			s = new String(a, charset);// ������Ϊ�գ���ָ�����ת��Ϊ�ַ���
		}
		System.out.println(s);// ��ӡת�����ַ���
		System.out.println("--------------");
	}
}
