package day0703;

/*
 * è�࣬�̳г�����
 * ��д���з���
 */
public class Cat extends Pet {
	public Cat(String name) {// ���ι��췽��
		super(name);// ���ݸ����ദ��
	}

	public Cat(String name, int full, int happy) {// ���ι��췽��
		super(name, full, happy);// ���ݸ����ദ��
	}

	public String cry() {// ��д����
		return "������~";// ��������ֵ
	}
}
