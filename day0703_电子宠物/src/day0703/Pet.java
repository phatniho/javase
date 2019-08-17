package day0703;

/*
 * ������
 * ��Ա��
 * name��
 * full��
 * happy��
 * feed()
 * play()
 * punish()
 * cry()
 */
public class Pet {
	String name;// ��Ա����
	int full;
	int happy;

	public Pet(String name) {// ���ι��췽��
		this(name, 50, 50);// Ĭ��ֵ����
	}

	public Pet(String name, int full, int happy) {// ȫ�ι��췽��
		this.name = name;// ��Աֵ����
		this.full = full;
		this.happy = happy;
	}

	public void feed() {// ιʳ����
		if (full == 100) {// �жϱ�ʳ��
			System.out.println(name + "�Ѿ��Ա���");
			return;// ��ʳ�����򲻼���ιʳ
		}
		System.out.println("��" + name + "ιʳ");// ��ʾ��Ϣ
		full += 10;// ιʳ
		System.out.println("��ʳ�ȣ�" + full);// ��ӡ��ʳ����Ϣ
	}

	public void play() {// ��ˣ����
		if (full == 0) {// �жϱ�ʳ��
			System.out.println(name + "���ˣ�����������");
			return;// Ϊ���򲻼�������
		}
		System.out.println("��" + name + "��ˣ");
		happy += 10;// ���ֶ�����
		full -= 10;// ��ʳ�ȼ���
		System.out.println("���ֶȣ�" + happy);
		System.out.println("��ʳ�ȣ�" + full);
	}

	public void punish() {// �ͷ�����
		// ��ͬ�Ĵ��룬�͵��÷���
		System.out.println("��" + name + "��pp��" + name + "�����˿޽У�" + cry());
		happy -= 10;// ���ֶȼ���
		System.out.println("���ֶȣ�" + happy);
	}

	public String cry() {
		// ��������룬��������������д�������
		return "�˴��п޽���~";
	}
}
