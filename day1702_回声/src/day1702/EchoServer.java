package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���󣺻������񣺿ͻ��˷��͵������������ݣ�ԭ�ⲻ���ķ��ؿͻ���
 */
public class EchoServer {
	public void launch() {
		new Thread() {// �����ڲ���
			public void run() {// ��д���������߳�ִ�����
				try {// �쳣��׽
					ServerSocket ss = new ServerSocket(8000);// �½���������ָ���˿�
					System.out.println("��������8000�˿�������");// ��ʾ��Ϣ
					while (true) {// ѭ��ִ��
						System.out.println("�ȴ���һ���ͻ�������");
						Socket s = ss.accept();// ѭ���ȴ�
						System.out.println("�ͻ���������");
						TongXinThread t = new TongXinThread(s);// ���յ�����ʱת����һ���̶߳���
						t.start();// ͨ���̶߳�����
					}
				} catch (Exception e) {// �쳣����
					System.out.println("�޷���8000�˿����������񣬻�����쳣ֹͣ");// ��ʾ��Ϣ
				}
			}
		}.start();// �����߳̿���
	}

	class TongXinThread extends Thread {
		Socket s;// �����յ����׽���������

		public TongXinThread(Socket s) {// ���ι��췽��������ָ���׽���
			this.s = s;
		}

		public void run() {// ͨ���߳�ִ�����
			// ͨ��Э�飺���̺͸�ʽ
			// UTF-8������ַ���
			// ÿ���ַ���ĩβ��ӻ���
			// BR-readLine()--ISR--����������
			// PW-println()--OSW--���������
			try {// �쳣��׽
				BufferedReader in = new BufferedReader(// ���ж�ȡ��
						new InputStreamReader(// ����ת����
								s.getInputStream(), // ��ȡ�׽���������
								"UTF-8"));// ָ������
				PrintWriter out = new PrintWriter(// ����д����
						new OutputStreamWriter(// ���ת����
								s.getOutputStream(), // ��ȡ�׽��������
								"UTF-8"));// ָ������
				String line;// �����ַ�������һ�ζ�ȡ������
				while ((line = in.readLine()) != null) {// ѭ����ȡ���ж��Ƿ��ȡ���
					out.println(line);// ���һ�ж�ȡ��������
					out.flush();// ˢ�����
				}
			} catch (Exception e) {// �쳣����
			}
			System.out.println("һ���ͻ����ѶϿ�");// ��ӡ��ʾ
		};
	}

	public static void main(String[] args) throws Exception {
		EchoServer s = new EchoServer();// �����������
		s.launch();// ������������
	}
}
