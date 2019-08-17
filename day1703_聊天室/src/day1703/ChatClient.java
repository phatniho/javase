package day1703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatClient {
	private Socket s;// �����׽��ֶ���
	private BufferedReader in;// ������
	private PrintWriter out;// �����
	private String name;// ��ȡ�ǳ�
	private LinkedList<String> list = new LinkedList<>();// ���������¼
	private boolean flag;// ����ģʽ����

	public void launch() {// �ͻ����߳�
		try {
			s = new Socket("176.202.1.68", 8000);// ����ָ�����������˿�
			// �����������ж�ȡ����������ת�룬��ȡ�׽��ֶ��������������ָ����������ת��
			in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
			// �����������������������ת�룬��ȡ�׽��ֶ�������������ָ����������ת��
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
			// �����ǳ�
			System.out.println("�������֣�");
			name = new Scanner(System.in).nextLine();// ��ȡ������ǳ�
			out.println(name);// ����ǳ�
			out.flush();// ˢ�������������

			// �����߳�
			new Thread() {// �����ڲ��࿪���߳�
				public void run() {// �߳�ִ�д���
					receive();// ִ�н�����Ϣ�߳�
				};
			}.start();// �����߳�
			// �����߳�
			Thread t1 = new Thread() {// �����̶߳���
				public void run() {
					input();// ִ��������Ϣ�߳�
				};
			};
			// ��ӡ�߳�
			Thread t2 = new Thread() {
				public void run() {
					print();// ִ�д�ӡ��Ϣ�߳�
				};
			};
			t1.setDaemon(true);// ��ָ���߳�����Ϊ��̨�߳�
			t2.setDaemon(true);
			t1.start();// �����߳�
			t2.start();

			System.out.println("�����������ݣ�");// ��ӡ��ʾ
		} catch (Exception e) {
			System.out.println("404 NOT FOUND");// �Ͽ�������ʾ
			e.printStackTrace();// �Ͽ����Ӻ��ӡ�쳣����
		}
	}

	protected void print() {// ��ӡ�߳�
		while (true) {// ѭ��ִ��
			synchronized (list) {// ��ͬ������ȷ����Ϣ��¼��������Ϣ���ʰ�ȫ
				while (list.isEmpty() || flag) {// �ж���Ϣ�������Ƿ�����Ϣ���Ƿ������ӡ�������
					try {// �쳣��׽
						list.wait();// �߳̽���ȴ���
					} catch (Exception e) {
					}
				}
				String msg = list.removeFirst();// ��ȡ�����д洢����Ϣ�ַ���
				System.out.println(msg);// ��ӡ��Ϣ�ַ���������̨
			}
		}
	}

	protected void input() {// �����߳�
		System.out.println("���س�������������");
		while (true) {
			new Scanner(System.in).nextLine();
			flag = true;// ��������Ϣ���ƿ���

			System.out.println("�����������ݣ�");
			String s = new Scanner(System.in).nextLine();// ��ȡ�������Ϣ����
			out.println(s);// �����Ϣ����
			out.flush();// ˢ�·��͵�������

			flag = false;// �ر�������Ϣ���ؿ���
			synchronized (list) {// ͬ��������ȷ��������Ϣ��¼���ϰ�ȫ
				list.notifyAll();// ���������ȴ��е��߳�
			}
		}
	}

	protected void receive() {// ������Ϣ�߳�
		try {
			String line;// �����ַ�������������յ�����Ϣ
			while ((line = in.readLine()) != null) {// ���ж�ȡ�յ�����Ϣ
				synchronized (list) {// ͬ����������֤������Ϣ��¼���ϰ�ȫ
					list.add(line);// ���յ�����Ϣ�ַ�����ӵ���Ϣ��¼������
					list.notifyAll();// ֪ͨ��ӡ�߳��Ѿ������ݿ��Դ�ӡ��
				}
			}
		} catch (Exception e) {
		}
		System.out.println("�Ѿ���������Ͽ�����");// �Ͽ�������ʾ
	}

	public static void main(String[] args) {
		ChatClient c = new ChatClient();// �½��ͻ��˶���
		c.launch();// ���пͻ������߳�
	}
}
