package day1504;

/*
 * 需求：第二种建立多线程的方式，实现Runnable接口
 * 创建接口对象，再将接口对象传入到线程类构造方法中创建新线程对象，再开启线程
 */
public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();// 新建线程接口对象
		Thread t1 = new Thread(r1);// 将线程接口对象传入线程对象
		Thread t2 = new Thread(r1);
		// 线程启动后，自动执行r1.run();
		t1.start();// 开启多线程
		t2.start();
		System.out.println("main");// 主线程打印信息
	}

	// 线程创建方式2：实现Runnable接口
	static class R1 implements Runnable {
		public void run() {// 重写此方法，多线程开启后会自动运行此方法中的代码
			// 获得正在执行的线程实例
			Thread t = Thread.currentThread();// 获取当前执行的线程

			// 获得线程名
			String n = t.getName();// 将当前正在执行的线程名转换为字符串

			// 循环打印
			for (int i = 1; i <= 10; i++) {// 循环遍历
				System.out.println(n + "--" + i);// 打印线程名和循环次数
			}
		}
	}
}
