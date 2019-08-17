package day0502;

import java.util.Arrays;

/*
 * 需求：数组基本练习
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n----------------");
		f1();
		System.out.println("\n----------------");
		f2();
		System.out.println("\n----------------");
		f3();
	}

	private static void f1() {

		// 先新建[]String[],长度5
		// 再把数组地址保存到变量a
		// a = [ null , null , null , null , null ]
		// 在下标3位置放入"abc"

		String[] a = new String[5];// 新建指定长度类型的数组
		// Arrays.toString(a);把数组中的数据，连接成字符串
		System.out.println(Arrays.toString(a));// 遍历打印
		a[3] = "abc";// 将指定位置修改为特定值
		System.out.println(Arrays.toString(a));// 遍历打印
	}

	private static void f2() {
		int[] a = { 6, 2, 7, 3, 7, 3, 1, 5 };// 新建数组，直接填入所有元素
		System.out.println(Arrays.toString(a));// 数组遍历打印
		a = new int[] { 5, 6, 3, 7, 2, 8, 3, 8, 9 };// 将数组引用指向另一个数组
		System.out.println(Arrays.toString(a));// 数组遍历打印
	}

	private static void f3() {
		int[] a = new int[5];// 新建指定长度数组
		a[2] = 324;// 将指定位置修改为特定值
		System.out.println(a[2]);// 直接打印指定位置
		System.out.println(a[2] * 2);// 指定位置直接参与运算并打印
		a[2]++;// 指定位置进行自增运算
		System.out.println(a[2]);// 打印结果

//		交换2和3位置的值
		System.out.println(Arrays.toString(a));// 遍历打印数组
		int temp = a[2];// 交换位置
		a[2] = a[3];
		a[3] = temp;
		System.out.println(Arrays.toString(a));// 遍历打印数组
	}
}
