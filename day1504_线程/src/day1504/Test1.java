package day1504;

/*
 * ���󣺶��߳�
 */
public class Test1 {
	public static void main(String[] args) {
		T1 t1 = new T1();// �½��̶߳���1
		T1 t2 = new T1();// �½��̶߳���2
		t1.start();// �߳�1����
		t2.start();// �߳�2����
		System.out.println("main");// ���̴߳�ӡ��Ϣ
	}

	// �̴߳�����ʽ1���̳�Thread��
	static class T1 extends Thread {// �ڲ��࣬�������������
		public void run() {// ��д�˷������������߳�ʱ�����д˷����еĴ���
			String n = getName();// ��ȡ�߳�����
			for (int i = 1; i <= 10; i++) {// ѭ������
				System.out.println(n + "--" + i);// ��ӡ�߳����ƺ�ѭ������
			}
		}
	}
}
