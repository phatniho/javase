package day04;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：猜数字
 * 已经产生路一个[1,1001)范围的整数
 * 请猜猜这个数字是几
 * 
 * 猜:1
 * 小（继续）
 * 猜:1000
 * 大（继续）
 * 猜:455
 * 对（结束）
 */
public class Test9_Num {
	public static void main(String[] args) {
		int i = 1 + new Random().nextInt(1000);
		System.out.println("已经产生了一个[1,1000)的整数，猜猜是几？");

		while (true) {
			System.out.print("猜:");
			int j = new Scanner(System.in).nextInt();

			if (j > i) {
				System.out.println("大");
			} else if (j < i) {
				System.out.println("小");
			} else {
				System.out.println("中！");
				break;
			}
		}
	}

}
