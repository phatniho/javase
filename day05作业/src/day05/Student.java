package day05;

/*
 * 学生类，包含4个属性：学号id，姓名name，性别gender，年龄age
 * 定义不同参数的构造方法
 */
public class Student {
	int id;
	String name;
	String gender;
	int age;

	public Student() {// 空参数构造方法
	}

	public Student(int id, String name) {// 双参数构造方法
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String gender) {// 三参数构造方法
		this(id, name);// 调用双参构造方法
		this.gender = gender;
	}

	public Student(int id, String name, String gender, int age) {// 四参数构造方法
		this(id, name, gender);// 调用三参构造方法
		this.age = age;
	}

	public void set(int id, String name, String gender, int age) {// 修改对象属性的方法
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {// 输出打印学生信息的方法
		return "学号：" + id + "，姓名：" + name + "，性别：" + gender + "，年龄：" + age;
	}

}
