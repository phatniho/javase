package day1001;

import java.util.Scanner;

/*
 * 需求：猜数字或猜字母游戏
 * 根据选择进入不同游戏
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("1.猜数字");// 选项提示
		System.out.println("2.猜字母");
		System.out.println("选：");
		int c = new Scanner(System.in).nextInt();// 获取输入的选项

		GuessGame game;// 新建父类对象
		if (c == 1) {// 判断输入的值是否满足条件
			game = new GuessNumberGame();// 创建对应的子类对象
			game.start();// 子类对象调用方法运行
		} else if (c == 2) {
			game = new GuessLetterGame();
			game.start();
		} else {
			System.out.println("没有这个游戏，请重新输入！");
		}
	}
}
