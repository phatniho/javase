package day0701;

/*
 * ���󣺼̳���ϰ
 */
public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����", "��", 22);// �½��������
		Student s = new Student();// �½��������
		Employee e = new Employee();// �½��������

		s.name = "����";// ����������Ա������ֵ
		s.gender = "ĸ";
		s.age = 20;
		s.school = "��������ѧԺ";

		e.name = "����";
		e.gender = "��";
		e.age = 25;
		e.salary = 8888.88;

		// println()��ӡ�����У�Ĭ�ϵ��ö����toString()����
		System.out.println(p.toString());// ��ӡ�����Ա�ַ���
		System.out.println(s.toString());
		System.out.println(e);// Ĭ�ϵ���toString()������ӡ
	}
}
