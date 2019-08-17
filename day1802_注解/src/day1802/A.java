package day1802;

public class A {
	@Test(id = 1, title = "测试a") // 注解信息
	public void a() {
		System.out.println("A.a");
	}

	public void b() {
		System.out.println("A.b");
	}

	@Test("测试c") // 保存到value
	public void c() {
		System.out.println("A.c");
	}

	@Test(id = 3)
	public void d() {
		System.out.println("A.d");
	}

}
