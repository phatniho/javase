package day03;

/*
 * 需求：打印九九乘法表
 * 分析：for循环嵌套打印
 */
public class Test3_99 {
	public static void main(String[] args) {
		for99();// 默认打印99乘法表（1*1到9*9）
		for99(3);// 输入特定数字，只打印1*1到n*n之间的乘法表
		for99(3, 9);// 输入两个参数，打印x*x到y*y之间的乘法表
	}

	private static void for99() {// 默认打印1-9
		for99(9);// 调用单参数，传入9
	}

	private static void for99(int i) {// 默认打印1-i
		for99(1, i);// 调用双参数，传入起点1，终点i
	}

	private static void for99(int i, int j) {// 自定义起点和终点
		for (int x = i; x <= j; x++) {// 循环判断外层，行数
			for (int y = i; y <= x; y++) {// 循环判断内层，列数
				System.out.print(y + "X" + x + "=" + x * y + "\t");// 行内不换行，输出打印结果
			}
			System.out.println();// 行尾换行
		}
	}
}
