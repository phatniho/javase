package day0407_Բ;

/*
 * ���󣺶���һ��Բ�࣬�����������ԣ��뾶��Բ�������
 */
public class Circle {
	int r;// ����뾶
	Point o;// ����Բ����������

	public Circle() {// �ղ������캯��
		this.r = 0;// ���뾶��ΪĬ��ֵ0
		this.o.set(0, 0);// ��Բ����ΪĬ��ֵ��0��0��
	}

	public Circle(int r, Point o) {// ����ָ�������Ĺ��캯��
		this.r = r;// ���뾶����Ϊָ��ֵ
		this.o = o;// ��Բ������Ϊָ����������
	}

	double juLi() {// ��Բ������ԭ��ľ��뷽��
		double s = Math.sqrt(this.o.x * this.o.x + this.o.y * this.o.y);// �����
		return Math.abs(s - this.r);// ���ؽ���ľ���ֵ
	}
}
