package day1504;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 需求：幽灵线程、后台线程
 * 虚拟机会在没有前台线程执行时结束
 * 虚拟机结束时会直接结束掉所有后台线程
 */
public class Test3 {
	public static void main(String[] args) {
		T1 t1 = new T1();// 新建线程
		t1.start();// 开启线程
		Thread t2 = new Thread() {// 匿名内部类
			public void run() {// 重写方法
				System.out.println("按回车打断t1线程");// 提示信息
				new Scanner(System.in).nextLine();// 按回车继续执行
				t1.interrupt();// 打断线程1
			}
		};
		t2.setDaemon(true);// 设置为后台线程
		t2.start();// 其他线程结束，虚拟机直接退出，不等后台线程结束
	}

	static class T1 extends Thread {
		public void run() {
			// 指定时间显示格式
			SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
			for (int i = 0; i < 10; i++) {// 死循环无限输出
				String s = f.format(new Date());// 日期格式化
				System.out.println(s);// 打印日期
				try {
					Thread.sleep(1000);// 等待1秒
				} catch (InterruptedException e) {// 异常处理
					System.out.println("谁TM捅劳资？");// 提示信息
					break;// 结束循环
				}
			}
		}
	}
}
