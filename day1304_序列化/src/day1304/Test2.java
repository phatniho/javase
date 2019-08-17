package day1304;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 需求：对象反序列化，将文件中存储的对象读入到内存中
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(// 反序列化输入流
				new FileInputStream("d:/abc/f3"));// 将指定文件中的对象读入到内存中
		Student s = (Student) ois.readObject();// 强制向下转型为具体类的对象
		System.out.println(s);// 打印对象信息
		ois.close();// 关闭流
	}
}
