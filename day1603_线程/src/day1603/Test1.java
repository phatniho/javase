package day1603;

import java.util.Arrays;

/*
 * 线程同步：synchronized
 * 让多个线程共享访问数据时，步调一致的执行
 * 一个线程修改时，其他线程等待修改完成后才能执行
 * 一个线程访问时，其他线程等待访问结束后才能执行
 * 1.代码块加锁
 * synchronized(指定对象的锁){
 * 共享的数据访问代码
 * }
 */
public class Test1 {
	static char[] a = { '-', '-', '-', '-', '-' };// 静态数组
	static char c = '*';// 静态变量

	public static void main(String[] args) {
		Thread t1 = new Thread() {// 线程1
			public void run() {// 具体方法
				while (true) {// 无限循环
					synchronized (a) {
						for (int i = 0; i < a.length; i++) {// 遍历数组
							a[i] = c;// 修改数组内的元素
						}
					}
					c = (c == '*' ? '-' : '*');// 遍历完成后修改静态变量
				}
			}
		};
		Thread t2 = new Thread() {// 线程2
			public void run() {// 具体方法
				while (true) {// 无限循环
					synchronized (a) {
						System.out.println(Arrays.toString(a));// 打印数组
					}
				}
			}
		};
		t1.start();// 启动线程1
		t2.start();// 启动线程2
	}
}
