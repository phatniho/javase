package day1502;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/*
 * 需求：向集合中添加若干日期字符串，调用排序方法进行排序
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// 新建集合
		Collections.addAll(list, // 集合工具，添加元素到集合中
				"2019-4-22", "2019-4-2", "2019-4-21", //
				"2019-4-23", "2019-4-30", "2019-4-10", //
				"2019-4-1", "2019-4-12", "2019-4-11", //
				"2019-4-3", "2019-4-13", "2019-4-24");//
		System.out.println(list);// 打印集合
		Collections.sort(list);// 集合工具，排序
		System.out.println(list);// 打印集合

		// sort()方法，可以使用一个接口，接入一个比较器对象
		// sort(list,比较器)
		// sort()方法，排序运算过程中，对数据比大小时，调用比较器来比较

		Collections.sort(list, new Comparator<String>() {// 调用排序方法，按指定比较器排序
			// o1和o2比大小
			// o1大，返回正数，o1小，返回负数，相同返回0

			// 重写父类方法，异常管道不能比父类多
			public int compare(String o1, String o2) {// 比较器方法
				// 日期格式化类，可以将时间按指定格式转换为日期
				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
				try {// 异常捕捉
					Date a = f.parse(o1);// 新建日期对象，转换输入的第一个日期
					Date b = f.parse(o2);// 新建日期对象，转换输入的第二个日期
					return a.compareTo(b);// 比较两个日期
				} catch (Exception e) {// 异常处理
					throw new IllegalArgumentException(e);// 包装成能抛出的类型
				}
			}
		});// 集合工具，排序
		System.out.println(list);// 打印集合
	}
}
