package day1103;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 需求：输入一个数，求第这个数的丑数
 * 丑数定义：只能被2,3,5整除的数，最后结果必定为1
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入求第几个丑数：");
		int n = new Scanner(System.in).nextInt();// 获取输入的值
		long r = f(n);// 获取方法计算结果
		System.out.println(r);// 打印结果
	}

	private static long f(int n) {
		// 10 12 16
		// -------------------2
		// 9 12 15 18 24
		// -------------------3
		// 10 15 20 25 30
		// -------------------5
		//
		// r = 1 2 3 4 5 6 8
		//
		// 先创建3个集合
		// 初始放入2,3,5
		// 从头部移除最小值
		// 最小值分别乘2，3，5，放入三个集合
		if (n == 1) {// 判断是否需要求第一个
			return 1;// 如果是则直接返回1
		}
		// 新建3个集合
		LinkedList<Long> list2 = new LinkedList<>();
		LinkedList<Long> list3 = new LinkedList<>();
		LinkedList<Long> list5 = new LinkedList<>();
		// 初始放入2，3，5
		list2.add(2l);
		list3.add(3l);
		list5.add(5l);
		// 定义初始值
		long r = 0;
		for (int i = 2; i <= n; i++) {// 循环遍历
			long a = list2.getFirst();// 取出3个集合中的第一个数
			long b = list3.getFirst();
			long c = list5.getFirst();
			r = Math.min(a, Math.min(b, c));// 判断最小值
			if (r == a) {// 最小值则取出进行运算
				list2.removeFirst();// 取出最小值
			}
			if (r == b) {
				list3.removeFirst();
			}
			if (r == c) {
				list5.removeFirst();
			}
			list2.add(r * 2);// 分别乘以各集合的数
			list3.add(r * 3);
			list5.add(r * 5);
		}
		return r;// 返回结果
	}
}
