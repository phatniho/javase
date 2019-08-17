package day1304;

import java.io.Serializable;

/*
 * 空接口：标识接口，用来标识Student类型实例，允许被序列化
 */
public class Student implements Serializable {
	// 默认版本号，如果要恢复成对象，必须版本一致
	private static final long serialVersionUID = 2019L;// 默认版本号
	private int id;
	private String name;
	private static String gender;// 静态成员变量，不被序列化
	private transient int age;// 临时变量，只在程序运行过程中存在，不被序列化

	public Student() {
		super();
	}

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
