package day08_�ַ���;

import java.util.Scanner;

/*
 * �����ַ������ж��Ƿ�Գ�
 * abcdedcba
 */
public class Test2 {
	public static void main(String[] args) {
		outer: while (true) {
			System.out.println("������һ����Ҫ�жϵ��ַ���");
			String l = new Scanner(System.in).nextLine();
			if (!(l.matches("\\w+"))) {
				System.out.println("������������������Ӣ����ĸ");
				continue;
			} else {
				for (int i = 0, j = l.length() - 1; i < l.length(); i++, j--) {
					if (!(l.charAt(i) == l.charAt(j))) {
						System.out.println("����ַ������ǶԳƵģ�");
						break outer;
					}
				}
				System.out.println("����ַ����ǶԳƵģ�");
			}
		}
	}
}
