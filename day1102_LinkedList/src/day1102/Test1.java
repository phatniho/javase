package day1102;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 需求：测试LinkedList双链路链表的效率
 * 特点：增删快，查询慢
 */
public class Test1 {
	public static void main(String[] args) {
		// add(),get(),remove(),size()
		// 添加1000万数据量
		// [{1},{1},{1},{1}...]
		long t = System.currentTimeMillis();// 获取系统时间保存到变量中
		LinkedList<Integer> list = new LinkedList();
		for (int i = 0; i < 100000; i++) {// 循环遍历增加元素
			list.add(Integer.valueOf(1));// 可简写为：list.add(1);//自动装箱
		}
		System.out.println(System.currentTimeMillis() - t);// 打印系统时间差
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		System.out.println(list.getFirst());// 获取第一个元素
		System.out.println(list.getLast());// 获取最后一个元素
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		System.out.println(list.get(list.size() / 2));// 获取链表中间的元素
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {// 循环遍历，效率低
			list.get(i);// 遍历获取元素
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		Iterator<Integer> it = list.iterator();// 使用迭代器进行查找，效率高
		while (it.hasNext()) {// 判断是否还有下一个
			it.next();// 取出下一个元素
		}
		System.out.println(System.currentTimeMillis() - t);
	}
}
