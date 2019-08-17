package day05;

import java.util.Arrays;
import java.util.Random;

/*
 * 需求：新建一个数组，按[1,2,3,4,5,6……]
 * 将数组顺序进行打乱
 * 	i循环遍历数组
 * 	随机定位一个j位置
 * 	i和j位置的值交换
 */

public class Test1_SZDL {
	public static void main(String[] args) {

		int[] a = addArr(10);// 调用方法新建数组，并保存到数组变量中

		System.out.println("打乱顺序前为：\n" + Arrays.toString(a));// 遍历数组

		daLuan(a);// 调用方法打乱数组

		System.out.println("打乱顺序后为：\n" + Arrays.toString(a));// 遍历数组
	}

	private static int[] addArr(int x) {// 新建数组方法
		int[] a = new int[x];// 新建数组并定义数组长度
		for (int i = 0; i < a.length; i++) {// 遍历数组
			a[i] = i + 1;// 为数组指定角标依次赋值
		}
		return a;// 返回数组
	}

	private static void daLuan(int[] a) {// 打乱数组元素顺序方法
		for (int i = 0; i < a.length; i++) {// 遍历数组
			int j = new Random().nextInt(a.length);// 定义随机位置
			int t = a[i];// 依次由每个位置与随机位置元素的值交换位置
			a[i] = a[j];
			a[j] = t;
		}
	}
}
