package day1501;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * 需求：输入指定文件夹，以栈的方式查找文件夹中所有图片文件
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入文件夹：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);// 根据输入的文件夹创建文件对象
		if (!dir.isDirectory()) {// 判断是否是有效文件夹
			System.out.println("请输入正确的文件夹");
			return;
		}
		List<File> list = f(dir);// 调用方法查找符合要求的文件，并返回到列表中
		for (File f : list) {// 遍历列表
			System.out.println(f.getAbsolutePath());// 打印文件路径
		}
	}

	private static List<File> f(File dir) {// 查找文件方法
		ArrayList<File> pic = new ArrayList<>();// 新建数组集合
		LinkedList<File> stack = new LinkedList<>();// 新建链表集合
		stack.push(dir);// 链表集合将文件夹压入栈中
		while (!stack.isEmpty()) {// 判断是否为空
			File f = stack.pop();// 不为空则将弹栈
			if (f.isFile()) {// 判断是否为文件
//				if (isPic(f)) {
				pic.add(f);// 增加到集合中
//				}
			} else {

				FileFilter filter = new FileFilter() {// 文件过滤器
					public boolean accept(File f) {// 重写方法
						if (f.isDirectory()) {// 判断是否为文件夹
							return true;// 接受文件夹
						}
						// 也接受图片文件
						String n = f.getName().toLowerCase();// 将名字改为小写
						// 判断是否为符合要求的文件格式
						return n.matches(".+\\.(jpg|png|gif|bmp)");
					}
				};
				File[] list = f.listFiles(filter);// 列表数组
				if (list == null) {// 判断是否为空
					continue;// 如果为空则进入下一轮循环
				}
				for (File f2 : list) {// 循环遍历
					stack.push(f2);// 将符合要求的文件压入链表中
				}
			}
		}
		return pic;// 返回数组
	}

	private static boolean isPic(File f) {// 判断是否为图片的方法
		String n = f.getName().toLowerCase();// 将名字改为小写
		// 判断是否为符合要求的文件格式
		return n.matches(".+\\.(jpg|png|gif|bmp)");
	}
}
