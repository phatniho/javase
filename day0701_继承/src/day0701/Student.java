package day0701;

/*
 * ѧ���࣬�̳�person��
 * ���г�Ա��
 * school
 */
public class Student extends Person {
	String school;// ���г�Ա����

	public Student() {// �ղι��췽��
		super();// Ĭ�ϵ��ø���ղι��췽������дҲ��ִ�У�������ڵ�һ��
	}

	public Student(String name, String gender, int age, String school) {// ȫ�ι��췽��
		super(name, gender, age);// ���ø���ȫ�ι��죬��ߴ��븴����
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
		this.school = school;// �������г�Ա������Ĭ��ֵ
	}

	public Student(String school) {// ���г�Ա�������췽��
		super();// ʵ����Ҳ��Ĭ�ϵ��ø���ղι��췽�����������г�Ա���г�ʼ��
		this.school = school;// ��ʼ�����г�Ա����
	}

	public String toString() {// ��д���෽������ߴ��븴���ԣ���д���Լ���Ҫ�����й���
		// super.toString()
		// һ���ڷ�����дʱ�����ø���ͬһ�������Ĵ���
//		return "������" + name + "���Ա�" + gender + "�����䣺" + age + "��ѧУ��" + school + "��";
		return super.toString() + "��ѧУ��" + school;// ���ø���ͬ���������������Լ���Ҫ�����в���
	}
}
