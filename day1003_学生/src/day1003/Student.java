package day1003;

public class Student {
	// 成员变量一般都用private隐藏
	// 便于维护修改
	// 静态初始化块
	static {// 静态块，类被加载时执行
		System.out.println("静态块 - Student类被加载时执行");
	}
	private int id;// 私有成员变量，外部只能通过方法调用
	private String name;
	private String gender;
	private int age;

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

	public int getId() {// 调用私有成员变量的方法
		return id;
	}

	public void setId(int id) {// 设置私有成员变量的方法
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
	public String toString() {// 重写方法
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
