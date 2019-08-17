package day1803;

import org.junit.Test;

/*
 * 需求：JUnit测试工具调用main方法进行测试
 */
public class Test1 {
	@Test
	public void a() {
		System.out.println("a");
	}

	public void b() {
		System.out.println("b");
	}

	@Test
	public void c() {
		System.out.println("c");
	}

	@Test
	public void d() {
		System.out.println("d");
	}
}
