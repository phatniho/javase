package day03;

/*
 * 需求：鸡兔同笼，共35头，94脚，问鸡兔各几只？
 * 分析：
 * 使用穷举法，从鸡为0只开始，列出所有组合
 * 分别计算每种组合的脚的数量
 * 将计算结果与条件匹配，如果相等则返回该组合方式
 */
public class Test2_JTTL {
	public static void main(String[] args) {
		jttl();// 调用鸡兔同笼方法得到结果
	}

	private static void jttl() {// 鸡兔同笼方法
		for (int j = 0, t = 35; j <= 35; j++, t--) {// 穷举法，列举所有组合
			if (j * 2 + t * 4 == 94) {// 判断每一种组合脚的数量是否满足条件
				System.out.println("有" + j + "只鸡，" + t + "只兔");// 如果满足则输出这种组合
			}
		}
	}
}
