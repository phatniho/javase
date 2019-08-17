package day0901;
/*
 * 圭侘
 */
public class Square extends Shape  {
	public void draw() {
		System.out.println("！！！！！！");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4) {
					System.out.print("|");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("！！！！！！");
	}
}
