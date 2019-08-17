package day07��ҵ_���ӳ���;

import java.util.Random;

/*
 * ������
 * name
 * full
 * happy
 * feet()
 * play()
 * punish()
 * cry()
 */
public class Pet {
	String name;// ��Ա����
	int full;
	int happy;

	public Pet(String name) {// ���ι��췽��
		this(name, 50, 50);// ��ʼ����Ա����ΪĬ��ֵ
	}

	public Pet(String name, int full, int happy) {// ȫ�ι��췽��
		this.name = name;// ����ÿ����Ա����Ϊ����Ĳ���ֵ
		this.full = full;
		this.happy = happy;
	}

	public void feet() {// ιʳ�ж�
		if (full >= 100) {
			System.out.println(name + "�Ѿ��Ա��ˣ�");
			return;// ���˲�����ִ��ιʳ
		}
		System.out.println("ιʳ" + name + "һЩʳ��");
		full += 50;
		System.out.println("��ʳ��Ϊ��" + full);
	}

	public void play() {// ��ˣ����
		if (full <= 0) {
			System.out.println(name + "���ˣ��治���ˣ�");
			return;// ���˲���
		}
		if (happy <= 0) {
			System.out.println(name + "�����ģ������������ˣ�");
			return;// �����Ĳ���
		}
		full -= 10;
		happy += 10;
		System.out.println("��ʳ�ȣ�" + full + "�����ֶȣ�" + happy);
	}

	public void punish() {// ����ͷ�����
		play();// ������ˣ�����ж�
		int i = new Random().nextInt(6);// ���������
		String s = "";// Ĭ��ֵ
		switch (i) {// ������������ж�Ӧ����
		case 0:
			s = "������ĸ�����һ��";
			happy += 10;
			break;
		case 1:
			s = "��Ͷι��һ����ʳ";
			happy += 10;
			full += 10;
			break;
		case 2:
			s = "���ǳ���һ��";
			happy -= 10;
			break;
		case 3:
			s = "������һ��";
			happy -= 10;
			full -= 10;
			break;
		case 4:
			s = "��ȥ����һȦ";
			happy += 10;
			full -= 10;
			break;
		case 5:
			s = "������һ��ҩ";
			happy -= 10;
			full += 10;
			break;
		}
		System.out.println(name + s + "��������" + cry() + "������~");
		System.out.println("��ʳ�ȣ�" + full + "�����ֶȣ�" + happy);
	}

	public String cry() {
		return "";// ���з�����������д
	}
}
