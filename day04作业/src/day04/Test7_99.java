package day04;

/*
 * 需求：打印99乘法表
 */
public class Test7_99 {
	public static void main(String[] args) {
		CFB();// 调用方法打印99乘法表
	}

	private static void CFB() {
		for (int i = 1; i <= 9; i++) {// 外层循环，决定行数
			for (int j = 1; j <= i; j++) {// 内层循环，决定列数
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");// 打印公式
			}
			System.out.println();// 行尾换行
		}
	}
}
