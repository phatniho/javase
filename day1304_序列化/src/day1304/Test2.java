package day1304;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * ���󣺶������л������ļ��д洢�Ķ�����뵽�ڴ���
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(// �����л�������
				new FileInputStream("d:/abc/f3"));// ��ָ���ļ��еĶ�����뵽�ڴ���
		Student s = (Student) ois.readObject();// ǿ������ת��Ϊ������Ķ���
		System.out.println(s);// ��ӡ������Ϣ
		ois.close();// �ر���
	}
}
