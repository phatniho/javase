package day0103;

/*
 *需求：获取两个基本浮点类型的最大值和最小值
 *分析：
 *通过基本类型对应的引用类型对象中的方法来获取该基本类型的最大值和最小值
 *将获取到的最大值和最小值保存到该基本类型变量中
 *使用输出打印语句将获取到的值打印到控制台上进行展示
 */
public class Test2 {
	public static void main(String[] args) {
		float a = Float.MIN_VALUE;// 使用MIN_VALUE方法获取该类型的最小值，并保存到该类型变量中
		float b = Float.MAX_VALUE;// 使用MAX_VALUE方法获取该类型的最大值，并保存到该类型变量中

		double c = Double.MIN_VALUE;
		double d = Double.MAX_VALUE;

		// 使用输出打印语句将结果打印到控制台上
		System.out.println("float类型的最小值=" + a);// 1.4E-45
		System.out.println("float类型的最大值=" + b);// 3.4028235E38

		System.out.println("double类型的最小值=" + c);// 4.9E-324
		System.out.println("double类型的最大值=" + d);// 1.7976931348623157E308
	}
}
