package day0403;

import java.util.Scanner;

/*
 * 需求：循环命名
 * 您现在的状态：
 * 1.好嗨哟~
 * 2.感觉人生已经到达了高潮~
 * 3.感觉人生已经到达路巅峰~
 * 4.我想静静，bye~
 * 选择：>
 */
public class Test1 {
	public static void main(String[] args) {
		outer: while (true) {// 外层循环命名
			int c = caiDan();// 调用方法获取结果
			switch (c) {// 内层循环判断
			case 1:// 特定选项
				System.out.println("好嗨哟~");// 输出对应结果
				break;// 结束循环
			case 2:
				System.out.println("感觉人生已经到达了高潮~");
				break;
			case 3:
				System.out.println("感觉人生已经到达路巅峰~");
				break;
			case 4:
				System.out.println("我想静静，bye~");
				break outer;// 结束指定循环，一般结束外层循环
			default:
				System.out.println("没有这个选项，请重新输入1-4中的一个！");
			}
		}
	}

	private static int caiDan() {
		System.out.println("\n------------------");
		System.out.println("您现在的状态：");
		System.out.println("1.好嗨哟~");
		System.out.println("2.感觉人生已经到达了高潮~");
		System.out.println("3.感觉人生已经到达路巅峰~");
		System.out.println("4.我想静静，bye~");
		System.out.print("选择：>");
		int i = new Scanner(System.in).nextInt();
		return i;// 获取输入的值并返回到调用位置
	}
}
