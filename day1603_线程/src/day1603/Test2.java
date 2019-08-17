package day1603;

/*
 * 2.抢当前实例(this)的锁
 * synchronized void f(){
 * 
 * }
 * 使用同一个对象来调用方法，可以保证同步，线程安全
 * 
 * 3.类方法的锁
 * static synchronized void f(){
 * 
 * }
 * 静态方法，抢类方法的锁
 */
public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		R1 r2 = new R1();
		Thread t1 = new Thread(r1);
		t1.start();
		while (true) {
			int i = r2.get();// 不同对象调用，同步无效，锁不同
			if (i % 2 == 1) {
				System.out.println(i);
				System.exit(0);// 关闭虚拟机，0为自定义结束标记
				System.out.println(i);// 虚拟机已关闭，不会执行
			}
		}
	}

	static class R1 implements Runnable {// 实现接口来开启线程
		static int i = 0;

		public static synchronized void add() {// 加锁
			i++;
			i++;
		}

		public static synchronized int get() {// 加锁
			return i;
		}

		public void run() {
			while (true) {
				add();
			}
		}
	}
}
