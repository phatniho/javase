package day0704;

import java.util.Arrays;
import java.util.Random;

/*
 * 需求：冒泡排序
 */
public class Test1 {
	public static void main(String[] args) {
		// 获得一个随机乱序数组
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("------------------");

		sort(a);

		System.out.println("------------------");
		System.out.println(Arrays.toString(a));

	}

	private static int[] suiJi() {
		int n = 5 + new Random().nextInt(6);// 产生一个5+[0,6)范围的整数存到变量n
		int[] a = new int[n];// 新建int[] 数组a，长度n
		for (int i = 0; i < a.length; i++) {// 遍历数组
			a[i] = new Random().nextInt(100);// 填入100内的随机整数
		}
		return a;// 返回数组a
	}

	private static void sort(int[] a) {
		// 冒泡排序：内层循环的作用，把较小值向前交换，最小值最终被交换到i位置
		for (int i = 0; i < a.length; i++) {// 从头到尾遍历数组，外层循环
			boolean flag = false;// 定义结束标记
			for (int j = a.length - 1; j > i; j--) {// 从尾到头遍历数组，内层循环
				if (a[j] < a[j - 1]) {// 判断相邻两个元素大小
					int t = a[j];// 满足则进行交换
					a[j] = a[j - 1];
					a[j - 1] = t;
					flag = true;// 如果发生了交换，则将结束标记修改
				}
			}
			if (!flag) {// 判断是否发生交换
				break;// 如果没有发生交换，则说明排序完成，结束排序
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
