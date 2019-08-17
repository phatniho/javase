package day1105;

import java.util.Scanner;

/*
 * 异常捕捉与处理
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			try {// 异常发生点的语句，包装起来
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {// 特定异常时做特定处理
				System.out.println("输入数字数量错误！请重新输入两个数");
				e.printStackTrace();
				continue;
			} catch (ArithmeticException e) {
				System.out.println("除数不能为0！请重新输入");
				continue;
			} catch (Exception e) {// 对不确定的异常类型进行统一处理
				System.out.println("其他错误！请重新输入");
				continue;
			} finally {// 一定会执行的代码
				System.out.println("\n----------");
			}
		}
	}

	private static void f() {
		System.out.println("输入两个数字，用,隔开:");
		String l = new Scanner(System.in).nextLine();
		String[] a = l.split(",");// 将字符串从指定位置拆分成数组
		int i1 = Integer.parseInt(a[0]);// 将字符串数组指定角标转换为整数
		int i2 = Integer.parseInt(a[1]);
		int r = i1 / i2;
		System.out.println(r);
		// abcd NumberFormatException: For input string: "abcd" 数字格式错误
		// 555 ArrayIndexOutOfBoundsException: 1 数组角标越界
		// 333,0 ArithmeticException: / by zero 数学异常
	}
}
