package week02_test;


public class TestListSet {
	public static void main(String arg[]) {
		String s = new String("hello");
		String t = new String("hello");
		t.indexOf(t);
		char c[] = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(s.equals(t));
		System.out.println(t.equals(c));
		System.out.println(s == t);
		System.out.println(t.equals(new String("hello")));
	}
}