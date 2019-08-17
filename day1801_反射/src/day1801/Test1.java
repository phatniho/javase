package day1801;
/*
 * 需求：反射机制 （透视）
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		// A
		Class<A> c1 = A.class;// 加载方法区中的类对象

		// B
		// 向上转型，为防止输入不是有效类名，则要抛出异常
		Class<B> c2 = (Class<B>) Class.forName("day1801.B");

		// C
		C c = new C();
		// 可接收C以及C的所有子类，如果只想接收C，则强制转型
		Class<C> c3 = (Class<C>) c.getClass();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
