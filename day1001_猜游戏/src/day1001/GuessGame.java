package day1001;

import java.util.Scanner;

/*
 * 抽象类
 */
public abstract class GuessGame {// 抽象类
	public void start() {// 实体方法
		// 产生随机值
		String r = suiJi();
		// 显示提示
		tiShi();
		// 死循环猜
		while (true) {
			System.out.println("猜：");
			String c = new Scanner(System.in).nextLine();
			// 猜的值c，和随机值r进行比较
			String result = biJiao(r, c);
			System.out.println(result);
			// 比较结果result 是不是猜对的结果
			if (caiDui(result)) {
				System.out.println("猜对啦！");
				break;
			}
		}
	}

	public abstract String suiJi();// 抽象方法获取随机字符串

	public abstract void tiShi();// 抽象方法按需求提示

	public abstract String biJiao(String r, String c);// 抽象方法查找比较

	public abstract boolean caiDui(String result);// 抽象方法判断结果
}
