package test06ͼ����״;

public class Line extends Shape {
	public void draw() {
		System.out.print("����");
	}

	public void length(int i) {
		for (int j = 0; j < i; j++) {
			draw();
		}
	}
}
