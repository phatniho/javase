package day0701;

/*
 * ���󣺼̳���ϰ
 */
public class Test2 {
	public static void main(String[] args) {
		Person p = new Person();// �½��ղθ������
		Student s1 = new Student();// �½��ղ��������
		Student s2 = new Student("����", "��", 14, "���ϴ��Ŷ�ѧԺ");// �½�ȫ���������
		Employee e = new Employee();// �½��ղ��������

		System.out.println(p);// ��ӡ����
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(e);
	}
}
