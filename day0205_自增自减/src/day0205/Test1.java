package day0205;

/*
 * ���������Լ����ж������Լ�������˳��
 */
public class Test1 {
	public static void main(String[] args) {
		/*
		 * ��Ӷϵ� f11 �������ԣ��ڶϵ�λ����ͣ f6����ִ��
		 */
		int a = 6;
		System.out.println("a++=" + a++);// 6 ��ȡֵ������ӡȡ����ֵ
		System.out.println("a=" + a);// 7 ����������7
		System.out.println("\n----------");

		a = 6;
		System.out.println("++a=" + ++a);// 7 ����������ȡֵ7
		System.out.println("a=" + a);// 7 �Ѿ�������ɣ�ֱ�Ӵ�ӡ
		System.out.println("\n----------");

		a = 6;
		int b = a++;// ��ȡֵ6��a������Ϊ7�����ȡ����6��ֵ��b
		System.out.println("a=" + a);// 7 a�������ֵ
		System.out.println("b=" + b);// 6 bΪ��ȡ����ֵ
		System.out.println("\n----------");

		a = 6;
		a = a++;// ��ȡ��ֵ6��������Ϊ7�����ȡ����6��ֵ��a
		System.out.println("a=" + a);// 6 �ȱ�Ϊ7���ٱ��6
		System.out.println("\n----------");

		a = 6;
		a++;// ��ȡ��ֵ6��������Ϊ7
		System.out.println("a=" + a);// 7
		System.out.println("\n----------");

		a = 3;// ���¸�ֵ
		b = 4;// ���¸�ֵ
		System.out.println("����ǰ��ֵΪ��\na=" + a + "\nb=" + b);// ��ӡ����ǰ��ֵ
		int c = a;// ������ʱ����������a��ֵ
		a = b;// ��b��ֵ��ֵ��a
		b = c;// ����ʱ���������a��ֵ��ֵ��b
		System.out.println("�������ֵΪ��\na=" + a + "\nb=" + b);// ��ӡ�������ֵ
	}
}
