package day1003;

public class Student {
	// ��Ա����һ�㶼��private����
	// ����ά���޸�
	// ��̬��ʼ����
	static {// ��̬�飬�౻����ʱִ��
		System.out.println("��̬�� - Student�౻����ʱִ��");
	}
	private int id;// ˽�г�Ա�������ⲿֻ��ͨ����������
	private String name;
	private String gender;
	private int age;

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

	public int getId() {// ����˽�г�Ա�����ķ���
		return id;
	}

	public void setId(int id) {// ����˽�г�Ա�����ķ���
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
	public String toString() {// ��д����
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
