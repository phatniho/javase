package day1504;

/*
 * ����ʹ�õ��̺߳Ͷ��̣߳��ֱ����1000�������ж��ٸ��������Ƚϵ��߳�����̵߳�Ч��
 */
public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		// 1000���ڣ��ж��ٸ�����
		System.out.println("\n���߳�---------");
		f1();// ���̷߳���
		System.out.println("\n���߳�---------");
		f2();// ���̷߳���
	}

	private static void f1() throws InterruptedException {
		long t = System.currentTimeMillis();// ��ȡϵͳʱ�����ֵ
		T1 t1 = new T1(0, 10000000);// �½��̶߳��󣬴���ָ��������������
		t1.start();// �����߳�1

		t1.join();// �߳�1����ִ�У� ������Ժ���ִ�������̡߳�main �߳���ͣ�ȴ�t1����
		int c = t1.count;// ������������߳�1��������
		t = System.currentTimeMillis() - t;// �����߳�����ʱ���
		System.out.println("ʱ�䣺" + t);// ��ӡʱ���
		System.out.println("������" + c);// ��ӡ������
	}

	private static void f2() throws InterruptedException {
		long t = System.currentTimeMillis();// ��ȡϵͳʱ�����ֵ
		int n = 5;// �����߳���������
		int m = 10000000 / n;// ����ÿ���߳���Ҫ����ķ�Χ
		T1[] a = new T1[n];// �½��̣߳�����ָ����������ָ���������߳�
		for (int i = 0; i < a.length; i++) {// ѭ����������
			a[i] = new T1(m * i, m * (i + 1));// ����ÿ���߳���Ҫ����ķ�Χ
			a[i].start();// ����ÿ���߳�
		}

		int sum = 0;// ������������̼߳������ĺ�
		for (T1 t1 : a) {// ѭ�����������̵߳ļ�����
			t1.join();// ��ǰ�߳�ִ����ϣ���ȡ����Ժ��ٻ�ȡ��һ���̵߳Ľ��
			sum += t1.count;// ͳ�Ƽ������ĺ�
		}
		t = System.currentTimeMillis() - t;// �����߳�����ʱ���
		System.out.println("ʱ�䣺" + t);// ��ӡʱ���
		System.out.println("������" + sum);// ��ӡ������
	}

	static class T1 extends Thread {// ���߳���
		int from;// ���忪ʼֵ
		int to;// �������ֵ
		int count;// ���������

		public T1(int from, int to) {// ���췽�����տ�ʼֵ�ͽ���ֵ������˷�Χ�ڵ���������
			if (from < 3) {// �жϷ�Χ��С��3������ֻ��2
				from = 3;// ����3Ϊ��ʼֵ
				count = 1;// ��������ʼ��Ϊ1
			}
			this.from = from;
			this.to = to;
		}

		public void run() {// �߳����з���
			for (int i = from; i < to; i++) {// ѭ������
				if (isPrime(i)) {// �ж��Ƿ�Ϊ����
					count++;// ��������������������
				}
			}
		}

		private boolean isPrime(int i) {// �ж��Ƿ�Ϊ����
			for (int j = 2; j <= Math.sqrt(i) + 1; j++) {// ѭ������
				if (i % j == 0) {// �ж��Ƿ�������
					return false;// �����������������
				}
			}
			return true;// �����������������������������
		}
	}
}
