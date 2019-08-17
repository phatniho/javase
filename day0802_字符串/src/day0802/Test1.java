package day0802;

/*
 * 需求：String 类
 * 常用方法：
 * charAt()
 * length()
 * indexOf()
 * indexOf()
 * lastIndexOf()
 * subString()
 * subString()
 * trim()
 */
public class Test1 {
	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c', 'd' };
		String s1 = new String(a);
		String s2 = "abcd";
		String s3 = "abcd";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
}
