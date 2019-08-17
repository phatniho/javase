package day0901;

/*
 * 图形类
 * 一个类中如果有抽象方法，这个类必然是个抽象类
 */
public abstract class Shape {// 抽象类

	public abstract void draw();// 抽象方法

	public void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("该图形已被擦除（不是）");
		System.out.println("------------------------");
	}
}
