package day1301;

import java.util.HashMap;

/*
 * ����������������HashMap�����У��ж϶����Ƿ�һ�£����һ���򸲸Ƕ�Ӧ��ֵ
 */
public class Test1 {
	public static void main(String[] args) {
		HashMap<Student, Integer> hm = new HashMap<>();// �½�����ͷ�����Ӧ��HashMap����
		Student s1 = new Student(01, "����", "��", 22);// ����1
		Student s2 = new Student(01, "����", "��", 22);// ����2
		System.out.println(s1.hashCode());// ���s1�Ĺ�ϣֵ
		System.out.println(s2.hashCode());// ���s2�Ĺ�ϣֵ
		hm.put(s1, 98);// ������1�ͷ������뼯����
		hm.put(s2, 97);// ������2�ͷ������뼯����
		System.out.println(s1.equals(s2));// �Ƚ�s1��s2��ֵ�Ƿ���ͬ
		System.out.println(hm);// ��ӡ����
	}
}
