package day0701;

/*
 * person类
 * 成员：
 * name,
 * gender,
 * age
 * toString()
 */
public class Person {
	String name;
	String gender;
	int age;

	public Person() {// 空参构造方法
		this("无名", "不明", 16);// 调用全参构造，设定默认值
	}

	public Person(String name, String gender, int age) {// 全参构造方法
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {// 将对象的成员变量转换为字符串方法
		return "姓名：" + name + "，性别：" + gender + "，年龄：" + age;
	}
}
