package day0103;

/*
 * 需求：求四种基本整数类型的最大值和最小值
 * 分析：
 * 使用各基本类型对应的引用类型对象中的 MIN_VALUE 和 MAX_VALUE 方法来获取最大值和最小值
 * 并保存到对应基本类型变量中
 * 使用输出打印语句来将8个变量的值打印到控制台上
 */
public class Test1 {
	public static void main(String[] args) {
		byte a = Byte.MIN_VALUE;// 使用 MIN_VALUE 来获取该类型的最小值，并保存到该类型变量中
		byte b = Byte.MAX_VALUE;// 使用 MAX_VALUE 来获取该类型的最大值，并保存到该类型变量中

		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;

		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;

		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;

		// 将结果输出打印到控制台上
		System.out.println("byte类型的最小值=" + a);// -128
		System.out.println("byte类型的最大值=" + b);// 127

		System.out.println("short类型的最小值=" + c);// -32768
		System.out.println("short类型的最大值=" + d);// 32767

		System.out.println("int类型的最小值=" + e);// -2147483648
		System.out.println("int类型的最大值=" + f);// 2147483647

		System.out.println("long类型的最小值=" + g);// -9223372036854775808
		System.out.println("long类型的最大值=" + h);// 9223372036854775807
	}
}
