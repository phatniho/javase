package day1304;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 需求：将对象序列化后，存到指定文件中
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		Student s = new Student(9527, "唐伯虎", "男", 19);// 新建对象
		ObjectOutputStream oos = new ObjectOutputStream(// 对象序列化，将对象序列化后输出存到指定文件
				new FileOutputStream("d:/abc/f3"));// 输出存到指定文件

		oos.writeObject(s);// 调用方法将对象写到文件中

		oos.close();// 关闭流
	}
}
