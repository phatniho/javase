package day1105;

import java.util.Scanner;

/*
 * �쳣��׽�봦��
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			try {// �쳣���������䣬��װ����
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {// �ض��쳣ʱ���ض�����
				System.out.println("��������������������������������");
				e.printStackTrace();
				continue;
			} catch (ArithmeticException e) {
				System.out.println("��������Ϊ0������������");
				continue;
			} catch (Exception e) {// �Բ�ȷ�����쳣���ͽ���ͳһ����
				System.out.println("������������������");
				continue;
			} finally {// һ����ִ�еĴ���
				System.out.println("\n----------");
			}
		}
	}

	private static void f() {
		System.out.println("�����������֣���,����:");
		String l = new Scanner(System.in).nextLine();
		String[] a = l.split(",");// ���ַ�����ָ��λ�ò�ֳ�����
		int i1 = Integer.parseInt(a[0]);// ���ַ�������ָ���Ǳ�ת��Ϊ����
		int i2 = Integer.parseInt(a[1]);
		int r = i1 / i2;
		System.out.println(r);
		// abcd NumberFormatException: For input string: "abcd" ���ָ�ʽ����
		// 555 ArrayIndexOutOfBoundsException: 1 ����Ǳ�Խ��
		// 333,0 ArithmeticException: / by zero ��ѧ�쳣
	}
}
