package day1603;

import java.util.Arrays;

/*
 * �߳�ͬ����synchronized
 * �ö���̹߳����������ʱ������һ�µ�ִ��
 * һ���߳��޸�ʱ�������̵߳ȴ��޸���ɺ����ִ��
 * һ���̷߳���ʱ�������̵߳ȴ����ʽ��������ִ��
 * 1.��������
 * synchronized(ָ���������){
 * ��������ݷ��ʴ���
 * }
 */
public class Test1 {
	static char[] a = { '-', '-', '-', '-', '-' };// ��̬����
	static char c = '*';// ��̬����

	public static void main(String[] args) {
		Thread t1 = new Thread() {// �߳�1
			public void run() {// ���巽��
				while (true) {// ����ѭ��
					synchronized (a) {
						for (int i = 0; i < a.length; i++) {// ��������
							a[i] = c;// �޸������ڵ�Ԫ��
						}
					}
					c = (c == '*' ? '-' : '*');// ������ɺ��޸ľ�̬����
				}
			}
		};
		Thread t2 = new Thread() {// �߳�2
			public void run() {// ���巽��
				while (true) {// ����ѭ��
					synchronized (a) {
						System.out.println(Arrays.toString(a));// ��ӡ����
					}
				}
			}
		};
		t1.start();// �����߳�1
		t2.start();// �����߳�2
	}
}
