package day0303;

/*
 * ������ϰforѭ��
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--1��10------------");
		f1();
		System.out.println("\n--10��1------------");
		f2();
		System.out.println("\n--2,4,6,8,10------------");
		f3();
		System.out.println("\n--8,88,888,8888,88888,888888,8888888,88888888,888888888,8888888888------------");
		f4();
		f6();
		System.out.println("\n--------------");
		f5();
	}

	static void f1() {// ��1 ��10˳���ӡ
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	static void f2() {// ��10��1�����ӡ
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

	static void f3() {// ��2��10˳���ӡ˫��
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	static void f4() {// ��1��8��2��8�����ε�����ӡ
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("8");
			}
			System.out.println();
		}
	}

	static void f6() {// ��ӡ8��88��888���ε�����ע��int���ͻᳬ����Χ������ʹ��long�ͷ�ֹ������Χ
		long l = 0;
		for (int i = 1; i <= 10; i++) {
			l = 10 * l + 8;
			System.out.println(l);
		}
	}

	static void f5() {// ����ѭ��
		for (int i = 1;; i++) {
			System.out.println(i);
		}
	}
}
