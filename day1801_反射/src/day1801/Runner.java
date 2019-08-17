package day1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 需求：运行器，根据配置文件来执行程序
 */
public class Runner {
	private static ArrayList<String> list = new ArrayList<>();// 定义集合，用来保存配置文件中的字符串

	static {
		try {
			BufferedReader in = new BufferedReader(// 字符流读取，按行读取
					new InputStreamReader(// 字符输入流转码
							new FileInputStream("d:/config.txt"), // 文件输入流，读取文件
							"GBK"));// 指定编码方式
			String line;// 定义变量保存一次读取的字符串
			while ((line = in.readLine()) != null) {// 判断是否读取完成
				line = line.replaceAll(" ", "");// 将行中的空格全部删除
				if (line.length() == 0) {// 判断是否为空行
					continue;// 空行则继续执行下一次循环
				}
				list.add(line);// 将读取到的字符串添加到集合中
			}
			in.close();// 关闭读取流
			System.out.println(list);// 打印集合
		} catch (Exception e) {
			throw new RuntimeException();// 抛出异常
		}
	}

	public static void launch() throws Exception {
		for (String s : list) {// 循环遍历集合
			String[] a = s.split(";");// 按指定字符切开字符串，获得类名和方法名的字符串，保存到数组
			Class<?> c = Class.forName(a[0]);// 数组0角标为类名，获取类名
			Object obj = c.newInstance();// 执行空参构造，创建对象
			Method m = c.getMethod(a[1]);// 数组1角标为方法名，获取方法
			m.invoke(obj);// 方法反射调用
		}
	}

	public static void main(String[] args) throws Exception {
		Runner.launch();// 执行运行器
	}
}
