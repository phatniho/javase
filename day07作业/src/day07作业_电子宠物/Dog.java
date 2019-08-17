package day07作业_电子宠物;

public class Dog extends Pet {
	public Dog(String name) {
		super(name);
	}

	public Dog(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "汪汪汪~";
	}
}
