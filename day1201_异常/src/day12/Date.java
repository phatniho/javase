package day12;

import java.text.SimpleDateFormat;

/*
 * ������ʾ��ʽ�࣬�̳������࣬��дtoString
 */
public class Date extends java.util.Date {
	@Override
	public String toString() {
		// "yyyy-MM-dd HH:mm:ss"
		// ʹ�ù���ָ�������ʽ
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = f.format(this);// ����������ս��
		return s;// ���ؽ��
	}
}
