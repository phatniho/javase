package day1302;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;

//		path = "D:/Count.java";
//		path = "D:/资料";
		path = "F:/Count.java";

		File f = new File(path);// 封装路径
		System.out.println(f.getName());// 提取文件名
		System.out.println(f.getParent());// 提取文件父目录
		System.out.println(f.getAbsolutePath());// 提取文件完整路径
		System.out.println(f.length());// 提取文件字节量，文件夹无效
		System.out.println(f.isFile());// 判断是否是文件
		System.out.println(f.isDirectory());// 判断是否是文件夹

	}
}
