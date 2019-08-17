package day16;

public class Consumer extends Thread {
	private Stack stack;

	public Consumer(Stack stack) {
		super();
		this.stack = stack;
	}

	public void run() {
		while (true) {
			synchronized (stack) {
				if (stack.isEmpty()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {
					}
				}
				char c = stack.pop();
				System.out.println("È¡³ö>>" + c);
				stack.notifyAll();
			}
		}
	}
}
