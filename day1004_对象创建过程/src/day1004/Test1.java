package day1004;

/*
 * �����
 * ���ɼ�-1.  ���ظ��࣬Ϊ���ྲ̬���������ڴ�
 * ���ɼ�-2.  �������࣬Ϊ���ྲ̬���������ڴ�
 * 3.  ִ�и��ྲ̬�����ĸ�ֵ���㣬�;�̬��ʼ����
 * 4.  ִ�����ྲ̬�����ĸ�ֵ���㣬�;�̬��ʼ����
 * �½�ʵ��
 * ���ɼ�-5.  �½�����ʵ����Ϊ�����ʵ�����������ڴ�
 * ���ɼ�-6.  �½�����ʵ����Ϊ�����ʵ�����������ڴ�
 * 7.  ִ�и����ʵ��������ֵ����
 * 8.  ִ�и���Ĺ��췽��
 * 9.  ִ�������ʵ��������ֵ����
 * 10. ִ������Ĺ��췽��
 */

//�������������������ļ���
public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("-----------");
		new B();
	}
}

class A {
	int v1 = 1;// 5 7
	static int v2 = 2;// 1 3
	static {
		System.out.println("A��̬��");// 2
	}

	A() {
		System.out.println("A����");// 8
	}
}

class B extends A {
	int v3 = 3;// 6 9
	static int v4 = 4;// 3 4
	static {
		System.out.println("B��̬��");// 4
	}

	B() {
		System.out.println("B����");// 10
	}
}