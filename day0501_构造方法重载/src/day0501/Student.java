package day0501;

/*
 * 学生类，包含4个属性：学号id，姓名name，性别gender，年龄age
 * 定义不同参数个数的构造方法
 * 定义一个普通方法，用于输出打印学生信息
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
		this(id, name);// 调用双参数构造方法
		this.gender = gender;
	}

	public Student(int id, String name, String gender, int age) {// 四参数构造方法
		this(id, name, gender);// 调用三参数构造方法
		this.age = age;
	}

	public String toString() {// 输出打印学生信息
		return id + "," + name + "," + gender + "," + age;
	}
}
