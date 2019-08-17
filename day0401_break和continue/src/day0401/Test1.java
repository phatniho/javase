package day0401;

/*
 * 需求：break和continue
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--------------");
		f1();
		System.out.println("\n--------------");
		f2();
	}

	private static void f1() {
//		double d = Math.random();// 随机浮点数[0,1) alt+shift+L  提取代码段
//		System.out.println(d);
		for (int i = 1;; i++) {//定义无限循环
			double d = Math.random();//产生一个[0,1)的随机浮点数
			if (d > 0.999) {//判断产生的数是否满足条件
				System.out.println("第" + i + "次:" + d);//如果满足则输出打印结果
				break;//结束循环
			}
		}
	}

	private static void f2() {
		for (int i = 1; i <= 100; i++) {//定义循环
			int x = i % 10;//定义变量，取个位数
			if (x == 3 || x == 5 || x == 7) {//判断是否满足条件
				continue;//满足则不继续向下执行，返回循环执行
			}
			System.out.println(i);//输出打印结果
		}
	}
}
