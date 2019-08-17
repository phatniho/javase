package day07作业_电子宠物;

public class Mouse extends Pet {
	public Mouse(String name) {
		super(name);
	}

	public Mouse(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "叽叽叽~";
	}
}