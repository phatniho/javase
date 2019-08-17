package day0802;

public class Test2 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		String s = "";
		// 连接前，取系统当前时间的时间点毫秒值
		// 毫秒值：1970年1月1日0点开始的毫秒值
		long t = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {// 遍历，字符串连接，效率低
			s += s0;
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t);
	}
}
