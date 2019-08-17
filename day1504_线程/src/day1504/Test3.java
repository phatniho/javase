package day1504;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * ���������̡߳���̨�߳�
 * ���������û��ǰ̨�߳�ִ��ʱ����
 * ���������ʱ��ֱ�ӽ��������к�̨�߳�
 */
public class Test3 {
	public static void main(String[] args) {
		T1 t1 = new T1();// �½��߳�
		t1.start();// �����߳�
		Thread t2 = new Thread() {// �����ڲ���
			public void run() {// ��д����
				System.out.println("���س����t1�߳�");// ��ʾ��Ϣ
				new Scanner(System.in).nextLine();// ���س�����ִ��
				t1.interrupt();// ����߳�1
			}
		};
		t2.setDaemon(true);// ����Ϊ��̨�߳�
		t2.start();// �����߳̽����������ֱ���˳������Ⱥ�̨�߳̽���
	}

	static class T1 extends Thread {
		public void run() {
			// ָ��ʱ����ʾ��ʽ
			SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
			for (int i = 0; i < 10; i++) {// ��ѭ���������
				String s = f.format(new Date());// ���ڸ�ʽ��
				System.out.println(s);// ��ӡ����
				try {
					Thread.sleep(1000);// �ȴ�1��
				} catch (InterruptedException e) {// �쳣����
					System.out.println("˭TMͱ���ʣ�");// ��ʾ��Ϣ
					break;// ����ѭ��
				}
			}
		}
	}
}
