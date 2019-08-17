package day0702;

/*
 * 二维点：
 * 成员：
 * x，
 * y，
 * toString()
 * distance()
 */
public class Point {
	int x;// 成员变量
	int y;

	public Point(int x, int y) {// 全参构造方法
		this.x = x;// 按传入值来初始化对象属性
		this.y = y;
	}

	public String toString() {// 表现方式
		return "(" + x + "," + y + ")";// 表现方式
	}

	public double distance() {// 计算方式
		return Math.sqrt(x * x + y * y);// 计算方式
	}
}
