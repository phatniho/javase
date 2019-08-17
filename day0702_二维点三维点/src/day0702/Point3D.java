package day0702;

/*
 * ��ά��
 * �̳ж�ά��
 * ���г�Ա��
 * z��
 * ��д
 * toString()����z��������
 * distance()����z��������
 */
public class Point3D extends Point {
	int z;// ���г�Ա����

	public Point3D(int x, int y, int z) {// ȫ�ι��췽��
		// ����û���޲ι��죬�����ֶ������вι���
		super(x, y);// ���ø���ȫ�ι��췽��
		this.z = z;// �������г�Ա����
	}

	public String toString() {// ��д����
		return "(" + x + "," + y + "," + z + ")";// ���б�﷽ʽ
	}

	public double distance() {// ��д����
		return Math.sqrt(x * x + y * y + z * z);// ���м��㷽ʽ
	}
}
