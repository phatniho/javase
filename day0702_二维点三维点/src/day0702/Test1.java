package day0702;

/*
 * ���󣺶�ά�����ά��
 * ��ά��̳ж�ά��
 */
public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);// �½���ά��
		Point p2 = new Point3D(9, 12, 20);// �½���ά��

		System.out.println(p1.toString());// ���÷���
		System.out.println(p1.distance());
		System.out.println("--------------");
		System.out.println(p2.toString());
		System.out.println(p2.distance());

		f(p1);
		f(p2);// ����ת�ͣ�ת�ͳɸ�����
	}

	public static void f(Point p) {
		System.out.println("����������Point");
		System.out.println(p.toString());//��ʵ���д����ൽ������ҷ���
	}
}
