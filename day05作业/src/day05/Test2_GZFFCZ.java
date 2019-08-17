package day05;

/*
 * 需求：定义学生类，定义不同参数的构造方法，进行构造方法重载
 */
public class Test2_GZFFCZ {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(7, "李四");
		Student s3 = new Student(8, "王五", "男");
		Student s4 = new Student(9, "赵六", "男", 24);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

		s1.set(10, "旺财", "男", 24);
		s2.set(13, "小强", "女", 21);
		s2.set(15, "小白", "男", 23);
		s2.set(16, "小黑", "女", 25);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
}
