package day1802;

import java.lang.reflect.Method;

public class Runner {
	// ��ָ�������У��Զ������Զ�������@Testע��ķ���
	public static void launch(Class c) throws Exception {
		Object obj = c.newInstance();// �½�ָ����Ķ���
		Method[] a = c.getMethods();// ��ȡ�����������з���
		for (Method m : a) {// ѭ�������������з���
			if (m.isAnnotationPresent(Test.class)) {// �ж��ڷ����ϣ��Ƿ������Testע��
				Test t = m.getAnnotation(Test.class);// ��ȡTestע������
				System.out.println("id:" + t.id());
				System.out.println("title:" +
				// �ж�t.title()�Ƿ���ֵ
						(t.title().length() != 0 ? t.title() : t.value()));//

				m.invoke(obj);// �������������
				System.out.println("\n\n--------------------");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Runner.launch(A.class);// ָ�����������
	}
}
