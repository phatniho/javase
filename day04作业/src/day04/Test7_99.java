package day04;

/*
 * ���󣺴�ӡ99�˷���
 */
public class Test7_99 {
	public static void main(String[] args) {
		CFB();// ���÷�����ӡ99�˷���
	}

	private static void CFB() {
		for (int i = 1; i <= 9; i++) {// ���ѭ������������
			for (int j = 1; j <= i; j++) {// �ڲ�ѭ������������
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");// ��ӡ��ʽ
			}
			System.out.println();// ��β����
		}
	}
}
