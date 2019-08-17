package day0202;

/*
 * ���󣺻��������������
 * 1.���������������ͣ�����������������һ��
 * 2.byte��short��char���ֱ�intС������������ʱ�����Զ�ת��int
 * 3.�����������
 * 		�������㣬�������Ϊ��ʱ��תȦ��������Χ����������ת��һ������Ľ��
 * 		Integer.MAX_VALUE + 1 = Integer.MIN_VALUE
 * 4.���������㲻��ȷ
 * 		IEEE-754�淶���������ӵ�������ʦЭ�ᣩ�涨�˼�����и������ı�ʾ��ʽ��
 * 		���������ʽ��������ĳЩ����������ʱ���ͻ��������ȷ���
 * 5.������������ֵ  ���������޷���������
 * 		Infinity �����
 * 			3.14 / 0
 *		NaN      Not a Number
 * 			����������������Math.sqrt(-5)
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println(3 / 2);// 1
		System.out.println(3d / 2);// 1.5
		// \n �ǻ��з���ת���
		System.out.println("\n------------");

		char c1 = 'S';
		char c2 = 'B';
		System.out.println(c1 + c2);// int + int
		System.out.println("\n------------");

		System.out.println(Integer.MAX_VALUE + 1);// �������������������Χ�����Сֵ��ʼ
		System.out.println(300000000 * 60 * 60 * 24 * 365);// �����������
		System.out.println(300000000 * 60 * 60 * 24 * 365L);// �Ӻ���Ҳ���У�ǰ���Ѿ����
		System.out.println(300000000L * 60 * 60 * 24 * 365);// ���Լӵ�һ������ת��
		System.out.println(300000000 * 60L * 60 * 24 * 365);// Ҳ���Լӵڶ���
		System.out.println("\n------------");

		System.out.println(2 - 1.9);// ����ȷ
		System.out.println(2 - 1.8);// ����ȷ
		System.out.println(2 - 1.7);// ����ȷ
		System.out.println(2 - 1.6);// ����ȷ
		System.out.println(2 - 1.5);// ��ȷ
		System.out.println(4.35 * 100);// ����ȷ
		System.out.println(4.36 * 100);// ����ȷ
		System.out.println(4.37 * 100);// ��ȷ
		System.out.println(4.38 * 100);// ��ȷ
		System.out.println(4.39 * 100);// ����ȷ
		System.out.println("\n------------");

		System.out.println(3.14 / 0);// Infinity
		System.out.println(Math.sqrt(-6));// NaN ʹ����ѧ���߿�ƽ��
	}
}
