package day1304;

import java.io.Serializable;

/*
 * �սӿڣ���ʶ�ӿڣ�������ʶStudent����ʵ�����������л�
 */
public class Student implements Serializable {
	// Ĭ�ϰ汾�ţ����Ҫ�ָ��ɶ��󣬱���汾һ��
	private static final long serialVersionUID = 2019L;// Ĭ�ϰ汾��
	private int id;
	private String name;
	private static String gender;// ��̬��Ա�������������л�
	private transient int age;// ��ʱ������ֻ�ڳ������й����д��ڣ��������л�

	public Student() {
		super();
	}

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
