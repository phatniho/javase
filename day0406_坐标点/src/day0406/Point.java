package day0406;

/*
 * 需求：Point类，坐标点的对象模板
 * 坐标点具有两个属性，x坐标和y坐标
 */
public class Point {
	int x;//定义x坐标变量
	int y;//定义y坐标变量

	public Point() {//空参数构造函数，创建对象时初始化对象的属性值
		super();
		this.x = 0;//初始化为0
		this.y = 0;//初始化为0
	}

	public Point(int x, int y) {//传入两个参数的构造函数，创建对象时直接按指定参数来创建
		super();
		this.x = x;//将对象的值设为传入的值
		this.y = y;
	}

	void set(int x, int y) {//修改对象参数的方法
		this.x = x;//将对象的值修改为传入的值
		this.y = y;
	}

	void get() {//打印值的方法
		// 把接收的参数x值，保存到“这个实例”的x
		// “这个实例”，“当前实例” - 正在调用的实例
		System.out.println("\n---------");//分割线
		System.out.println("x=" + this.x);//将对象的指定值打印出来
		System.out.println("y=" + this.y);
	}

}
