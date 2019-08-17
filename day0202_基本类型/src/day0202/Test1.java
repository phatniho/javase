package day0202;

/*
 * 需求：基本类型表面值规则
 * 1.整数的表面值是int
 * 2.浮点数的表面值是double
 * 3.比int小的三种整数char，short，byte，在范围内可以直接赋值
 * 4.后缀
 * 		d	-double
 * 		l	-long
 * 		f	-float
 * 5.前缀
 * 		0x1f3e 	-16进制
 * 		0b111 	-2进制
 * 		007  	-8进制
 * 		\uffff 	-char类型的16进制
 * 练习char类型
 * 分析：
 * Unicode编码表0-65535的数字，每个位置分别对应一个字符
 * char类型可以直接当做整数来运算
 */
public class Test1 {
	public static void main(String[] args) {
		char c1 = 'a';// 单个字符
		char c2 = 97;// 对应的码表位置
		char c3 = 'b';
		char c4 = 98;
		char c5 = '你';
		char c6 = 20320;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println('彭' + 0);// 24429
		System.out.println('海' + 0);// 28023

		System.out.println('\u0061');// a
		System.out.println('\u4e2d');// 中
		System.out.println('\u5f6d');// 彭
		System.out.println('\u6d77');// 海

	}
}
