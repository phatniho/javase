package day1203;

/*
 * 点对象
 */
public class Point {
	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		// 相同属性，产生相同的哈希值
		// 不同属性，要尽量产生分散的哈希值

		// 数学家发明了一种算法，是一种惯用的有效算法
		final int prime = 31;// 定义一个质数，一般是31
		int result = 1;// result起始值任意
		result = prime * result + x;// 执行运算
		result = prime * result + y;// 执行运算
		return result;// 返回结果
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {// 判断参数obj是Point类型
			Point p = (Point) obj;// 向下转型
			return x == p.x && y == p.y;// 比较值是否相等，相等返回true
		}
		return false;// 如果传入的对象不能向下转型为Point对象，返回false
	}

}
