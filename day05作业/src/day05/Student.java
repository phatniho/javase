package day05;

/*
 * ѧ���࣬����4�����ԣ�ѧ��id������name���Ա�gender������age
 * ���岻ͬ�����Ĺ��췽��
 */
public class Student {
	int id;
	String name;
	String gender;
	int age;

	public Student() {// �ղ������췽��
	}

	public Student(int id, String name) {// ˫�������췽��
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String gender) {// ���������췽��
		this(id, name);// ����˫�ι��췽��
		this.gender = gender;
	}

	public Student(int id, String name, String gender, int age) {// �Ĳ������췽��
		this(id, name, gender);// �������ι��췽��
		this.age = age;
	}

	public void set(int id, String name, String gender, int age) {// �޸Ķ������Եķ���
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {// �����ӡѧ����Ϣ�ķ���
		return "ѧ�ţ�" + id + "��������" + name + "���Ա�" + gender + "�����䣺" + age;
	}

}
