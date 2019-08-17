package day1602;

public class Student {
	private String name;
	private int count;

	public Student() {
		super();
	}

	public Student(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return name + ";" + count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
