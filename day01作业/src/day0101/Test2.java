package day0101;

/*
 * 需求：自增自减运算，判断自增自减运算的顺序
 */
public class Test2 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a++);// 先提取a的值，再执行自增，然后打印保存的a的值

		a = 5;
		System.out.println(++a);// 先执行自增，再提取a的值，然后打印保存的a的值
	}
}
