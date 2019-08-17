package day1203;

/*
 * �����
 */
public class Point {
	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		// ��ͬ���ԣ�������ͬ�Ĺ�ϣֵ
		// ��ͬ���ԣ�Ҫ����������ɢ�Ĺ�ϣֵ

		// ��ѧ�ҷ�����һ���㷨����һ�ֹ��õ���Ч�㷨
		final int prime = 31;// ����һ��������һ����31
		int result = 1;// result��ʼֵ����
		result = prime * result + x;// ִ������
		result = prime * result + y;// ִ������
		return result;// ���ؽ��
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {// �жϲ���obj��Point����
			Point p = (Point) obj;// ����ת��
			return x == p.x && y == p.y;// �Ƚ�ֵ�Ƿ���ȣ���ȷ���true
		}
		return false;// �������Ķ���������ת��ΪPoint���󣬷���false
	}

}
