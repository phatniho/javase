package day12;

import java.text.SimpleDateFormat;

/*
 * 日期显示格式类，继承日期类，重写toString
 */
public class Date extends java.util.Date {
	@Override
	public String toString() {
		// "yyyy-MM-dd HH:mm:ss"
		// 使用工具指定输出格式
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = f.format(this);// 定义变量接收结果
		return s;// 返回结果
	}
}
