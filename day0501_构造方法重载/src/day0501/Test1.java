package day0501;

/*
 * 需求：通过学生类来对学生对象进行建立，并查询学生信息
 * Student类
 * ｛
 * 		id
 * 		name
 * 		gender
 * 		age
 * 		toString(){
 * 		}
 * ｝
 */
public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();// 建立空参对象，属性为默认值
		Student s2 = new Student(6, "张三");// 建立双参对象，未定义的属性为默认值
		Student s3 = new Student(6, "张三", "男");// 建立三参数对象，未定义的属性为默认值
		Student s4 = new Student(6, "张三", "男", 23);// 传入所有参数建立对象

		System.out.println(s1.toString());// 打印显示学生信息
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
}
