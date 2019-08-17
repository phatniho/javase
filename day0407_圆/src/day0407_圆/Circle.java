package day0407_圆;

/*
 * 需求：定义一个圆类，包涵两个属性：半径，圆心坐标点
 */
public class Circle {
	int r;// 定义半径
	Point o;// 定义圆心坐标点对象

	public Circle() {// 空参数构造函数
		this.r = 0;// 将半径设为默认值0
		this.o.set(0, 0);// 将圆心设为默认值（0，0）
	}

	public Circle(int r, Point o) {// 传入指定参数的构造函数
		this.r = r;// 将半径设置为指定值
		this.o = o;// 将圆心设置为指定坐标点对象
	}

	double juLi() {// 求圆到坐标原点的距离方法
		double s = Math.sqrt(this.o.x * this.o.x + this.o.y * this.o.y);// 求距离
		return Math.abs(s - this.r);// 返回结果的绝对值
	}
}
