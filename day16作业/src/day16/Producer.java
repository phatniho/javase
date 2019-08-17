package day16;

import java.util.Random;

public class Producer extends Thread {
	private Stack stack;

	public Producer(Stack stack) {
		super();
		this.stack = stack;
	}

	public void run() {
		while (true) {
			char c = (char) ('a' + new Random().nextInt(26));
			synchronized (stack) {
				if (stack.isFull()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {
					}
				}
				stack.push(c);
				System.out.println("—π»Î<<" + c);
				stack.notifyAll();
			}
		}
	}
}
