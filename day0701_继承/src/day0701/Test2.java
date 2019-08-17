package day0701;

/*
 * 需求：继承练习
 */
public class Test2 {
	public static void main(String[] args) {
		Person p = new Person();// 新建空参父类对象
		Student s1 = new Student();// 新建空参子类对象
		Student s2 = new Student("郎中", "男", 14, "剑南春桥东学院");// 新建全参子类对象
		Employee e = new Employee();// 新建空参子类对象

		System.out.println(p);// 打印对象
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(e);
	}
}
