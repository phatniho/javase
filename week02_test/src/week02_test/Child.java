package week02_test;

class Base {
	void test() {
		System.out.println("Base.test()");
	}
}

public class Child extends Base {
	void test() {
		System.out.println("Child.test()");
	}

	static public void main(String[] args) {
		Child anObj = new Child();
		Base baseObj = (Base) anObj;
		baseObj.test();
		Thread d = new Thread();
//		d.sleep(1000);
//		d.wait();
	}
}
