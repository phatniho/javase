package day0103;

/*
 *���󣺻�ȡ���������������͵����ֵ����Сֵ
 *������
 *ͨ���������Ͷ�Ӧ���������Ͷ����еķ�������ȡ�û������͵����ֵ����Сֵ
 *����ȡ�������ֵ����Сֵ���浽�û������ͱ�����
 *ʹ�������ӡ��佫��ȡ����ֵ��ӡ������̨�Ͻ���չʾ
 */
public class Test2 {
	public static void main(String[] args) {
		float a = Float.MIN_VALUE;// ʹ��MIN_VALUE������ȡ�����͵���Сֵ�������浽�����ͱ�����
		float b = Float.MAX_VALUE;// ʹ��MAX_VALUE������ȡ�����͵����ֵ�������浽�����ͱ�����

		double c = Double.MIN_VALUE;
		double d = Double.MAX_VALUE;

		// ʹ�������ӡ��佫�����ӡ������̨��
		System.out.println("float���͵���Сֵ=" + a);// 1.4E-45
		System.out.println("float���͵����ֵ=" + b);// 3.4028235E38

		System.out.println("double���͵���Сֵ=" + c);// 4.9E-324
		System.out.println("double���͵����ֵ=" + d);// 1.7976931348623157E308
	}
}
