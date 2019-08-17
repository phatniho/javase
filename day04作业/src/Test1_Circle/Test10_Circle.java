package Test1_Circle;

/*
 * 需求：建立点对象和圆对象，求圆边距坐标原点的距离
 * 分析：
 * 圆具有两个属性：圆心和半径，需要先定义圆心对象
 * 圆心对象有两个属性，x坐标和y坐标。
 * 求距离的方法需要设置在圆类中，创建对象实例以后，通过实例来调用求距离方法
 * 当原点位置在圆内时，距离会出现负值，可以在方法中将结果取绝对值
 */
public class Test10_Circle {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);// 新建一个点的对象，用于第一个圆的圆心，直接传入值，
		Point p2 = new Point(8, 6);// 新建另一个点的对象，用于第二个圆的圆心，直接传入值

		Circle c1 = new Circle(8, p1);// 新建一个圆，传入半径值和点1作为圆心
		Circle c2 = new Circle(3, p2);// 新建另一个圆，传入半径值和点2作为圆心

		double s1 = c1.juLi();// 圆1调用求距离方法，将所求结果保存到变量中
		double s2 = c2.juLi();// 圆2调用求距离方法，将所求结果保存到另一个变量中

		System.out.println("圆1边距坐标原点的距离为：" + s1);// 输出打印结果
		System.out.println("圆2边距坐标原点的距离为：" + s2);// 输出打印结果
	}
}
