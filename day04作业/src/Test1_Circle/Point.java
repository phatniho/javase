package Test1_Circle;

/*
 * ���󣺶���һ��������࣬��x����ֵ��y����ֵ��������
 */
public class Point {
	int x;// �������x
	int y;// �������y

	public void set(int x, int y) {// set����������������x�����y����
		this.x = x;// ��x��������Ϊ����Ĳ���
		this.y = y;// ��y��������Ϊ����Ĳ���
	}

	public Point() {// �ղ������췽��
		set(0, 0);// ����set��������Ĭ�ϵ����������Ϊ��0��0��
	}

	public Point(int x, int y) {// ˫�������췽��
		set(x, y);// ����set����������������Ϊָ������ֵ
	}
}
