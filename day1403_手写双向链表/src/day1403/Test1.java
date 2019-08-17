package day1403;

public class Test1 {
	public static void main(String[] args) {
		MyList list = new MyList();// 新建自己的链表
		list.add("aaa");// 添加元素
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		System.out.println(list.size());// 输出容量
		System.out.println(list.get(0));// 打印首位置的值
		System.out.println(list.get(list.size() - 1));// 打印尾位置的值
		System.out.println(list.get(3));// 打印指定位置的值
		for (int i = 0; i < list.size(); i++) {// 循环遍历
			System.out.println(list.get(i));// 打印每个元素的值
		}
	}
}
