package day0703;

/*
 * ���࣬�̳г�����
 * ��д���з���
 */
public class Dog extends Pet {
	public Dog(String name) {// ���ι��췽��
		super(name);// ���������ݸ����ദ��
	}

	public Dog(String name, int full, int happy) {// ȫ�ι��췽��
		super(name, full, happy);// ���������ݸ����ദ��
	}

	public String cry() {// ��д����
		return "������~";// ��������ֵ
	}
}
