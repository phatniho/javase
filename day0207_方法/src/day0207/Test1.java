package day0207;

/*
 * 需求：方法
 * 添加断点
 * f11启动调试
 * f6单步执行
 * f5进入方法
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println(1);
		f();
		System.out.println(2);
		f();
		System.out.println(3);
		f();
	}

	static void f() {
		System.out.println(4);
	}
}
