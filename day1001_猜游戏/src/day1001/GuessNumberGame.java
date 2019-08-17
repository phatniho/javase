package day1001;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	public String suiJi() {
		int i = 1 + new Random().nextInt(1000);// 生成随机值
		return Integer.toString(i);// 转型为String
	}

	public void tiShi() {// 根据不同子类需求提示
		System.out.println("已经产生了一个[1,1001)范围的整数，请猜这个数是几");
	}

	public String biJiao(String r, String c) {// 比较两个值是否相同
		int i = Integer.parseInt(r);// 将生成的值转回整数类型
		int j = Integer.parseInt(c);// 将输入的值转换为整数类型
		if (i > j) {// 比较大小
			return "小";// 提示
		} else if (i < j) {
			return "大";
		} else {
			return "中";
		}
	}

	public boolean caiDui(String result) {// 判断是否猜对
		return result.equals("中");
	}

}
