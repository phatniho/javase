package day0702;

/*
 * 需求：二维点和三维点
 * 三维点继承二维点
 */
public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);// 新建二维点
		Point p2 = new Point3D(9, 12, 20);// 新建三维点

		System.out.println(p1.toString());// 调用方法
		System.out.println(p1.distance());
		System.out.println("--------------");
		System.out.println(p2.toString());
		System.out.println(p2.distance());

		f(p1);
		f(p2);// 向上转型，转型成父类型
	}

	public static void f(Point p) {
		System.out.println("当做父类型Point");
		System.out.println(p.toString());//在实例中从子类到父类查找方法
	}
}
