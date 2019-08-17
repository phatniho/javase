package day1603;

import java.util.Random;

public class Producer extends Thread {
	private Stack stack;// 私有成员对象

	public Producer(Stack stack) {// 构造函数直接传入对象，保证使用同一个锁
		this.stack = stack;
	}

	public void run() {// 多线程方法
		while (true) {// 循环执行
			char c = (char) ('a' + new Random().nextInt(26));// 随机生成字符
			synchronized (stack) {// 同步执行，以指定对象加锁
				while (stack.isFull()) {// 判断数据是否放满，为防止其他程序意外唤醒，要循环判断
					try {
						stack.wait();// 如果数据放满了，则线程进入等待
					} catch (InterruptedException e) {// 异常捕捉，被打断抛出异常
					}
				}
				stack.push(c);// 放入数据
				System.out.println("压入<<" + c);// 提示信息
				stack.notifyAll();// 放入数据后，唤醒其他等待线程
			}
		}
	}
}
