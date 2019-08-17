package day0702;

/*
 * 三维点
 * 继承二维点
 * 特有成员：
 * z，
 * 重写
 * toString()加入z进行运算
 * distance()加入z进行运算
 */
public class Point3D extends Point {
	int z;// 特有成员变量

	public Point3D(int x, int y, int z) {// 全参构造方法
		// 父类没有无参构造，必须手动调用有参构造
		super(x, y);// 调用父类全参构造方法
		this.z = z;// 加入特有成员变量
	}

	public String toString() {// 重写方法
		return "(" + x + "," + y + "," + z + ")";// 特有表达方式
	}

	public double distance() {// 重写方法
		return Math.sqrt(x * x + y * y + z * z);// 特有计算方式
	}
}
