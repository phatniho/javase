package day0601;

import java.util.Random;

/*
 * ����Ӣ����
 * ���ԣ�
 * ���id��
 * ����attack��
 * ����defence��
 * �ٶ�speed��
 * Ѫ��blood��
 * show()
 * level()
 */
public class Hero {
	String name;// �����б�
	int attack;
	int defence;
	int speed;
	int blood;

	public Hero(String name) {
		this.name = name;
		this.attack = 60 + new Random().nextInt(40);// �������ֵ
		this.defence = 60 + new Random().nextInt(40);
		this.speed = 60 + new Random().nextInt(40);
		this.blood = 60 + new Random().nextInt(40);
	}

	public void show() {// չʾ��Ӣ������
		int[] a = numa();// ��Ӣ������ֵ
		String[] b = numb();// ����ֵת��Ϊ����
		numc(a, b);// ������ֵ�ֱ�����
		String s = numd(b);// �ۺ�����ϡ�ж�
		System.out.println("Ӣ�����ԣ�");// �����ӡ����
		System.out.println("�ƺţ�" + this.name);
		System.out.println("������Ϊ��" + a[0]);
		System.out.println("������Ϊ��" + a[1]);
		System.out.println("�ٶ�Ϊ��" + a[2]);
		System.out.println("Ѫ��Ϊ��" + a[3]);
		System.out.println("���������֣�" + b[0]);
		System.out.println("���������֣�" + b[1]);
		System.out.println("�ٶ����֣�" + b[2]);
		System.out.println("Ѫ�����֣�" + b[3]);
		System.out.println(this.name + "��һ��" + s + "�����Ӣ�ۣ�");
	}

	public String level() {// ���۸�Ӣ��ϡ�еȼ�
		int[] a = numa();// ��Ӣ�۵�����ֵ
		String[] b = numb();// ����ֵת��Ϊ����
		numc(a, b);// ������ֵ����
		String s = numd(b);// �ۺ�����ϡ�ж�
		return s;// ����ϡ�ж�
	}

	public String numd(String[] b) {// ����Ӣ������ֵ���������������Ӣ��ϡ�ж�
		int count = 0;// ����ϡ�ж�ָ�������
		for (int i = 0; i < b.length; i++) {// ѭ���ж�Ӣ�������������������
			if (b[i].equals("s")) {// �����������
				count++;// ָ���1
			}
		}
		String s;// �½����������ڱ���Ӣ��ϡ�ж��ַ���
		switch (count) {// ����������ָ�������������Ӣ��ϡ�ж�
		case 4:// ȫ��Ϊ���
			s = "SSS";// ��ñ�ʾ��ʽ
			break;// ֹͣ�����ж�
		case 3:// ����Ϊ�ϵ�
			s = "SSR";// �ϵȱ�����ʽ
			break;// ֹͣ�����ж�
		case 2:// ˫��Ϊ�е�
			s = "SR";// �еȱ�����ʽ
			break;// ֹͣ�����ж�
		case 1:// ����Ϊ�µ�
			s = "R";// �µȱ�����ʽ
			break;// ֹͣ�����ж�
		default:// ����Ϊ���
			s = "N";// ��������ʽ
			break;// ֹͣ�����ж�
		}
		return s;// ����ϡ�жȱ�����ʽ
	}

	public void numc(int[] a, String[] b) {// ����Ӣ������ֵ�޸����ֵȼ�
		for (int i = 0; i < a.length; i++) {// ѭ���ж�4������
			if (a[i] >= 90) {// ��������ʱ
				b[i] = "s";// �������޸�Ϊ��Ӧ�ȼ�
			} else if (a[i] >= 80) {
				b[i] = "a";
			} else if (a[i] >= 70) {
				b[i] = "b";
			} else if (a[i] >= 60) {
				b[i] = "c";
			}
		}
	}

	public String[] numb() {// ����Ӣ������Ĭ������
		String[] b = new String[4];// �������鱣������
		String s1 = "d";// ����Ĭ��ֵ
		String s2 = "d";
		String s3 = "d";
		String s4 = "d";
		b[0] = s1;// ��Ĭ��ֵ�浽������
		b[1] = s2;
		b[2] = s3;
		b[3] = s4;
		return b;// ���ظ�������
	}

	public int[] numa() {// �����Ӣ�۵�����ֵ
		int[] a = new int[4];// �������鱣��
		a[0] = this.attack;// ���湥����
		a[1] = this.defence;// ���������
		a[2] = this.speed;// �����ٶ�
		a[3] = this.blood;// ����Ѫ��
		return a;// ���ظ����鵽����λ��
	}
}
