package day1005;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���󣺲���ArrayList����
 * <>���ͣ��Լ����д�ŵ��������ͽ�������
 * ���ͺͼ��Ϲ��ߣ���֧�ֻ�������
 * list = {
 * elementData=[null,null,null,null,null,null,null,null,null,null]
 * }
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// �����<>���String����ʡ��
		System.out.println(list);
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		list.add("jjj");
		list.add("kkk");
		list.add("lll");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.remove(5));
		System.out.println(list);
		System.out.println(list.remove("aaa"));
		System.out.println(list);
		System.out.println(list.remove("zzz"));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		for (String s : list) {// for-each�򻯸�ʽ
			System.out.print(s + ",");
		}
		System.out.println();
		// �����������������ϸ�ʽ
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			String s = it.next();
			System.out.print(s + ",");

		}
	}
}
