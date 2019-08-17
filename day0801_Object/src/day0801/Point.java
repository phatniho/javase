package day0801;

/*
 * Point��
 * equals������ǿ������ת��
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
		Point p = (Point) obj;// ǿ������ת��
		return (this.x == p.x && this.y == p.y);
	}

}
