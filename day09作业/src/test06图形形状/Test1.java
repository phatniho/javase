package test06图形形状;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Shape s = add();
	}

	private static Shape add() {
		while (true) {
			System.out.println("按回车随机生成图形");
			new Scanner(System.in).nextLine();
			int x = new Random().nextInt(3);
			switch (x) {
			case 0:
				Line l = new Line();
				l.draw();
				l.length(3);
				l.clean();
				break;
			case 1:
				Square s = new Square();
				s.draw();
				s.clean();
				break;
			case 2:
				Circle c = new Circle();
				c.draw();
				c.clean();
				break;
			}
		}
	}
}
