package day1701;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �����½���������
 */
public class Server1 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8000);// �½���������ָ���˿�
		System.out.println("����������8000�˿�������");
		// ��ͣ�ȴ��ͻ��˷�������
		System.out.println("�ȴ��ͻ�������");
		Socket s = ss.accept();// �������ȴ��ͻ�������
		System.out.println("�ͻ���������");
		// �Ӳ�ͷ���󣬻�ȡ�������������
		InputStream in = s.getInputStream();// ��ȡ������
		OutputStream out = s.getOutputStream();// ��ȡ�����
		// ͨ��Э�飺ͨ�����̣����ݸ�ʽ��
		// �������ˣ�����"hello"
		// ����"world"
		for (int i = 0; i < 5; i++) {// ѭ����ȡ���յ�������
			char c = (char) in.read();// �����ַ�
			System.out.print(c);// ��ӡ�ַ�
		}
		out.write("world".getBytes());// ���ַ������ظ��ͻ���
		out.flush();// ˢ���ڴ滺������
		s.close();// �Ͽ�����
		ss.close();// ֹͣ�����ͷŶ˿�
	}
}
