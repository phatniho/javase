package day0701;

/*
 * person��
 * ��Ա��
 * name,
 * gender,
 * age
 * toString()
 */
public class Person {
	String name;
	String gender;
	int age;

	public Person() {// �ղι��췽��
		this("����", "����", 16);// ����ȫ�ι��죬�趨Ĭ��ֵ
	}

	public Person(String name, String gender, int age) {// ȫ�ι��췽��
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {// ������ĳ�Ա����ת��Ϊ�ַ�������
		return "������" + name + "���Ա�" + gender + "�����䣺" + age;
	}
}
