package day1005;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：测试ArrayList集合
 * <>泛型，对集合中存放的数据类型进行限制
 * 泛型和集合工具，不支持基本类型
 * list = {
 * elementData=[null,null,null,null,null,null,null,null,null,null]
 * }
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// 后面的<>里的String可以省略
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
		for (String s : list) {// for-each简化格式
			System.out.print(s + ",");
		}
		System.out.println();
		// 完整迭代器遍历集合格式
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			String s = it.next();
			System.out.print(s + ",");

		}
	}
}
