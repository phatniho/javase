package day16;

public class Stack {
	private char[] a = new char[5];
	private int index;

	public void push(char c) {
		if (isFull()) {
			return;
		}
		a[index] = c;
		index++;
	}

	public boolean isFull() {
		return index == 5;
	}

	public char pop() {
		if (isEmpty()) {
			return ' ';
		}
		index--;
		return a[index];
	}

	public boolean isEmpty() {
		return index == 0;
	}

}
