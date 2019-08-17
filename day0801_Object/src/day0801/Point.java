package day0801;

/*
 * Point类
 * equals方法：强制向下转型
 */
public class Point {
	int x;
	int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;// 强制向下转型
		return (this.x == p.x && this.y == p.y);
	}

}
