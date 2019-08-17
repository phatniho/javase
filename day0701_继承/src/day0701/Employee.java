package day0701;

/*
 * 员工类，继承person类
 * 特有成员：
 * salary
 */
public class Employee extends Person {
	double salary;// 特有成员变量

	public String toString() {// 重写父类方法
		return super.toString() + "，工资：" + salary;// 调用父类同名方法，提高复用性，并进行自己需要的特有操作
	}
}
