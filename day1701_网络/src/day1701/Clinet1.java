package day1701;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * �����½��ͻ���
 */
public class Clinet1 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("176.202.1.68", 8000);// �½��ͻ����׽��֣�ָ��IP��ַ�Ͷ˿ں�
		InputStream in = s.getInputStream();// ��ȡ������
		OutputStream out = s.getOutputStream();// ��ȡ�����
		// �ͻ��ˣ�����"hello"
		// ���գ�"world"
		out.write("hello".getBytes());// �����ַ���
		out.flush();// ˢ�·���
		for (int i = 0; i < 5; i++) {// ѭ������
			char c = (char) in.read();// ���������ַ�
			System.out.print(c);// ��ӡ�ַ�
		}
		s.close();// �رտͻ�������
	}
}
