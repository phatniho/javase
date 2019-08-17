package day1603;

public class Consumer extends Thread {
	private Stack stack;// 私有成员对象

	public Consumer(Stack stack) {// 构造方法直接传入一个对象，保证可以使用同一把锁
		this.stack = stack;
	}

	public void run() {// 多线程方法
		while (true) {// 循环执行
			synchronized (stack) {// 同步，以指定对象加锁
				// 没有数据，等待
				while (stack.isEmpty()) {// 判断是否有数据，为防止其他程序意外唤醒，进行循环判断
					try {
						stack.wait();// 如果没有数据，则不读取，进入线程等待
					} catch (InterruptedException e) {// 被唤醒时抛出异常信息
					}
				}
				char c = stack.pop();// 取出数据
				System.out.println("弹出>>" + c);// 提示信息
				stack.notifyAll();// 取出数据后唤醒其他等待中的线程
			}
		}
	}
}
