package day1603;

public class Consumer extends Thread {
	private Stack stack;// ˽�г�Ա����

	public Consumer(Stack stack) {// ���췽��ֱ�Ӵ���һ�����󣬱�֤����ʹ��ͬһ����
		this.stack = stack;
	}

	public void run() {// ���̷߳���
		while (true) {// ѭ��ִ��
			synchronized (stack) {// ͬ������ָ���������
				// û�����ݣ��ȴ�
				while (stack.isEmpty()) {// �ж��Ƿ������ݣ�Ϊ��ֹ�����������⻽�ѣ�����ѭ���ж�
					try {
						stack.wait();// ���û�����ݣ��򲻶�ȡ�������̵߳ȴ�
					} catch (InterruptedException e) {// ������ʱ�׳��쳣��Ϣ
					}
				}
				char c = stack.pop();// ȡ������
				System.out.println("����>>" + c);// ��ʾ��Ϣ
				stack.notifyAll();// ȡ�����ݺ��������ȴ��е��߳�
			}
		}
	}
}
