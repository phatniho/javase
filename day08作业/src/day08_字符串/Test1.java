package day08_�ַ���;

import java.util.Scanner;

/*
 * ��������email��ַ����ȡ���ֲ���
 * abc@def.com  ��ȡabc
 * \w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("��������������ַ����q�˳�");
			String e = new Scanner(System.in).nextLine();

			if (e.equals("q")) {
				System.out.println("���������");
				break;
			}
			if (!(e.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))) {
				System.out.println("����һ����Ч�������ַ������������");
				continue;
			} else {
				String[] s = e.split("@");
				System.out.println(s[0]);
			}
		}
	}
}
