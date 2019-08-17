package day0407_圆;

/*
 * 需求：建立点对象和圆对象，求圆边距坐标原点的距离
 */
public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);// 建立坐标点对象
		Point p2 = new Point(8, 2);

		Circle c1 = new Circle(8, p1);// 输入半径和点对象，新建一个圆
		Circle c2 = new Circle(3, p2);

		double j1 = c1.juLi();// 对象调用求距离方法，返回距离结果

		System.out.println("圆c1边界到原点最短距离为：" + j1);// 输出打印结果
		System.out.println("圆c2边界到原点最短距离为：" + c2.juLi());// 直接打印方法计算结果
	}
}
