package day1504;

/*
 * ���󣺵ڶ��ֽ������̵߳ķ�ʽ��ʵ��Runnable�ӿ�
 * �����ӿڶ����ٽ��ӿڶ����뵽�߳��๹�췽���д������̶߳����ٿ����߳�
 */
public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();// �½��߳̽ӿڶ���
		Thread t1 = new Thread(r1);// ���߳̽ӿڶ������̶߳���
		Thread t2 = new Thread(r1);
		// �߳��������Զ�ִ��r1.run();
		t1.start();// �������߳�
		t2.start();
		System.out.println("main");// ���̴߳�ӡ��Ϣ
	}

	// �̴߳�����ʽ2��ʵ��Runnable�ӿ�
	static class R1 implements Runnable {
		public void run() {// ��д�˷��������߳̿�������Զ����д˷����еĴ���
			// �������ִ�е��߳�ʵ��
			Thread t = Thread.currentThread();// ��ȡ��ǰִ�е��߳�

			// ����߳���
			String n = t.getName();// ����ǰ����ִ�е��߳���ת��Ϊ�ַ���

			// ѭ����ӡ
			for (int i = 1; i <= 10; i++) {// ѭ������
				System.out.println(n + "--" + i);// ��ӡ�߳�����ѭ������
			}
		}
	}
}
