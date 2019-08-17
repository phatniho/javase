package day0804;

/*
 * 需求:正则表达式
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
		System.out.println("身份证号：");
		String s = new Scanner(System.in).nextLine();
		String regex = "\\d{15}|\\d{17}[\\dxX]";// "[0-9]{15}|[0-9]{17}[0-9xX]";

		// 判断字符串s能否匹配指定的正则表达式
		if (s.matches(regex)) {
			System.out.println("格式正确");
		} else {
			System.out.println("格式错误");
		}
	}

	private static void f2() {
		System.out.println("固定电话：");
		String s = new Scanner(System.in).nextLine();
		String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";

		// 判断字符串s能否匹配指定的正则表达式
		if (s.matches(regex)) {
			System.out.println("格式正确");
		} else {
			System.out.println("格式错误");
		}

	}
}
