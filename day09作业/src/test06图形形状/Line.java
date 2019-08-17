package test06Í¼ÐÎÐÎ×´;

public class Line extends Shape {
	public void draw() {
		System.out.print("¡ª¡ª");
	}

	public void length(int i) {
		for (int j = 0; j < i; j++) {
			draw();
		}
	}
}
