package day0407_Բ;

/*
 * ���󣺽���������Բ������Բ�߾�����ԭ��ľ���
 */
public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);// ������������
		Point p2 = new Point(8, 2);

		Circle c1 = new Circle(8, p1);// ����뾶�͵�����½�һ��Բ
		Circle c2 = new Circle(3, p2);

		double j1 = c1.juLi();// �����������뷽�������ؾ�����

		System.out.println("Բc1�߽絽ԭ����̾���Ϊ��" + j1);// �����ӡ���
		System.out.println("Բc2�߽絽ԭ����̾���Ϊ��" + c2.juLi());// ֱ�Ӵ�ӡ����������
	}
}
