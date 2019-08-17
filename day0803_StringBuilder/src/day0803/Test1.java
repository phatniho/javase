package day0803;

/*
 * 需求：StringBuilder类
 * append()追加
 * delete(start,end)[,)
 * deleteCharAt(i)删除指定位置的单个字符
 * insert(i,内容)在指定位置插入
 * setCharAt(i,字符)替换指定位置的单个字符
 * replace(start,end,内容)替换指定范围的内容
 * 
 * Stringbuffer 线程安全，效率低
 * Stringbuilder 线程不安全，效率高
 */
public class Test1 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		long t = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {// 遍历，字符串连接，效率高，但要注意堆内存溢出
			sb.append(s0);
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t);
	}
}
