package day0702;

/*
 * ��ά�㣺
 * ��Ա��
 * x��
 * y��
 * toString()
 * distance()
 */
public class Point {
	int x;// ��Ա����
	int y;

	public Point(int x, int y) {// ȫ�ι��췽��
		this.x = x;// ������ֵ����ʼ����������
		this.y = y;
	}

	public String toString() {// ���ַ�ʽ
		return "(" + x + "," + y + ")";// ���ַ�ʽ
	}

	public double distance() {// ���㷽ʽ
		return Math.sqrt(x * x + y * y);// ���㷽ʽ
	}
}
