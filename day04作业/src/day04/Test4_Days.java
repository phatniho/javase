package day04;

import java.util.Scanner;

/*
 * ���������ꡢ�£�������µ�����
 * 1��3��5��7��8��10��12����31�죬
 * 4��6��9��11����30�죬
 * ����2����29�죬ƽ��2����28��
 * ������
 * �Ӽ��̻�ȡ�������£�ʹ��switch�������ж�
 */
public class Test4_Days {
	public static void main(String[] args) {
		System.out.print("��������Ҫ�жϵ���ݣ�");
		int y = new Scanner(System.in).nextInt();// ��ȡ��������

		System.out.print("��������Ҫ�жϵ��·ݣ�");
		int m = new Scanner(System.in).nextInt();// ��ȡ������·�

		days(y, m);// ���÷��������ж�
	}

	private static void days(int y, int m) {
		if (y < 0) {// �ж�����Ƿ�Ϊ��Ч��Χ
			System.out.println("���������󣬲���Ϊ����");// ������������ʾ����
			return;// ��������
		}
		if (m > 12 || m < 1) {// �ж��·��Ƿ�Ϊ��Ч��Χ
			System.out.println("�·�������󣬲�����Ч��Χ");// ������������ʾ����
			return;// ��������
		}
		int d = 31;// ������Ĭ��ֵ��Ϊ31������ʡ���жϴ��µĹ���
		switch (m) {// ��switch����ж��·�
		case 4:// С�·ݣ���͸ִ��
		case 6:
		case 9:
		case 11:
			d = 30;// �������޸�Ϊ30��
			break;// ����ѭ��
		case 2:// �����·ݵ��ж�
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {// �ж��Ƿ�Ϊ����
				d = 29;// �������������޸�Ϊ29��
			} else {// �����������
				d = 28;// �������޸�Ϊ28��
			}
			break;// ����ѭ��
		}
		System.out.println(y + "��" + m + "����" + d + "��");// �����ӡ���
	}
}
