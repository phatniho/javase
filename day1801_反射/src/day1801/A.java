package day1801;

public class A {
	private int a;

	public A() {
		super();
	}

	public A(int a) {
		super();
		this.a = a;
	}

	public void a() {
		System.out.println("aaaaaaa����Ӵ~");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override // ע��
	public String toString() {
		return "A [a=" + a + "]";
	}

}
