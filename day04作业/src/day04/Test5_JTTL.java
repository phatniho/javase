package day04;

/*
 * 需求：鸡兔同笼
 * 鸡兔同笼，上有35头，下有94脚，求鸡兔各几只。
 * 分析：穷举法求解
 * 鸡兔共35只，鸡从0开始算，兔从35开始算。
 * 分别算每一种组合的脚是不是94只，如果是，则输出打印结果。
 */
public class Test5_JTTL {
	public static void main(String[] args) {
		System.out.println("鸡兔同笼，上有35头，下有94脚，鸡兔各几只？");// 打印题目
		System.out.println("开始计算……");
		for (int j = 0, t = 35; j <= 35; j++, t--) {// 穷举法进行列举
			int f = j * 2 + t * 4;// 计算每一种组合脚的数量
			if (f == 94) {// 判断是否满足条件
				System.out.println("鸡有" + j + "只，兔有" + t + "只");// 满足则输出结果
				break;// 满足条件的结果出现后结束循环，不继续判断
			}
		}
	}
}
