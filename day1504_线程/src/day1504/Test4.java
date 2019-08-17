package day1504;

/*
 * 需求：使用单线程和多线程，分别计算1000万以内有多少个质数，比较单线程与多线程的效率
 */
public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		// 1000万内，有多少个质数
		System.out.println("\n单线程---------");
		f1();// 单线程方法
		System.out.println("\n五线程---------");
		f2();// 多线程方法
	}

	private static void f1() throws InterruptedException {
		long t = System.currentTimeMillis();// 获取系统时间毫秒值
		T1 t1 = new T1(0, 10000000);// 新建线程对象，传入指定参数进行运算
		t1.start();// 开启线程1

		t1.join();// 线程1优先执行， 出结果以后再执行其他线程。main 线程暂停等待t1结束
		int c = t1.count;// 定义变量保存线程1的运算结果
		t = System.currentTimeMillis() - t;// 计算线程运行时间差
		System.out.println("时间：" + t);// 打印时间差
		System.out.println("数量：" + c);// 打印计算结果
	}

	private static void f2() throws InterruptedException {
		long t = System.currentTimeMillis();// 获取系统时间毫秒值
		int n = 5;// 定义线程数量变量
		int m = 10000000 / n;// 计算每个线程需要运算的范围
		T1[] a = new T1[n];// 新建线程，传入指定参数建立指定数量的线程
		for (int i = 0; i < a.length; i++) {// 循环遍历计算
			a[i] = new T1(m * i, m * (i + 1));// 定义每个线程需要计算的范围
			a[i].start();// 开启每个线程
		}

		int sum = 0;// 定义变量保存线程计算结果的和
		for (T1 t1 : a) {// 循环遍历所有线程的计算结果
			t1.join();// 当前线程执行完毕，获取结果以后再获取下一个线程的结果
			sum += t1.count;// 统计计算结果的和
		}
		t = System.currentTimeMillis() - t;// 计算线程运行时间差
		System.out.println("时间：" + t);// 打印时间差
		System.out.println("数量：" + sum);// 打印计算结果
	}

	static class T1 extends Thread {// 单线程类
		int from;// 定义开始值
		int to;// 定义结束值
		int count;// 定义计数器

		public T1(int from, int to) {// 构造方法接收开始值和结束值，计算此范围内的质数数量
			if (from < 3) {// 判断范围，小于3的质数只有2
				from = 3;// 定义3为开始值
				count = 1;// 计数器初始化为1
			}
			this.from = from;
			this.to = to;
		}

		public void run() {// 线程运行方法
			for (int i = from; i < to; i++) {// 循环遍历
				if (isPrime(i)) {// 判断是否为质数
					count++;// 如果是质数则计数器自增
				}
			}
		}

		private boolean isPrime(int i) {// 判断是否为质数
			for (int j = 2; j <= Math.sqrt(i) + 1; j++) {// 循环遍历
				if (i % j == 0) {// 判断是否能整除
					return false;// 如果能整除则不是质数
				}
			}
			return true;// 如果都不能整除则是质数，返回真
		}
	}
}
