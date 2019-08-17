package day1203;

import java.util.HashMap;

/*
 * ���������½��Ķ��󣬱��浽HashMap�����У�����ȣ����и���
 * ��ϣ������̣�
 * 1.HashMap�ڲ���ʹ�� Entry[] ����������
 * 2.����Ĭ�ϳ�ʼ���� 16
 * 3.��������������+2
 * 
 * 1.key.hashCode() ��ü��Ĺ�ϣֵ
 * 2.�ù�ϣֵ�����鳤�ȣ��������һ���±�ֵ i
 * 3.�½�Entry ��������װ��ֵ������
 * 4.Entry���󣬷��� i λ��
 * --����ǿ�λ�ã�ֱ�ӷ���
 * --�����ݣ�����equals()�Ƚ��Ƿ����
 * ----�ҵ���ȵģ����Ǿ�ֵ
 * ----û����ȵģ�����������һ��
 * --�����ʡ��������� 0.75
 * ----�½�����������������
 * ----�������ݣ�����ִ�й�ϣ���㣬����������
 * --jdk1.8
 * ----�����ȵ�8��ת�ɺ����
 * ----���ϵ����ݼ��ٵ�6��ת�س�����
 */
public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);// --2.9��
		Point b = new Point(1, 3);// --3.1��

		// ����ͬ�Ĺ�ϣֵ�����ܱ�֤�������ͬ�±�λ��
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		// ��ʹ�������ͬλ�ã�equals()ҲҪ��ȣ����ܸ��ǣ���������������һ��
		System.out.println(a.equals(b));

		HashMap<Point, String> hm = new HashMap<>();// �½����ϱ����ֵ��
		hm.put(a, "2.9��");// �����һ����ֵ��
		hm.put(b, "3.1��");// ����ڶ�����ֵ��
		System.out.println(hm);// ��ӡ���ϣ�Ĭ�ϵ���toString()����
	}
}
