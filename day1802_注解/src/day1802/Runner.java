package day1802;

import java.lang.reflect.Method;

public class Runner {
	// 在指定的类中，自动发现自动运行有@Test注解的方法
	public static void launch(Class c) throws Exception {
		Object obj = c.newInstance();// 新建指定类的对象
		Method[] a = c.getMethods();// 获取该类对象的所有方法
		for (Method m : a) {// 循环遍历该类所有方法
			if (m.isAnnotationPresent(Test.class)) {// 判断在方法上，是否出现了Test注解
				Test t = m.getAnnotation(Test.class);// 获取Test注解数据
				System.out.println("id:" + t.id());
				System.out.println("title:" +
				// 判断t.title()是否有值
						(t.title().length() != 0 ? t.title() : t.value()));//

				m.invoke(obj);// 方法自身反射调用
				System.out.println("\n\n--------------------");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Runner.launch(A.class);// 指定类的运行器
	}
}
