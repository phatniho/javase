package day0202;

/*
 * ���󣺻������ͱ���ֵ����
 * 1.�����ı���ֵ��int
 * 2.�������ı���ֵ��double
 * 3.��intС����������char��short��byte���ڷ�Χ�ڿ���ֱ�Ӹ�ֵ
 * 4.��׺
 * 		d	-double
 * 		l	-long
 * 		f	-float
 * 5.ǰ׺
 * 		0x1f3e 	-16����
 * 		0b111 	-2����
 * 		007  	-8����
 * 		\uffff 	-char���͵�16����
 * ��ϰchar����
 * ������
 * Unicode�����0-65535�����֣�ÿ��λ�÷ֱ��Ӧһ���ַ�
 * char���Ϳ���ֱ�ӵ�������������
 */
public class Test1 {
	public static void main(String[] args) {
		char c1 = 'a';// �����ַ�
		char c2 = 97;// ��Ӧ�����λ��
		char c3 = 'b';
		char c4 = 98;
		char c5 = '��';
		char c6 = 20320;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println('��' + 0);// 24429
		System.out.println('��' + 0);// 28023

		System.out.println('\u0061');// a
		System.out.println('\u4e2d');// ��
		System.out.println('\u5f6d');// ��
		System.out.println('\u6d77');// ��

	}
}
