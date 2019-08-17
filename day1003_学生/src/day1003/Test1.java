package day1003;

/*
 * 需求：私有成员变量以及静态块
 */
public class Test1 {
	static {
		System.out.println("Test1 - 静态块");// 先执行
	}

	public static void main(String[] args) {
		System.out.println("main");// 后执行
		Student s = new Student();// 创建对象
		System.out.println(s.toString());
		s.setId(9527);// 调用方法设置私有成员变量
		s.setName("唐伯虎");
		s.setGender("男");
		s.setAge(19);
		System.out.println(s.getId());// 调用方法获取私有成员变量
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAge());
		System.out.println(s.toString());
	}
}
