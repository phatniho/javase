package day0804;

/*
 * ����:������ʽ
 */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n-----------");
		f1();
		System.out.println("\n-----------");
		f2();
	}

	private static void f1() {
		System.out.println("���֤�ţ�");
		String s = new Scanner(System.in).nextLine();
		String regex = "\\d{15}|\\d{17}[\\dxX]";// "[0-9]{15}|[0-9]{17}[0-9xX]";

		// �ж��ַ���s�ܷ�ƥ��ָ����������ʽ
		if (s.matches(regex)) {
			System.out.println("��ʽ��ȷ");
		} else {
			System.out.println("��ʽ����");
		}
	}

	private static void f2() {
		System.out.println("�̶��绰��");
		String s = new Scanner(System.in).nextLine();
		String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";

		// �ж��ַ���s�ܷ�ƥ��ָ����������ʽ
		if (s.matches(regex)) {
			System.out.println("��ʽ��ȷ");
		} else {
			System.out.println("��ʽ����");
		}

	}
}
