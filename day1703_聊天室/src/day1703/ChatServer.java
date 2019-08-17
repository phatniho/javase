package day1703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ChatServer {
	private ArrayList<TongXinThread> list = new ArrayList<>();// �����ҳ�Ա�б���

	public void launch() {
		new Thread() {// �����ڲ���
			public void run() {// ���߳�ִ�д���
				try {// �쳣��׽
					ServerSocket ss = new ServerSocket(8000);// �½�����������
					System.out.println("�����ҷ�����������");
					while (true) {// ѭ��ִ��
						Socket s = ss.accept();// ѭ�����տͻ��˷���������
						TongXinThread t = new TongXinThread(s);// �½��ͻ���ͨ���߳�
						t.start();// ͨ���߳�����
					}
				} catch (Exception e) {
					System.out.println("404 NOT FOUND");// �Ͽ�������ʾ
				}
			}
		}.start();
	}

	class TongXinThread extends Thread {
		Socket s;// �׽��ֶ���
		BufferedReader in;// ���ж�ȡ������
		PrintWriter out;// ����д��������
		private String name;// �ǳ��ַ���

		public TongXinThread(Socket s) {// ���ι��췽��������ָ���׽��ֶ���
			this.s = s;
		}

		public void send(String msg) {// ������Ϣ�����������ַ�����Ϣ
			out.println(msg);// �����յ����ַ�����Ϣ���ͳ�ȥ
			out.flush();// ˢ�·��ͳ�ȥ
		}

		public void sendAll(String msg) {// ȫ�巢����Ϣ
			synchronized (list) {// ��ͬ��������֤��Ϣ��ȫ
				for (TongXinThread t : list) {// ѭ������
					t.send(msg);// ÿ��ͨ���̵߳��÷��ͷ���
				}
			}
		}

		public void run() {
			try {
				int i = 5000;// ���ñ���
				s.setSoTimeout(i);// ���ó�ʱ

				// ǰ�治�������ͣ��Ǹ���Ա������ֵ����������˾��Ǿֲ�����
				// ������ ���ж�ȡ ��ָ������ת�� ��ȡ�׽����е������� ָ������
				in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
				// ����� ������� ��ָ������ת�� ��ȡ�׽����е������ ָ�����
				out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
				// ��ÿͻ��˵��ǳ�
				this.name = in.readLine();
				// �ѵ�ǰͨ���̼߳��뼯��
				synchronized (list) {
					list.add(this);// ����ǰ�������������
				}
				// ���ͻ�ӭ��Ϣ
				send("��ӭ������������ң�");
				// Ⱥ��������Ϣ
				sendAll(name + "�����������ң����Կ�ʼ����ˣ���ǰ���������" + list.size());

				String line;// ������������յ�����Ϣ�ַ���
				int count = 0;// ���������������ͳ�ƾ������
				while (true) {// ѭ��ִ��
					try {
						line = in.readLine();// ��ȡ�յ�����Ϣ�ַ���
						if (line == null) {// ����ַ���Ϊ�������ѭ��
							break;
						}
						count = 0;
					} catch (SocketTimeoutException e) {// ��ʱ�쳣����
						if (count == 3) {// �жϾ������
							send("���˾ٱ���һ������ѱ��߳����������ң�");// ������ʾ��Ϣ
							s.close();// �رյ�ǰ���������
							break;
						}
						count++;// �����������󣬷�����ʾ��Ϣ
						send("���Ѿ�" + i / 1000 + "��û�������ˣ��ٲ��Ļᱻ�߳������ң���" + count + "/3��");
						continue;// ������һ��ѭ���ж�
					}
					sendAll(name + ":" + line);// ����������Ϣ�ַ���
				}

			} catch (Exception e) {
			}
			// ɾ����ǰͨ���߳�ʵ��
			synchronized (list) {
				list.remove(this);// ɾ����ǰ����
			}
			sendAll(name + "�뿪�������ң���ǰ���������" + list.size());// Ⱥ��������Ϣ
		}
	}

	public static void main(String[] args) {
		ChatServer s = new ChatServer();// �½�����������
		s.launch();// ������÷�������������
	}
}
