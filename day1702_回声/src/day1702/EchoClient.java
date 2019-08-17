package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		try {
			Socket s = new Socket("176.202.1.68", 8000);
			BufferedReader in = new BufferedReader(// ���ж�ȡ��
					new InputStreamReader(// ����ת����
							s.getInputStream(), // ��ȡ�׽���������
							"UTF-8"));// ָ������
			PrintWriter out = new PrintWriter(// ����д����
					new OutputStreamWriter(// ���ת����
							s.getOutputStream(), // ��ȡ�׽��������
							"UTF-8"));// ָ������
			while (true) {// ѭ��ִ��
				System.out.print("���룺");// ��ʾ��Ϣ
				String str = new Scanner(System.in).nextLine();// ��ȡ������ַ���
				out.println(str);// ���ַ�����������������
				out.flush();// ˢ�������������
				String echo = in.readLine();// ��ȡ�յ����ַ���
				System.out.println("������" + echo);// ��ӡ�ַ���������̨
				System.out.println("\n----------------");// �ָ���
			}
		} catch (Exception e) {
		}
	}
}
