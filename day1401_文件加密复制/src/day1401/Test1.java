package day1401;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 需求：文件加密复制
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("输入需要加密的原文件：");// 提示信息
			// D:/abc/aa/bb/cc/23562342.png
			String from = new Scanner(System.in).nextLine();// 获取输入的文件地址字符串
			File f1 = new File(from);// 将输入的文件地址字符串转换为文件对象
			if (!f1.isFile()) {// 判断是否为有效文件
				System.out.println("不是一个有效文件，请重新输入");// 提示信息
				continue;// 如果不是有效文件，则继续下一次循环，重新输入
			}

			System.out.println("输入目标文件：");// 提示信息
			// D:/abc/aa/bb/cc/2.png
			String to = new Scanner(System.in).nextLine();// 获取输入的目标地址文件字符串，文件要先存在
			File f2 = new File(to);// 将输入的目标地址文件转换为文件对象
			if (f2.isDirectory()) {// 判断是否为有效文件
				System.out.println("不能是一个文件夹，请重新输入");// 提示信息
				continue;// 不是有效文件，继续下一次循环，重新输入
			}

			System.out.print("输入密码（范围0-255）：");// 提示信息
			try {// 异常捕捉
				int pw = new Scanner(System.in).nextInt();// 获取输入的密码整数值
				if (pw > 255 || pw < 0) {// 判断是否为有效范围
					System.out.println("密码不符合要求，请重新输入");// 提示信息
					continue;// 不在有效范围，返回下一次循环
				}
				copy(f1, f2, pw);// 复制方法
				System.out.println("成功");// 复制成功提示
				break;// 结束循环
			} catch (Exception e) {// 异常处理
				System.out.println("失败");// 复制失败提示
				e.getStackTrace();// 获取栈追踪信息
				break;// 结束循环
			}
		}
	}

	private static void copy(File f1, File f2, int pw) throws Exception {// 复制文件方法
		FileInputStream fis = new FileInputStream(f1);// 文件输入流，将原文件中的数据读入到内存中
		FileOutputStream fos = new FileOutputStream(f2);// 文件输出流，将内存中的数据写出到目标文件中
		byte[] b = new byte[8 * 1024];// 定义数组保存一次读取的数据量，8192=8*1024，是一个性价比最高的容量
		int n;// 定义变量保存每次读取的有效数据量
		while ((n = fis.read(b)) != -1) {// 循环读取，如果未读取到有效数据，则返回-1，结束循环
			for (int i = 0; i < n; i++) {// 循环遍历读取到数据的数组
				b[i] ^= pw;// 对每个数据进行异或加密
			}
			fos.write(b, 0, n);// 将加密完成后的数据写出到目标文件中
		}
		fis.close();// 关闭输入流
		fos.close();// 关闭输出流
	}
}
