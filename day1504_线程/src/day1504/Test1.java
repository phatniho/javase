package day1504;

/*
 * 需求：多线程
 */
public class Test1 {
	public static void main(String[] args) {
		T1 t1 = new T1();// 新建线程对象1
		T1 t2 = new T1();// 新建线程对象2
		t1.start();// 线程1启动
		t2.start();// 线程2启动
		System.out.println("main");// 主线程打印信息
	}

	// 线程创建方式1：继承Thread类
	static class T1 extends Thread {// 内部类，方便参照上下文
		public void run() {// 重写此方法，开启多线程时会运行此方法中的代码
			String n = getName();// 获取线程名称
			for (int i = 1; i <= 10; i++) {// 循环遍历
				System.out.println(n + "--" + i);// 打印线程名称和循环次数
			}
		}
	}
}
