package day1603;

import java.util.Random;

public class Producer extends Thread {
	private Stack stack;// ˽�г�Ա����

	public Producer(Stack stack) {// ���캯��ֱ�Ӵ�����󣬱�֤ʹ��ͬһ����
		this.stack = stack;
	}

	public void run() {// ���̷߳���
		while (true) {// ѭ��ִ��
			char c = (char) ('a' + new Random().nextInt(26));// ��������ַ�
			synchronized (stack) {// ͬ��ִ�У���ָ���������
				while (stack.isFull()) {// �ж������Ƿ������Ϊ��ֹ�����������⻽�ѣ�Ҫѭ���ж�
					try {
						stack.wait();// ������ݷ����ˣ����߳̽���ȴ�
					} catch (InterruptedException e) {// �쳣��׽��������׳��쳣
					}
				}
				stack.push(c);// ��������
				System.out.println("ѹ��<<" + c);// ��ʾ��Ϣ
				stack.notifyAll();// �������ݺ󣬻��������ȴ��߳�
			}
		}
	}
}
