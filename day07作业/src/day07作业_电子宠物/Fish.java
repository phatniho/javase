package day07��ҵ_���ӳ���;

public class Fish extends Pet {
	public Fish(String name) {
		super(name);
	}

	public Fish(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "���๾��~";
	}
}
