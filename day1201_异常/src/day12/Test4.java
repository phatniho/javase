package day12;

import java.util.Scanner;

/*
 * ���󣺸��ݵ�¼��������ز�ͬ�쳣��Ϣ
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("�û�����");
		String n = new Scanner(System.in).nextLine();
		System.out.print("���룺");
		String p = new Scanner(System.in).nextLine();
		try {
			login(n, p);
			System.out.println("��¼�ɹ���");
		} catch (UserNameNotFoundException e) {// ����Դ����쳣
			System.out.println("�û���������");// �����쳣������Ϣ
		} catch (WrongPasswordException e) {
			System.out.println("�������");
		}
	}

	// �׳��쳣
	private static void login(String n, String p) throws UserNameNotFoundException, WrongPasswordException {
		if (!n.equals("abc")) {
			throw new UserNameNotFoundException();// �׳�ָ���쳣
		}
		if (!p.equals("123")) {
			throw new WrongPasswordException();
		}
	}
}
