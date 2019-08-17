package day0202;

/*
 * 需求：基本类型运算规则
 * 1.计算结果的数据类型，与运算项的最大类型一致
 * 2.byte，short，char三种比int小的整数，运算时，会自动转成int
 * 3.整数运算溢出
 * 		整数运算，可以理解为像时钟转圈，超出范围不出错，而是转到一个错误的结果
 * 		Integer.MAX_VALUE + 1 = Integer.MIN_VALUE
 * 4.浮点数运算不精确
 * 		IEEE-754规范（美国电子电气工程师协会）规定了计算机中浮点数的表示格式。
 * 		根据这个格式规则，在做某些浮点数运算时，就会产生不精确结果
 * 5.浮点数的特殊值  特殊结果，无法继续运算
 * 		Infinity 无穷大
 * 			3.14 / 0
 *		NaN      Not a Number
 * 			负数开方（虚数）Math.sqrt(-5)
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println(3 / 2);// 1
		System.out.println(3d / 2);// 1.5
		// \n 是换行符的转义符
		System.out.println("\n------------");

		char c1 = 'S';
		char c2 = 'B';
		System.out.println(c1 + c2);// int + int
		System.out.println("\n------------");

		System.out.println(Integer.MAX_VALUE + 1);// 整数运算溢出，超过范围则从最小值开始
		System.out.println(300000000 * 60 * 60 * 24 * 365);// 整数运算溢出
		System.out.println(300000000 * 60 * 60 * 24 * 365L);// 加后面也不行，前面已经溢出
		System.out.println(300000000L * 60 * 60 * 24 * 365);// 可以加第一个，先转型
		System.out.println(300000000 * 60L * 60 * 24 * 365);// 也可以加第二个
		System.out.println("\n------------");

		System.out.println(2 - 1.9);// 不精确
		System.out.println(2 - 1.8);// 不精确
		System.out.println(2 - 1.7);// 不精确
		System.out.println(2 - 1.6);// 不精确
		System.out.println(2 - 1.5);// 精确
		System.out.println(4.35 * 100);// 不精确
		System.out.println(4.36 * 100);// 不精确
		System.out.println(4.37 * 100);// 精确
		System.out.println(4.38 * 100);// 精确
		System.out.println(4.39 * 100);// 不精确
		System.out.println("\n------------");

		System.out.println(3.14 / 0);// Infinity
		System.out.println(Math.sqrt(-6));// NaN 使用数学工具开平方
	}
}
