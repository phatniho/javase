package day05;

/*
 * ���󣺶���ѧ���࣬���岻ͬ�����Ĺ��췽�������й��췽������
 */
public class Test2_GZFFCZ {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(7, "����");
		Student s3 = new Student(8, "����", "��");
		Student s4 = new Student(9, "����", "��", 24);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

		s1.set(10, "����", "��", 24);
		s2.set(13, "Сǿ", "Ů", 21);
		s2.set(15, "С��", "��", 23);
		s2.set(16, "С��", "Ů", 25);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
}
