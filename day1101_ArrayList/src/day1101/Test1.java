package day1101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
 * 需求：插入随机整数，生成有序数字列表
 * 使用ArrayList代替数组
 * 特点：长度自动增长，按1.5倍
 * 增删慢，改查快。数据复制移位自动进行
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();// 新建集合
		System.out.println("回车执行,q退出");// 提示语句
		while (true) {// 循环执行
			String s = new Scanner(System.in).nextLine();// 获取输入的字符串
			if (s.equals("q")) {// 判断是否为结束语句
				System.out.println("程序结束！");// 结束提示
				break;// 结束循环
			}
			int a = new Random().nextInt(1000);// 生成随机数
			int index = Collections.binarySearch(al, a);// 集合的二分查找
			if (index < 0) {// 判断角标位置，如果为负则没有这个数
				index = -index - 1;// 将返回的角标值进行处理
			}
			al.add(index, a);// 将这个数插入集合中
			System.out.println(al);// 打印集合

		}
		// 迭代器遍历集合
		// Iterator - 迭代器
		Iterator<Integer> it = al.iterator();// 调用迭代器
		while (it.hasNext()) {// 判断是否有下一个元素
			Integer n = it.next();// 如果有则取出下一个元素保存
			System.out.println(n);// 打印取出的元素
		}
		System.out.println(al);// 打印集合
	}
}
