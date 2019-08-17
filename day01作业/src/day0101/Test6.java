package day0101;

import java.util.Scanner;

/*
 * 需求：从输入的个人信息中，评价学习情况
 */
public class Test6 {
	public static void main(String[] args) {
		System.out.print("请输入您的姓名：");
		String name = new Scanner(System.in).nextLine();

		System.out.print("请输入您的分数：");
		double score = new Scanner(System.in).nextDouble();

		if (score >= 90 && score <= 100) {
			System.out.println(name + "很优秀，请保持！");
		} else if (score >= 80 && score < 90) {
			System.out.println(name + "表现不错，不过还可以更努力！");
		} else if (score >= 70 && score < 80) {
			System.out.println("是题太难了？还是" + name + "你飘了？");
		} else if (score >= 60 && score < 70) {
			System.out.println(name + "你这样可不行啊！低保心态是不对的！");
		} else if (score >= 0 && score < 60) {
			System.out.println(name + "你回家准备挨打吧！");
		} else {
			System.out.println(name + "别捣乱！这个分数是不可能有的！");
		}
	}
}
