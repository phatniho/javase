package day12;

import java.util.Scanner;

/*
 * 需求：根据登录情况，返回不同异常信息
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("用户名：");
		String n = new Scanner(System.in).nextLine();
		System.out.print("密码：");
		String p = new Scanner(System.in).nextLine();
		try {
			login(n, p);
			System.out.println("登录成功！");
		} catch (UserNameNotFoundException e) {// 针对性处理异常
			System.out.println("用户名不存在");// 返回异常处理信息
		} catch (WrongPasswordException e) {
			System.out.println("密码错误");
		}
	}

	// 抛出异常
	private static void login(String n, String p) throws UserNameNotFoundException, WrongPasswordException {
		if (!n.equals("abc")) {
			throw new UserNameNotFoundException();// 抛出指定异常
		}
		if (!p.equals("123")) {
			throw new WrongPasswordException();
		}
	}
}
