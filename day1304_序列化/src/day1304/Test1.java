package day1304;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * ���󣺽��������л��󣬴浽ָ���ļ���
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		Student s = new Student(9527, "�Ʋ���", "��", 19);// �½�����
		ObjectOutputStream oos = new ObjectOutputStream(// �������л������������л�������浽ָ���ļ�
				new FileOutputStream("d:/abc/f3"));// ����浽ָ���ļ�

		oos.writeObject(s);// ���÷���������д���ļ���

		oos.close();// �ر���
	}
}
