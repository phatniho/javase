package day1603;

/*
 * ������������������
 */
public class Test3 {
	public static void main(String[] args) {
		Stack stack = new Stack();// �½���������
		Producer p = new Producer(stack);// �½�����������
		Consumer c = new Consumer(stack);// �½�����������
		p.start();// �����������߳�
		c.start();// �����������߳�

		// ģ�⣬���߳�ֻ���ѣ�����������
		while (true) {
			synchronized (stack) {// �ȴ������Ѳ���������synchronized�ڽ��У��������
				stack.notifyAll();// ���������ȴ��еĳ��򣬵��������ݽ����κβ���
			}
		}
	}
}
