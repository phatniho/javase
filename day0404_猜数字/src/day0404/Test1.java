package day0404;

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
public class Test1 {
	public static void main(String[] args) {
		int i = 1 + new Random().nextInt(1000);// 生成随机数[1,1000)
		System.out.println("已经产生路一个[1,1001)范围的整数");// 打印提示
		System.out.println("请猜猜这个数字是几");

		guess(i);// 调用猜数字方法
	}

	private static void guess(int i) {
		int count = 1;// 定义猜数字的次数计数器
		while (true) {// 循环输入判断
			System.out.print("猜：");
			int b = new Scanner(System.in).nextInt();// 获取输入的数
			if (i > b) {// 判断大小
				System.out.println("小");// 打印提示
				count++;// 计数器加1
				continue;// 继续循环
			}
			if (i < b) {
				System.out.println("大");
				count++;
				continue;
			}
			System.out.println("中猜了" + count + "次");// 猜中输出结果
			break;// 结束循环
		}

	}
}
