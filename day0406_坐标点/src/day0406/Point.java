package day0406;

/*
 * ����Point�࣬�����Ķ���ģ��
 * ���������������ԣ�x�����y����
 */
public class Point {
	int x;//����x�������
	int y;//����y�������

	public Point() {//�ղ������캯������������ʱ��ʼ�����������ֵ
		super();
		this.x = 0;//��ʼ��Ϊ0
		this.y = 0;//��ʼ��Ϊ0
	}

	public Point(int x, int y) {//�������������Ĺ��캯������������ʱֱ�Ӱ�ָ������������
		super();
		this.x = x;//�������ֵ��Ϊ�����ֵ
		this.y = y;
	}

	void set(int x, int y) {//�޸Ķ�������ķ���
		this.x = x;//�������ֵ�޸�Ϊ�����ֵ
		this.y = y;
	}

	void get() {//��ӡֵ�ķ���
		// �ѽ��յĲ���xֵ�����浽�����ʵ������x
		// �����ʵ����������ǰʵ���� - ���ڵ��õ�ʵ��
		System.out.println("\n---------");//�ָ���
		System.out.println("x=" + this.x);//�������ָ��ֵ��ӡ����
		System.out.println("y=" + this.y);
	}

}
