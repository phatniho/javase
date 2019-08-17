package day0205;

/*
 * 需求：自增自减。判断自增自减的运算顺序
 */
public class Test1 {
	public static void main(String[] args) {
		/*
		 * 添加断点 f11 启动调试，在断点位置暂停 f6单步执行
		 */
		int a = 6;
		System.out.println("a++=" + a++);// 6 先取值，最后打印取出的值
		System.out.println("a=" + a);// 7 自增后变成了7
		System.out.println("\n----------");

		a = 6;
		System.out.println("++a=" + ++a);// 7 先自增，再取值7
		System.out.println("a=" + a);// 7 已经自增完成，直接打印
		System.out.println("\n----------");

		a = 6;
		int b = a++;// 先取值6，a再自增为7，最后将取出的6赋值给b
		System.out.println("a=" + a);// 7 a自增后的值
		System.out.println("b=" + b);// 6 b为先取出的值
		System.out.println("\n----------");

		a = 6;
		a = a++;// 先取出值6，再自增为7，最后将取出的6赋值给a
		System.out.println("a=" + a);// 6 先变为7，再变回6
		System.out.println("\n----------");

		a = 6;
		a++;// 先取出值6，再自增为7
		System.out.println("a=" + a);// 7
		System.out.println("\n----------");

		a = 3;// 重新赋值
		b = 4;// 重新赋值
		System.out.println("交换前的值为：\na=" + a + "\nb=" + b);// 打印交换前的值
		int c = a;// 定义临时变量，保存a的值
		a = b;// 将b的值赋值给a
		b = c;// 将临时变量保存的a的值赋值给b
		System.out.println("交换后的值为：\na=" + a + "\nb=" + b);// 打印交换后的值
	}
}
