package day0103;

/*
 * ���������ֻ����������͵����ֵ����Сֵ
 * ������
 * ʹ�ø��������Ͷ�Ӧ���������Ͷ����е� MIN_VALUE �� MAX_VALUE ��������ȡ���ֵ����Сֵ
 * �����浽��Ӧ�������ͱ�����
 * ʹ�������ӡ�������8��������ֵ��ӡ������̨��
 */
public class Test1 {
	public static void main(String[] args) {
		byte a = Byte.MIN_VALUE;// ʹ�� MIN_VALUE ����ȡ�����͵���Сֵ�������浽�����ͱ�����
		byte b = Byte.MAX_VALUE;// ʹ�� MAX_VALUE ����ȡ�����͵����ֵ�������浽�����ͱ�����

		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;

		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;

		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;

		// ����������ӡ������̨��
		System.out.println("byte���͵���Сֵ=" + a);// -128
		System.out.println("byte���͵����ֵ=" + b);// 127

		System.out.println("short���͵���Сֵ=" + c);// -32768
		System.out.println("short���͵����ֵ=" + d);// 32767

		System.out.println("int���͵���Сֵ=" + e);// -2147483648
		System.out.println("int���͵����ֵ=" + f);// 2147483647

		System.out.println("long���͵���Сֵ=" + g);// -9223372036854775808
		System.out.println("long���͵����ֵ=" + h);// 9223372036854775807
	}
}
