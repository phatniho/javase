package 文件加密复制;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("输入原文件：");
			String f = new Scanner(System.in).nextLine();
			File from = new File(f);
			if (!from.isFile()) {
				System.out.println("不是一个有效文件，请重新输入！");
				continue;
			}
			System.out.println("输入目标文件：");
			String t = new Scanner(System.in).nextLine();
			File to = new File(t);
			if (to.isDirectory()) {
				System.out.println("目标必须是一个文件，请重新输入");
				continue;
			}
			System.out.println("输入密码（0-255）：");
			try {
				int pw = new Scanner(System.in).nextInt();
				if (pw > 255 || pw < 0) {
					System.out.println("密码不在有效范围内，请重新输入");
					continue;
				}
				copy(from, to, pw);
				System.out.println("是否继续？y/n");
				String y = new Scanner(System.in).nextLine();
				if (y.equals("y")) {
					continue;
				} else if (y.equals("n")) {
					break;
				} else {
					System.out.println("输入有误，请重新选择");
					continue;
				}
			} catch (Exception e) {
				System.out.println("密码输入错误，请重新输入");
				continue;
			}
		}
	}

	private static void copy(File from, File to, int pw) throws Exception {
		FileInputStream fis = new FileInputStream(from);
		FileOutputStream fos = new FileOutputStream(to);
		byte[] b = new byte[8 * 1024];
		int n;
		while ((n = fis.read(b)) != -1) {
			for (int j = 0; j < b.length; j++) {
				b[j] ^= pw;
			}
			fos.write(b, 0, n);
		}
		fis.close();
		fos.close();
	}
}
