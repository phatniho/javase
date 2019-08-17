package day0502;

import java.util.Arrays;
import java.util.Random;

/*
 * 需求：生成一个随机数组，再获取最小值的角标
 */
public class Test2 {
	public static void main(String[] args) {
		// 调用suiJi()，产生一个乱序数组，存到变量a
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));

		// 把数组传递到f()方法求最小值的位置下标
		int min = f(a);// 求最小值方法，并返回到变量中
		System.out.println("最小值下标为：" + min);// 打印结果
	}

	private static int f(int[] a) {// 求最小值方法
		int m = 0;// 定义最小值默认角标变量
		for (int i = 1; i < a.length; i++) {// 循环遍历
			// m = a[i] < a[m] ? i : m;//三元运算符判断获取较小值角标
			if (a[i] < a[m]) {// 判断较小值角标
				m = i;// 将较小值角标保存到变量
			}
		}
		return m;// 返回最小值角标
	}

	private static int[] suiJi() {// 随机生成一个数组
		// 新建int[]数组，长度10
		// a[] = [0,0,0,0,0,0,0,0,0,0]
		// 遍历填入100内随机整数
		// a[] = [47,33,78,23,43,77,32,1,99,40]

		int[] a = new int[10];// 新建数组，并设定长度
		for (int i = 0; i < a.length; i++) {// 遍历数组
			a[i] = new Random().nextInt(100);// 随机将值存入到数组中
		}
		return a;// 返回数组
	}
}
