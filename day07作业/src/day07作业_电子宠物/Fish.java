package day07作业_电子宠物;

public class Fish extends Pet {
	public Fish(String name) {
		super(name);
	}

	public Fish(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "咕噜咕噜~";
	}
}
