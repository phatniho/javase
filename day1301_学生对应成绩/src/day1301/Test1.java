package day1301;

import java.util.HashMap;

/*
 * 需求：输入两个对象到HashMap集合中，判断对象是否一致，如果一致则覆盖对应的值
 */
public class Test1 {
	public static void main(String[] args) {
		HashMap<Student, Integer> hm = new HashMap<>();// 新建对象和分数对应的HashMap集合
		Student s1 = new Student(01, "张三", "男", 22);// 对象1
		Student s2 = new Student(01, "张三", "男", 22);// 对象2
		System.out.println(s1.hashCode());// 输出s1的哈希值
		System.out.println(s2.hashCode());// 输出s2的哈希值
		hm.put(s1, 98);// 将对象1和分数放入集合中
		hm.put(s2, 97);// 将对象2和分数放入集合中
		System.out.println(s1.equals(s2));// 比较s1和s2的值是否相同
		System.out.println(hm);// 打印集合
	}
}
