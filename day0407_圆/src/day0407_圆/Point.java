package day0407_Բ;

/*
 * ���󣺽���Բ���������
 */
public class Point {
	int x;//����x�������
	int y;//����y�������

	public Point() {//�ղ������캯��������Ա��������ΪĬ��ֵ0
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {//����ָ�������Ĺ��캯��������Ա������ֵ��Ϊ�����ֵ
		this.x = x;
		this.y = y;
	}

	void set(int x, int y) {//���ó�Ա����ֵ�ķ���������Ա����ֵ�޸�Ϊָ��ֵ
		this.x = x;
		this.y = y;
	}
}
