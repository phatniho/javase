package day0303;

/*
 * 需求：练习for循环
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--1到10------------");
		f1();
		System.out.println("\n--10到1------------");
		f2();
		System.out.println("\n--2,4,6,8,10------------");
		f3();
		System.out.println("\n--8,88,888,8888,88888,888888,8888888,88888888,888888888,8888888888------------");
		f4();
		f6();
		System.out.println("\n--------------");
		f5();
	}

	static void f1() {// 从1 到10顺序打印
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	static void f2() {// 从10到1倒序打印
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

	static void f3() {// 从2到10顺序打印双数
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	static void f4() {// 从1个8，2个8，依次递增打印
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("8");
			}
			System.out.println();
		}
	}

	static void f6() {// 打印8，88，888依次递增，注意int类型会超出范围，可以使用long型防止超出范围
		long l = 0;
		for (int i = 1; i <= 10; i++) {
			l = 10 * l + 8;
			System.out.println(l);
		}
	}

	static void f5() {// 无限循环
		for (int i = 1;; i++) {
			System.out.println(i);
		}
	}
}
