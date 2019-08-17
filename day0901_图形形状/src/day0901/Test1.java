package day0901;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：循环随机生成各种图形
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("按回车执行");
		Shape s = null;

		while (true) {
			new Scanner(System.in).nextLine();
			int l = new Random().nextInt(4);
			switch (l) {
			case 0:
				// 抽象类不能创建对象实例
				System.out.println("Shape抽象类，不能创建实例");
				continue;
			case 1:
				s = new Line();
				break;
			case 2:
				s = new Square();
				break;
			case 3:
				s = new Circle();
				break;
			}
			f(s);
		}
	}

	public static void f(Shape s) {
		System.out.println("---当做父类型处理");
		String n = s.getClass().getName();// 获取类名和方法名
		System.out.println("真实类型：" + n);
		s.draw();// 调取通用方法

		if (s instanceof Line) {// 运行期类型识别
			System.out.println("向下转型成Line类型，再调用长度方法");
			Line l = (Line) s;// 向下转型
			l.length();// 调用子类特有方法
		}

		new Scanner(System.in).nextLine();
		s.clear();// 通用方法
	}
}
