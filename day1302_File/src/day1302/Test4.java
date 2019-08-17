package day1302;

import java.io.File;
import java.util.Scanner;

/*
 * 需求：输入一个文件夹，计算这个文件夹的总大小
 * 分析：输入字符串
 * 建立文件对象，将输入的地址传入对象，判断是否为有效文件夹
 * 调用方法获得文件夹总大小
 * 打印返回值
 * 方法：
 * 获取文件夹下的所有文件名，保存到文件对象数组中
 * 判断该文件夹是否为空，如果为空则返回0
 * 定义变量保存文件夹大小
 * 循环遍历文件对象数组
 * 获取每个对象，判断是否为文件，如果是文件，则将大小属性加到变量中
 * 如果不是文件，则继续递归求文件夹内的文件大小
 * 返回最后结果
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入文件夹：");// 提示信息
		String s = new Scanner(System.in).nextLine();// 获取输入的地址字符串
		File dir = new File(s);// 将字符串转换为文件夹对象
		if (!dir.isDirectory()) {// 判断是否为有效文件夹
			System.out.println("请输入正确的文件夹");// 提示信息
			return;// 不是有效文件夹则直接返回，不继续执行
		}
		long size = dirLength(dir);// 定义变量保存大小计算方法传回的值
		System.out.println(size);// 打印文件大小
	}

	private static long dirLength(File dir) {// 文件大小计算方法
		File[] list = dir.listFiles();// 定义文件对象数组，获取传入的文件夹内所有的文件和文件夹对象
		if (list == null) {// 判断是否为空
			return 0;// 如果文件夹为空，则直接返回0
		}
		long sum = 0;// 定义变量保存文件大小统计
		for (File f : list) {// 循环遍历数组，简化版
			if (f.isFile()) {// 判断是否为文件
				sum += f.length();// 如果是文件则将大小加到统计变量中
			} else {
				sum += dirLength(f);// 如果不是文件则继续递归调用方法计算文件夹内的大小
			}
		}
//		for (int i = 0; i < list.length; i++) {// 循环遍历数组，完整版
//			File f = list[i];//新建文件对象，接收当前循环遍历到的文件对象数组角标对应的对象
//			if (f.isFile()) {//判断是否为文件
//				sum += f.length();//是文件则将大小加到统计变量中
//			} else {
//				sum += dirLength(f);//不是文件则继续递归调用方法计算文件夹内的大小
//			}
//		}
		return sum;// 返回大小统计
	}
}
