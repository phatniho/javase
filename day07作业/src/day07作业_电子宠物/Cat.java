package day07作业_电子宠物;

public class Cat extends Pet {
	public Cat(String name) {
		super(name);
	}

	public Cat(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "喵喵喵~";
	}
}
