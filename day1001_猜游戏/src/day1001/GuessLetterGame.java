package day1001;

import java.util.Arrays;
import java.util.Random;

public class GuessLetterGame extends GuessGame {
	public String suiJi() {
		// 定义可变字符串StringBuilder
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < 5; i++) {// 定义循环遍历前5个元素
			// 随机取后面一个元素的位置
			int j = i + new Random().nextInt(sb.length() - i);
			char t = sb.charAt(i);// 设置临时变量保存初始元素
			sb.setCharAt(i, sb.charAt(j));// 将初始元素修改成随机位置元素
			sb.setCharAt(j, t);// 将随机位置元素修改为保存的初始元素
		}
		sb.delete(5, sb.length());// 遍历完成后删除5以后的字符
		return sb.toString();// 将剩下的前五个字符转换成字符串返回给调用位置

//		char[] c = new char[26];//定义char类型数组，长度为26
//		for (int i = 0; i < c.length; i++) {//遍历数组
//			c[i] = (char) (i + 65);//填入大写字母的对应码表，并转换为char类型
//		}
//		for (int j = 0; j < 5; j++) {//遍历循环前五个元素
//			int c1 = new Random().nextInt(26);//随机取后面的一个元素的坐标
//			char t = c[j];//两个元素进行交换
//			c[j] = c[c1];
//			c[c1] = t;
//		}
//		char[] c1 = Arrays.copyOf(c, 5);//将原数组前五个元素复制到新数组
//		String s = String.copyValueOf(c1);//将新数组转换为字符串
//		return s;//返回字符串

	}

	public void tiShi() {// 按子类不同需求重写方法
		System.out.println("已经产生了5个不重复的大写字母，请猜这5个大写字母是什么");
	}

	public String biJiao(String r, String c) {// 比较两个值是否相同
		int a = 0, b = 0;// 定义计数器
		for (int i = 0; i < r.length(); i++) {// 外层循环遍历
			for (int j = 0; j < c.length(); j++) {// 内层循环遍历
				if (c.charAt(j) == r.charAt(i)) {// 依次比较两个字符串的每个字符
					if (i == j) {// 如果字符相同，判断是否为同一位置
						a++;// 都相等则正确计数加1
					} else {
						b++;// 位置不等则计数加1
					}
					break;// 相等的判断完后直接进入下一循环
				}
			}
		}
		return a + "A" + b + "B";// 返回比较结果连接成字符串
	}

	public boolean caiDui(String result) {// 判断是否满足猜对条件
		return result.equals("5A0B");
	}

}