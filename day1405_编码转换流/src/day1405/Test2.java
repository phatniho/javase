package day1405;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
 * 需求：向文件输出
 * f6   GBK
 * f7	UTF-8
 * 
 * 把Unicode编码所有的中文字符，输出到两个文件
 * \u4e00到\u9fa5，20902个中文
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		f("d:/abc/f6", "GBK");// 将数据按指定码表转换后存储到文件中
		f("d:/abc/f7", "UTF-8");
	}

	private static void f(String path, String charset) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(// 输出流编码转换，按指定码表
				new FileOutputStream(path), charset);// 文件输出流

		int count = 0;// 定义计数器
		for (int i = '\u4e00'; i <= '\u9fa5'; i++) {// 循环遍历，所有中文字符
			osw.write(i);// 循环写出到文件中
			count++;// 计数器自增
			if (count == 30) {// 每写出30个字符
				osw.write("\n");// 添加换行标记
				count = 0;// 计数器归零
			}
		}
		osw.close();// 关闭输出流
	}
}
