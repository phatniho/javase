package day07��ҵ_���ӳ���;

public class Bird extends Pet {
	public Bird(String name) {
		super(name);
	}

	public Bird(String name, int full, int happy) {
		super(name, full, happy);
	}

	public String cry() {
		return "���~";
	}
}
