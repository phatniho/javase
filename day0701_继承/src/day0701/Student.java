package day0701;

/*
 * 学生类，继承person类
 * 特有成员：
 * school
 */
public class Student extends Person {
	String school;// 特有成员变量

	public Student() {// 空参构造方法
		super();// 默认调用父类空参构造方法，不写也会执行，必须放在第一行
	}

	public Student(String name, String gender, int age, String school) {// 全参构造方法
		super(name, gender, age);// 调用父类全参构造，提高代码复用性
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
		this.school = school;// 定义特有成员变量的默认值
	}

	public Student(String school) {// 特有成员变量构造方法
		super();// 实际上也会默认调用父类空参构造方法，将非特有成员进行初始化
		this.school = school;// 初始化特有成员变量
	}

	public String toString() {// 重写父类方法，提高代码复用性，并写入自己需要的特有功能
		// super.toString()
		// 一般在方法重写时，调用父类同一个方法的代码
//		return "姓名：" + name + "，性别：" + gender + "，年龄：" + age + "，学校：" + school + "。";
		return super.toString() + "，学校：" + school;// 调用父类同名方法，并进行自己需要的特有操作
	}
}
