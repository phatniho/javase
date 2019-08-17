package day0701;

/*
 * 需求：继承练习
 */
public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三", "公", 22);// 新建父类对象
		Student s = new Student();// 新建子类对象
		Employee e = new Employee();// 新建子类对象

		s.name = "李四";// 给子类对象成员变量赋值
		s.gender = "母";
		s.age = 20;
		s.school = "哈尔滨佛学院";

		e.name = "王五";
		e.gender = "公";
		e.age = 25;
		e.salary = 8888.88;

		// println()打印方法中，默认调用对象的toString()方法
		System.out.println(p.toString());// 打印对象成员字符串
		System.out.println(s.toString());
		System.out.println(e);// 默认调用toString()方法打印
	}
}
