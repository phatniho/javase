package day1004;

/*
 * 类加载
 * 不可见-1.  加载父类，为父类静态变量分配内存
 * 不可见-2.  加载子类，为子类静态变量分配内存
 * 3.  执行父类静态变量的赋值运算，和静态初始化块
 * 4.  执行子类静态变量的赋值运算，和静态初始化块
 * 新建实例
 * 不可见-5.  新建父类实例，为父类的实例变量分配内存
 * 不可见-6.  新建子类实例，为子类的实例变量分配内存
 * 7.  执行父类的实例变量赋值运算
 * 8.  执行父类的构造方法
 * 9.  执行子类的实例变量赋值运算
 * 10. 执行子类的构造方法
 */

//公共类类名，必须是文件名
public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("-----------");
		new B();
	}
}

class A {
	int v1 = 1;// 5 7
	static int v2 = 2;// 1 3
	static {
		System.out.println("A静态块");// 2
	}

	A() {
		System.out.println("A构造");// 8
	}
}

class B extends A {
	int v3 = 3;// 6 9
	static int v4 = 4;// 3 4
	static {
		System.out.println("B静态块");// 4
	}

	B() {
		System.out.println("B构造");// 10
	}
}