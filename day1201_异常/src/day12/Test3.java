package day12;

import java.io.File;
import java.io.IOException;

/*
 * 需求：异常包装
 */
public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		Date d = new Date();// 新建日期对象
		String s = d.toString();
		System.out.println(s);// 打印默认调用toString()方法
		// 日期格式化工具类，可以将日期进行指定格式的处理
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String s = sf.format(d);// 处理完保存到变量中
//		System.out.println(s);// 打印字符串
		s = s.replaceAll(":", "-");// 更改字符串中的指定字符
		String path = "D:/" + s + ".txt";// 用字符串保存地址值
		File f = new File(path);// 新建文件对象，传入地址值
		// 不想添加throws
		try {
			f.createNewFile();
		} catch (IOException e) {
			throw new RuntimeException();
		} // 新建文件

	}
}
