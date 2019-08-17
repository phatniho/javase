package day07作业_冒泡排序;

/*
 * 需求：冒泡排序
 */
import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = add();// 通过方法新建数组

		System.out.println(Arrays.toString(a));// 打印排序前的数组
		System.out.println("-------");

		sort(a);// 调用排序方法

		System.out.println("-------");
		System.out.println(Arrays.toString(a));// 打印排序后的数组
	}

	private static void sort(int[] a) {// 排序方法
		for (int i = 0; i < a.length; i++) {// 外圈循环，从前到后
			boolean b = false;// 结束标记
			for (int j = a.length - 1; j > i; j--) {// 内圈循环，从后到前比较
				if (a[j] < a[j - 1]) {// 比较两个相邻的值
					int t = a[j];// 执行交换
					a[j] = a[j - 1];
					a[j - 1] = t;
					b = true;// 交换完成后修改结束标记
				}
			}
			if (!b) {// 如果本轮没有进行交换，则说明已排序完成，结束循环
				break;
			}
			System.out.println(Arrays.toString(a));// 打印排序过程
		}
	}

	private static int[] add() {
		int i = 5 + new Random().nextInt(5);
		int[] a = new int[i];
		for (int j = 0; j < a.length; j++) {
			a[j] = new Random().nextInt(100);
		}
		return a;
	}
}
