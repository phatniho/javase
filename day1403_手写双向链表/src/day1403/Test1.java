package day1403;

public class Test1 {
	public static void main(String[] args) {
		MyList list = new MyList();// �½��Լ�������
		list.add("aaa");// ���Ԫ��
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		System.out.println(list.size());// �������
		System.out.println(list.get(0));// ��ӡ��λ�õ�ֵ
		System.out.println(list.get(list.size() - 1));// ��ӡβλ�õ�ֵ
		System.out.println(list.get(3));// ��ӡָ��λ�õ�ֵ
		for (int i = 0; i < list.size(); i++) {// ѭ������
			System.out.println(list.get(i));// ��ӡÿ��Ԫ�ص�ֵ
		}
	}
}
