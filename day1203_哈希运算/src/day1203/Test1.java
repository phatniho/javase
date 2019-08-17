package day1203;

import java.util.HashMap;

/*
 * 需求：两个新建的对象，保存到HashMap集合中，键相等，进行覆盖
 * 哈希运算过程：
 * 1.HashMap内部，使用 Entry[] 数组存放数据
 * 2.数组默认初始容量 16
 * 3.放满后容量翻倍+2
 * 
 * 1.key.hashCode() 获得键的哈希值
 * 2.用哈希值和数组长度，运算产生一个下标值 i
 * 3.新建Entry 对象来封装键值对数据
 * 4.Entry对象，放在 i 位置
 * --如果是空位置，直接放入
 * --有数据，依次equals()比较是否相等
 * ----找到相等的，覆盖旧值
 * ----没有相等的，链表连接在一起
 * --负载率、加载因子 0.75
 * ----新建翻倍容量的新数组
 * ----所有数据，重新执行哈希运算，放入新数组
 * --jdk1.8
 * ----链表长度到8，转成红黑树
 * ----树上的数据减少到6，转回成链表
 */
public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);// --2.9亿
		Point b = new Point(1, 3);// --3.1亿

		// 有相同的哈希值，才能保证计算出相同下标位置
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		// 即使计算出相同位置，equals()也要相等，才能覆盖，否则链表连接在一起
		System.out.println(a.equals(b));

		HashMap<Point, String> hm = new HashMap<>();// 新建集合保存键值对
		hm.put(a, "2.9亿");// 放入第一个键值对
		hm.put(b, "3.1亿");// 放入第二个键值对
		System.out.println(hm);// 打印集合，默认调用toString()方法
	}
}
