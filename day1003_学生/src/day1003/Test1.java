package day1003;

/*
 * ����˽�г�Ա�����Լ���̬��
 */
public class Test1 {
	static {
		System.out.println("Test1 - ��̬��");// ��ִ��
	}

	public static void main(String[] args) {
		System.out.println("main");// ��ִ��
		Student s = new Student();// ��������
		System.out.println(s.toString());
		s.setId(9527);// ���÷�������˽�г�Ա����
		s.setName("�Ʋ���");
		s.setGender("��");
		s.setAge(19);
		System.out.println(s.getId());// ���÷�����ȡ˽�г�Ա����
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAge());
		System.out.println(s.toString());
	}
}
