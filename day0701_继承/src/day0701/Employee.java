package day0701;

/*
 * Ա���࣬�̳�person��
 * ���г�Ա��
 * salary
 */
public class Employee extends Person {
	double salary;// ���г�Ա����

	public String toString() {// ��д���෽��
		return super.toString() + "�����ʣ�" + salary;// ���ø���ͬ����������߸����ԣ��������Լ���Ҫ�����в���
	}
}
