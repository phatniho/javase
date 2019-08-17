package µç×Ó³èÎï;

public class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String name, int full, int happy) {
		super(name, full, happy);
	}

	public Dog(String name) {
		super(name);
	}

	@Override
	public String cry() {
		return "ÍôÍôÍô";
	}
}
