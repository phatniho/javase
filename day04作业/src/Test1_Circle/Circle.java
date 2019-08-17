package Test1_Circle;

/*
 * ���󣺶���һ��Բ�࣬���������ԣ��뾶��Բ�������
 */
public class Circle {
	int r;// ����뾶����
	Point p;// ����Բ����������

	public Circle() {// �ղ������캯����Ĭ��ֵ����
		set(0, p);// �������÷��������뾶��Բ������ΪĬ��ֵ
	}

	public Circle(int r, Point p) {// ˫�������캯��������ָ��ֵ
		set(r, p);// �������÷��������뾶��Բ������Ϊ�����ָ��ֵ
	}

	public void set(int r, Point p) {// set����������뾶ֵ��Բ����������
		this.r = r;// ���ð뾶Ϊ����뾶
		this.p = p;// ����Բ�������Ϊ���������
	}

	public double juLi() {// �������ķ��������÷��������Բ������㵽����Զ��ľ������ֵ
		double d = Math.sqrt(p.x * p.x + p.y * p.y);// �����Բ�ĵ�����ԭ��ľ���
		double s = Math.abs(d - r);// �����ֵ
		return s;// ���ؼ�����
	}
}
