package ѧ����Ӧ�ɼ�;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Student, Integer> hm = new HashMap<Student, Integer>();
		Student s1 = new Student(1, "����", "��", 23);
		Student s2 = new Student(1, "����", "��", 23);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		hm.put(s1, 95);
		hm.put(s2, 98);
		System.out.println(s1.equals(s2));
		System.out.println(hm);
	}
}
