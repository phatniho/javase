package day0801;

/*
 * Object��ķ���
 * toString()
 * equals()
 */
public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);

		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println(p1 == p2);
		// equals()�����Ƚ�ʲô
		// Ҫ���뷽��������������Ƚϵ���ʲô
		// Object�бȽϵ����ڴ��ַ
		System.out.println(p1.equals(p2));
	}
}
