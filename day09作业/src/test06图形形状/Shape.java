package test06图形形状;

public abstract class Shape {
	public abstract void draw();

	public void clean() {
		System.out.println("假装被擦掉了");
		System.out.println("--------------");
	}
}
