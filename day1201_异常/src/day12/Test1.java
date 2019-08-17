package day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * �����������գ�yyyy-MM-dd����1999-9-12
 * "1999-9-12"
 * java.util.Date ��װһ������ֵ
 * java.text.SimpleDateFormat ���ڸ�ʽ������
 * ���԰�Date��ʽ�����ַ���
 * �������ַ�����������Date����
 * ���Ѿ�������xxx��
 */
public class Test1 {
	public static void main(String[] args) throws ParseException {
		System.out.println("����(yyyy-MM-dd)��");// ��ʾ����
		String s = new Scanner(System.in).nextLine();// ��ȡ������ַ���
		// ���ڸ�ʽ�����߶���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);// �������ַ���������Dateʵ��
		// d.getTime()���������ڲ������ĺ���ֵ
		long t = System.currentTimeMillis() - d.getTime();// ����ʱ���
		t = t / 1000 / 60 / 60 / 24;// ��������
		System.out.println("���Ѿ�������" + t + "��!");// ��ӡ���
	}
}
