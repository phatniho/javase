package day1603;

/*
 * 需求：生产者与消费者
 */
public class Test3 {
	public static void main(String[] args) {
		Stack stack = new Stack();// 新建数据容器
		Producer p = new Producer(stack);// 新建数据生产者
		Consumer c = new Consumer(stack);// 新建数据消费者
		p.start();// 启动生产者线程
		c.start();// 启动消费者线程

		// 模拟，有线程只唤醒，不操作数据
		while (true) {
			synchronized (stack) {// 等待，唤醒操作必须在synchronized内进行，必须加锁
				stack.notifyAll();// 唤醒其他等待中的程序，但不对数据进行任何操作
			}
		}
	}
}
