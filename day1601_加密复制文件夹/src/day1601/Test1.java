package day1601;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 需求：加密复制文件夹下的所有内容
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入原文件夹");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if (!from.isDirectory()) {// 判断文件夹是否有效
			System.out.println("请输入正确的文件夹");
			return;
		}
		System.out.println("目标文件夹");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if (to.exists()) {// 判断是否已经存在目标文件夹
			System.out.println("目标已经存在");
			return;
		}
		System.out.println("密码：");
		int key = new Scanner(System.in).nextInt();
		try {
			encryptCopyDir(from, to, key);// 复制文件夹方法
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void encryptCopyDir(File from, File to, int key) throws Exception {
		if (!to.mkdirs()) {// 判断是否能成功创建新文件夹
			throw new FileNotFoundException();// 不能找到有效位置异常
		}
		File[] list = from.listFiles();// 获取原文件夹列表
		if (list == null) {// 如果是空文件夹则直接返回
			return;
		}
		for (File f : list) {// 循环遍历
			File toFile = new File(to, f.getName());// 创建文件对象
			if (f.isFile()) {// 判断是否为文件
				encryptCopyFile(f, toFile, key);// 如果是文件则调用方法复制
			} else {// 如果不是文件
				encryptCopyDir(f, toFile, key);// 递归调用文件夹复制方法
			}
		}
	}

	private static void encryptCopyFile(File from, File to, int key) throws Exception {
		FileInputStream fis = new FileInputStream(from);// 文件输入流，读取数据
		FileOutputStream fos = new FileOutputStream(to);// 文件输出流，将数据写到目标文件
		byte[] b = new byte[8 * 1024];// 定义数组批量复制
		int n;// 定义变量统计每次复制的有效数据量
		while ((n = fis.read(b)) != -1) {// 判断是否复制完成
			for (int i = 0; i < n; i++) {// 循环遍历每次复制的数据量
				b[i] ^= key;// 对每个数据进行加密
			}
			fos.write(b, 0, n);// 将加密后的数据写到目标文件
		}
		fis.close();// 关闭输入流
		fos.close();// 关闭输出流
	}
}
