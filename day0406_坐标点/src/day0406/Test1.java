package day0406;

/*
 * Point�࣬�����Ķ���ģ��
 * {
 * 	int x;
 * 	int y;
 * 	set();
 * 	get();
 * }
 * p1 = {
 * 	x:3;
 * 	y:4;
 * }
 * p2 = {
 * 	x:1;
 * 	y:5;
 * }
 * p3 = {
 * 	x:8;
 * 	y:3;
 * }
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(2, 8);// ��������������������
		Point p2 = new Point(3, 5);
		Point p3 = new Point(6, 7);

//		p1.get();//������÷��������ӡֵ
//		p2.get();
//		p3.get();
//
//		p1.set(3, 4);//�޸Ķ�������ֵ
//		p2.set(1, 5);
//		p3.set(8, 3);

		p1.get();// ������÷��������ӡֵ
		p2.get();
		p3.get();

	}
}
