package day0307;

/*
 * ����99�˷���
 * ����
 */
public class Test1_99 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {// ������Ȧ����������
			for (int j = 1; j <= i; j++) {// ������Ȧ����������
				if (j == 3 && (i == 3 || i == 4)) {// �������ж϶���
					System.out.print(" ");// �ո���Ŷ���
				}
				System.out.print(j + "*" + i + "=" + (i * j) + " ");// ��ӡ��ʽ
			}
			System.out.println();// ��β����
		}
	}
}
