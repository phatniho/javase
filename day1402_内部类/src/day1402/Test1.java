package day1402;

import day1402.A.*;

/*
 * �����ڲ���
 * �Ǿ�̬�ڲ��ࣺ��Ҫ�ⲿ�������ô���
 * ��̬�ڲ��ࣺ����ֱ�Ӵ��������ⲿ��û�����𣬿�ѡ��Ʒ���
 */
public class Test1 {
	public static void main(String[] args) {
		Inner1 i1 = new Inner1();// ��̬�ڲ������ֱ�Ӵ�������
		System.out.println(i1);
		A a = new A();// �ⲿ�����
		System.out.println(a);
		Inner2 i2 = a.new Inner2();// �Ǿ�̬�ڲ�����Ҫ���ⲿ���������������
		System.out.println(i2);
	}
}

class A {// �ⲿ�࣬Ҳ�ж�����
	static class Inner1 {// �ڲ��࣬Ҳ�еײ��࣬��̬�ڲ����ͬ���ⲿ�࣬����ֱ�Ӵ�������

	}

	class Inner2 {// �ڲ��࣬�Ǿ�̬���ڲ������Ҫ���ⲿ��Ķ����������½�

	}
}