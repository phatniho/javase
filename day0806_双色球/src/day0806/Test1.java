package day0806;

import java.util.Arrays;
import java.util.Random;

/*
 * 需求：双色球生成，红球值6个，范围1-33不重复，篮球值一个，范围1-16
 */
public class Test1 {
	public static void main(String[] args) {
		int[] r = add(33);// 红球数组
		int[] b = add(16);// 篮球数组

		System.out.println(Arrays.toString(r));// 打印红球数组
		System.out.println(Arrays.toString(b));

		int[] red = getRed(r);// 取红球，存到一个数组里
		int blue = getBlue(b);// 取篮球
		System.out.println("红球：");
		System.out.println(Arrays.toString(red));// 打印取出的红球数组
		System.out.println("蓝球：");
		System.out.println(blue);// 打印取出的篮球
	}

	private static int[] getRed(int[] r) {// 取红球方法
		for (int i = 0; i < 6; i++) {// 定义长度，开始遍历
			int j = i + new Random().nextInt(33 - i);// 随机数
			int t = r[i];// 将遍历到的位置与随机位置交换
			r[i] = r[j];
			r[j] = t;
		}
		int[] a = Arrays.copyOf(r, 6);// 复制前6个值到新数组
		return a;// 返回新数组
	}

	private static int getBlue(int[] b) {
		return b[new Random().nextInt(16)];// 返回随机篮球数组中的一个值
	}

	private static int[] add(int i) {// 按输入的长度添加数组
		int[] a = new int[i];// 新建数组
		for (int j = 0; j < a.length; j++) {// 循环遍历
			a[j] = j + 1;// 填入每个值
		}
		return a;// 返回生成的数组
	}
}
