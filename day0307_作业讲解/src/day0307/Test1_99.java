package day0307;

/*
 * 需求：99乘法表
 * 分析
 */
public class Test1_99 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {// 定义外圈，代表行数
			for (int j = 1; j <= i; j++) {// 定义内圈，代表列数
				if (j == 3 && (i == 3 || i == 4)) {// 特殊行判断对齐
					System.out.print(" ");// 空格符号对齐
				}
				System.out.print(j + "*" + i + "=" + (i * j) + " ");// 打印公式
			}
			System.out.println();// 行尾换行
		}
	}
}
