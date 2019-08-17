package day07作业_电子宠物;

public class Snake extends Pet {
	public Snake(String name) {
		super(name);
	}

	public Snake(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "咝咝咝~";
	}
}
