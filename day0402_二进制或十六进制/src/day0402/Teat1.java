package day0402;

import java.util.Scanner;

/*
 * ������������ƻ�ʮ�����ƣ���ʾ10���Ƶ�ֵ
 * 0b  ��ͷΪ������
 * 0x  ��ͷΪʮ������
 * Ҫȡ����ͷ֮����ַ���������ת��
 * ѭ�����룬ֱ������q�˳�
 */
public class Teat1 {
	public static void main(String[] args) {
		outer: while (true) {// ѭ�������ж�
			System.out.print("���������������0b������ʮ����������0x�����˳��밴q/Q��");// ��ʾ���
			String s = new Scanner(System.in).nextLine();// ��ȡ������ַ���
			s.trim();

			if (s.equals("Q") || s.equals("q")) {// �ж�������ַ����Ƿ�Ϊ�ض��������
				System.out.println("�������");// ����������
				break;// ����ѭ��
			}
			if (!(s.startsWith("0b") || s.startsWith("0x"))) {
				System.out.println("����Ĳ�����Чʮ�����ƻ�����ƣ�����������");
				continue;
			}
			// �ַ�����������3
			if (s.length() < 3) {
				System.out.println("���ȴ���");
				continue;
			}
			if (s.startsWith("0b")) {
				for (int i = 2; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!(c == '0' || c == '1')) {
						System.out.println("������Ч�Ķ�������");
						continue outer;
					}
				}
			}
			if (s.startsWith("0x")) {
				for (int i = 2; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f'))) {
						System.out.println("������Ч��ʮ��������");
						continue outer;
					}
				}
			}
			int x = f(s);// �����������f������ֵ
			if (x == -1) {// �ж�ֵ�Ƿ�Ϊ-1
				System.out.print("��������,");// ��Ϊ-1�����������
			} else {// ����������
				System.out.println(s + "��ʮ�����ǣ�" + x);// ��ӡ���
				System.out.println("\n----------");// �ָ���
			}
		}

	}

	private static int f(String s) {
		String m = s.toLowerCase();// ���ַ����еĴ�д��ĸת��ΪСд��s.toUpperCase()Сдת��Ϊ��д��
		String n = m.substring(2);// ��ָ��λ�ÿ�ʼȡ�Ӵ�
		int a = 0;// �����������ת�����ֵ��Ĭ��ֵ��Ϊ0
		if (m.startsWith("0b")) {// �ж��ַ�����ͷ�Ƿ�Ϊ�ض�ֵ
			a = Integer.parseInt(n, 2);// �ַ���ת��Ϊ�������ͣ����ض�����ת��Ϊʮ���ƣ�
		} else if (m.startsWith("0x")) {
			a = Integer.parseInt(n, 16);
		} else {// ���������򷵻�-1
			return -1;
		}
		return a;// ����a��ֵ
	}
}
