package day1801;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws Exception {
		A a = new A();
		Class<? extends A> c = a.getClass();// ������ָ����Ķ���
		Field f = c.getDeclaredField("a");// ���ָ�������ĳ�Ա����
		f.setAccessible(true);// ʹ˽�з�����������
		f.set(a, 6);// ����������ĳ�Ա������ֵ
		System.out.println(a.getA());// �����������ĳ�Ա����ֵ
		int i = (int) f.get(a);// ȡ����������ĳ�Ա����ֵ
		System.out.println(i);// ��ӡֵ

		Method geta = c.getMethod("getA");// ��ȡָ�����е�ָ������
		Method seta = c.getMethod("setA", int.class);// ��ȡָ�����е�ָ����������������

		int r = (int) geta.invoke(a);// ����ָ��������ȡָ����Ķ����Ա����ֵ
		System.out.println(r);// ��ӡֵ

		seta.invoke(a, 666);// ������÷���
		System.out.println(a.getA());// ������÷���
	}
}
