package day0407_圆;

/*
 * 需求：建立圆心坐标点类
 */
public class Point {
	int x;//定义x坐标变量
	int y;//定义y坐标变量

	public Point() {//空参数构造函数，将成员变量设置为默认值0
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {//传入指定参数的构造函数，将成员变量的值设为传入的值
		this.x = x;
		this.y = y;
	}

	void set(int x, int y) {//设置成员变量值的方法，将成员变量值修改为指定值
		this.x = x;
		this.y = y;
	}
}
