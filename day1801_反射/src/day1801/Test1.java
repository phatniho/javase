package day1801;
/*
 * ���󣺷������ ��͸�ӣ�
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		// A
		Class<A> c1 = A.class;// ���ط������е������

		// B
		// ����ת�ͣ�Ϊ��ֹ���벻����Ч��������Ҫ�׳��쳣
		Class<B> c2 = (Class<B>) Class.forName("day1801.B");

		// C
		C c = new C();
		// �ɽ���C�Լ�C���������࣬���ֻ�����C����ǿ��ת��
		Class<C> c3 = (Class<C>) c.getClass();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
