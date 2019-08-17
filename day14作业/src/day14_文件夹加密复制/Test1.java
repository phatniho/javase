package day14_文件夹加密复制;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * 需求：将一个文件夹加密复制到另一个文件夹中
 * 分析：
 * 输入需要复制的文件或文件夹
 * 输入目标地址
 * 输入密码（0-255）
 * 调用方法复制
 * 建立文件输入流，将需要复制的文件关联上
 * 建立文件输出流，将目标地址关联上
 * 建立数组保存一次复制的数据量
 * 建立变量判断每次复制的有效数据量
 * 循环遍历数组加密
 * 加密完成后开始复制
 * 判断是否为文件夹，如果是文件夹，则递归向内查找复制
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入需要复制的文件夹：");
		String from = new Scanner(System.in).nextLine();
		File f1 = new File(from);

		System.out.println("输入目标地址：");
		String to = new Scanner(System.in).nextLine();
		File t1 = new File(to);

		System.out.println("输入密码（0-255）：");
//		try {
		int pw = new Scanner(System.in).nextInt();
		if (pw > 255 || pw < 0) {
			System.out.println("密码不符合规则，请输入0-255之间的一个数：");
			return;
		}

		copy(f1, t1, pw);

		File t2 = new File(to + "/" + "密码：" + pw + ".txt");
		t2.createNewFile();
		FileWriter fw = new FileWriter(t2);
		fw.write("密码：" + pw);
		fw.close();
//		System.out.println("成功");
//		} catch (Exception e) {
//			System.out.println("失败");
//			e.getStackTrace();
//			return;
//		}
	}

	private static void copy(File f1, File t1, int pw) throws Exception {
		File[] f = f1.listFiles();

		for (int i = 0; i < f.length; i++) {
			if (f[i].isDirectory()) {
				String s = f[i].getName();
				File f2 = new File(t1.getAbsoluteFile() + "/" + s);
				f2.mkdirs();
				copy(f[i], f2, pw);
			} else {

				String s = f[i].getName();
				File t2 = new File(t1, s);
				t2.createNewFile();

				FileInputStream fis = new FileInputStream(f[i]);
				FileOutputStream fos = new FileOutputStream(t2);
				byte[] b = new byte[8 * 1024];
				int n;
				while ((n = fis.read(b)) != -1) {
					for (int j = 0; j < n; j++) {
						b[j] ^= pw;
					}
					fos.write(b, 0, n);
				}
				fis.close();
				fos.close();
			}
		}
	}
}
