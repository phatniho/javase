package day1303;

import java.io.FileInputStream;

/*
 * 需求：建立文件输入流，将硬盘中指定位置文件的内容读入到内存中
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		// 输入流，读入到内存中
		FileInputStream fis = new FileInputStream("d:/abc/f2");

		// 标准循环读取格式
		int b;// 先定义一个变量
		// 循环遍历读取，嵌套小括号判断读出的是否为-1
		while ((b = fis.read()) != -1) {// 逐个读取
			System.out.println(b);// 循环打印
		}
		fis.close();// 关闭流

//		自己写的思路
//		int s ;//定义一个变量
//		while (true) {//死循环读取
//			s = fis.read();//读取一个字节转换为int类型
//			if (s == -1) {//判断是否读取结束
//				break;//结束循环
//			}
//			System.out.println(s);//循环打印读取到的值
//		}
//		fis.close();
	}
}
