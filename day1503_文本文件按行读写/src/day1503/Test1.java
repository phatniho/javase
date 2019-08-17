package day1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*
 * 需求：批量读取文件中的数据，排序后再批量写到文件中
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		// 读取f8文件，所有日期字符串存入集合
		List<String> list = f1();

		// 对list中的日期字符串排序
		f2(list);

		// 保存到f9文件
		f3(list);

	}

	private static List<String> f1() throws Exception {
		BufferedReader in = new BufferedReader(// 按行读取
				new InputStreamReader(// 处理编码转换
						new FileInputStream("d:/abc/f8")// 读取文件
						, "GBK"));// 指定编码

		ArrayList<String> list = new ArrayList<>();// 定义集合

		String line = null;// 定义临时变量保存读取到的数据
		while ((line = in.readLine()) != null) {// 判断是否有读取到数据
			// trim，去除两端空白字符
			String s = line.trim();
			if (s.length() == 0) {// 判断是否为空串
				continue;// 如果是空串就继续读下一行
			}
			list.add(s);// 循环写入
		}
		in.close();// 关闭流
		System.out.println(list);// 打印集合
		return list;// 返回集合
	}

	private static void f2(List<String> list) {
		// 调用集合排序工具，传入列表集合以及匿名内部类比较器
		Collections.sort(list, new Comparator<String>() {

			// 重写比较器中的方法
			public int compare(String o1, String o2) {// 传入两个字符串进行比较
				// 转换日期格式
				SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd");
				try {// 异常捕捉处理
					Date a = f.parse(o1);// 第一个字符串转换为日期格式
					Date b = f.parse(o2);// 第二个字符串转换为日期格式
					return a.compareTo(b);// 两个日期格式进行比较
				} catch (ParseException e) {// 异常抛出
					throw new IllegalArgumentException(e);// 包装异常抛出
				}
			}
		});
	}

	private static void f3(List<String> list) throws Exception {
		PrintWriter out = new PrintWriter(// 按行写到文件中
				new OutputStreamWriter(// 处理编码转换
						new FileOutputStream("d:/abc/f9"), // 写出到文件中
						"GBK"));// 指定编码
		for (String s : list) {// 循环遍历
			out.println(s);// 按行写到文件
		}
		out.close();// 关闭流
	}
}
