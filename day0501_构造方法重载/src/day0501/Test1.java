package day0501;

/*
 * ����ͨ��ѧ��������ѧ��������н���������ѯѧ����Ϣ
 * Student��
 * ��
 * 		id
 * 		name
 * 		gender
 * 		age
 * 		toString(){
 * 		}
 * ��
 */
public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();// �����ղζ�������ΪĬ��ֵ
		Student s2 = new Student(6, "����");// ����˫�ζ���δ���������ΪĬ��ֵ
		Student s3 = new Student(6, "����", "��");// ��������������δ���������ΪĬ��ֵ
		Student s4 = new Student(6, "����", "��", 23);// �������в�����������

		System.out.println(s1.toString());// ��ӡ��ʾѧ����Ϣ
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
}
