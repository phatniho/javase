package Test1_Circle;

/*
 * 需求：定义一个坐标点类，有x坐标值和y坐标值两个属性
 */
public class Point {
	int x;// 定义变量x
	int y;// 定义变量y

	public void set(int x, int y) {// set方法，设置这个点的x坐标和y坐标
		this.x = x;// 将x坐标设置为传入的参数
		this.y = y;// 将y坐标设置为传入的参数
	}

	public Point() {// 空参数构造方法
		set(0, 0);// 调用set方法，将默认点的坐标设置为（0，0）
	}

	public Point(int x, int y) {// 双参数构造方法
		set(x, y);// 调用set方法，将坐标设置为指定参数值
	}
}
