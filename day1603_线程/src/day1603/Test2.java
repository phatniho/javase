package day1603;

/*
 * 2.����ǰʵ��(this)����
 * synchronized void f(){
 * 
 * }
 * ʹ��ͬһ�����������÷��������Ա�֤ͬ�����̰߳�ȫ
 * 
 * 3.�෽������
 * static synchronized void f(){
 * 
 * }
 * ��̬���������෽������
 */
public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		R1 r2 = new R1();
		Thread t1 = new Thread(r1);
		t1.start();
		while (true) {
			int i = r2.get();// ��ͬ������ã�ͬ����Ч������ͬ
			if (i % 2 == 1) {
				System.out.println(i);
				System.exit(0);// �ر��������0Ϊ�Զ���������
				System.out.println(i);// ������ѹرգ�����ִ��
			}
		}
	}

	static class R1 implements Runnable {// ʵ�ֽӿ��������߳�
		static int i = 0;

		public static synchronized void add() {// ����
			i++;
			i++;
		}

		public static synchronized int get() {// ����
			return i;
		}

		public void run() {
			while (true) {
				add();
			}
		}
	}
}
