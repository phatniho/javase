package day0903;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * 精确浮点数运算
 * BigDecimal
 * 常用方法：
 * add()加法
 * subtract()减法
 * multiply()乘法
 * divide()除法
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		System.out.println(a + b);// 正常计算会容易出现不精确
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		System.out.println("------------");
		BigDecimal a1 = BigDecimal.valueOf(a);// 精确计算，建立方式
		BigDecimal a2 = BigDecimal.valueOf(a);

		BigDecimal a3;
		a3 = a1.add(a2);// 加法
		System.out.println(a3.doubleValue());
		a3 = a1.subtract(a2);// 减法
		System.out.println(a3.doubleValue());
		a3 = a1.multiply(a2);// 乘法
		System.out.println(a3.doubleValue());
		a3 = a1.divide(a2, 50, BigDecimal.ROUND_HALF_UP);// 除法，取50位小数，四舍五入
		System.out.println(a3.doubleValue());// 取double值范围的结果
		System.out.println(a3.toString());// 打印全部50位小数结果
	}
}
