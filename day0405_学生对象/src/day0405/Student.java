package day0405;

/*
 * ���󣺽���һ��ѧ���࣬����ѧ�ţ��������Ա��������ԣ�������һ�������ӡ��Щ���Եķ���
 */
public class Student {
	int id;// �����������
	String name;
	String gender;
	int age;

	void show() {// �����ӡ����
		System.out.println("ѧ�ţ�" + this.id);
		System.out.println("������" + this.name);
		System.out.println("�Ա�" + this.gender);
		System.out.println("���䣺" + this.age);
	}
}
