package week01_test;

public class Test01 {
	int i = 25;

	public static void main(String[] args) {
		Test01 obj = new Test01();
		{
			int i = 5;
		}
		{
			int i = 10;
		}
		{
			int i = 100;
			System.out.println(i);
			System.out.println(obj.i);
		}
	}

	public Test01() {
		int i = 1;
		System.out.println(i);
	}
}
