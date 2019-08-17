package Test1_Circle;

/*
 * 需求：定义一个圆类，有两个属性：半径，圆心坐标点
 */
public class Circle {
	int r;// 定义半径变量
	Point p;// 定义圆心坐标点对象

	public Circle() {// 空参数构造函数：默认值设置
		set(0, p);// 调用设置方法，将半径和圆心设置为默认值
	}

	public Circle(int r, Point p) {// 双参数构造函数：传入指定值
		set(r, p);// 调用设置方法，将半径和圆心设置为传入的指定值
	}

	public void set(int r, Point p) {// set方法，传入半径值和圆心坐标点对象
		this.r = r;// 设置半径为传入半径
		this.p = p;// 设置圆心坐标点为传入坐标点
	}

	public double juLi() {// 计算距离的方法，调用方法计算出圆心坐标点到坐标远点的距离绝对值
		double d = Math.sqrt(p.x * p.x + p.y * p.y);// 计算出圆心到坐标原点的距离
		double s = Math.abs(d - r);// 求绝对值
		return s;// 返回计算结果
	}
}
