package day1001;

import java.util.Scanner;

/*
 * ������
 */
public abstract class GuessGame {// ������
	public void start() {// ʵ�巽��
		// �������ֵ
		String r = suiJi();
		// ��ʾ��ʾ
		tiShi();
		// ��ѭ����
		while (true) {
			System.out.println("�£�");
			String c = new Scanner(System.in).nextLine();
			// �µ�ֵc�������ֵr���бȽ�
			String result = biJiao(r, c);
			System.out.println(result);
			// �ȽϽ��result �ǲ��ǲ¶ԵĽ��
			if (caiDui(result)) {
				System.out.println("�¶�����");
				break;
			}
		}
	}

	public abstract String suiJi();// ���󷽷���ȡ����ַ���

	public abstract void tiShi();// ���󷽷���������ʾ

	public abstract String biJiao(String r, String c);// ���󷽷����ұȽ�

	public abstract boolean caiDui(String result);// ���󷽷��жϽ��
}
