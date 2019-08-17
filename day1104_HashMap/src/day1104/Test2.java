package day1104;

import java.util.HashMap;
import java.util.Scanner;

/*
 * HashMap练习：输入一个字符串，统计这个字符串中各字符出现的次数
 * 
 * 新建一个HashMap对象map
 * i循环遍历字符串s
 * ----从s取出i位置的一个字符c
 * ----从map取字符c对应的计数值Integer count
 * ----判断count是null
 * ------放入c--1
 * ----否则
 * ------c--count+1
 * 返回map
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入一个字符串");
		String s = new Scanner(System.in).nextLine();
		// 统计方法
		HashMap<Character, Integer> map = tongJi(s);// 返回HashMap集合
		System.out.println(map);// 打印HashMap集合
	}

	private static HashMap<Character, Integer> tongJi(String s) {
		HashMap<Character, Integer> map = new HashMap<>();// 新建一个HashMap集合
		for (int i = 0; i < s.length(); i++) {// 循环遍历取传入字符串的每一个字符
			char c = s.charAt(i);// 将取出的字符保存到字符变量中
			Integer count = map.get(c);// 定义集合中键对应的对象变量
			if (count == null) {// 判断对象变量是否为空
				map.put(c, 1);// 如果为空则将键对应的值设置为1
			} else {// 如果键对应的值不为空
				map.put(c, count + 1);// 将键对应的值加1
			}
		}
		return map;// 返回这个集合
	}
}
