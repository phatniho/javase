package day03;

/*
 * ���󣺴�ӡ�žų˷���
 * ������forѭ��Ƕ�״�ӡ
 */
public class Test3_99 {
	public static void main(String[] args) {
		for99();// Ĭ�ϴ�ӡ99�˷���1*1��9*9��
		for99(3);// �����ض����֣�ֻ��ӡ1*1��n*n֮��ĳ˷���
		for99(3, 9);// ����������������ӡx*x��y*y֮��ĳ˷���
	}

	private static void for99() {// Ĭ�ϴ�ӡ1-9
		for99(9);// ���õ�����������9
	}

	private static void for99(int i) {// Ĭ�ϴ�ӡ1-i
		for99(1, i);// ����˫�������������1���յ�i
	}

	private static void for99(int i, int j) {// �Զ��������յ�
		for (int x = i; x <= j; x++) {// ѭ���ж���㣬����
			for (int y = i; y <= x; y++) {// ѭ���ж��ڲ㣬����
				System.out.print(y + "X" + x + "=" + x * y + "\t");// ���ڲ����У������ӡ���
			}
			System.out.println();// ��β����
		}
	}
}
