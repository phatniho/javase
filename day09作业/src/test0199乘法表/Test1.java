package test0199³Ë·¨±í;

public class Test1 {
	public static void main(String[] args) {
		for99();
	}

	private static void for99() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
