package day1603;

public class Stack {
	private char[] a = new char[5];// 定义固定长度的容器，保存数据，
	private int index;// 定义变量，用于下标访问数组

	public void push(char c) {// 压栈方法
		if (isFull()) {// 判断是否存满
			return;// 存满则直接返回，不继续执行
		}
		a[index] = c;// 将指定字符赋值给容器内指定位置
		index++;// 角标加一
	}

	public boolean isFull() {// 判断容器是否放满的方法，方便外部调用
		return index == 5;
	}

	public char pop() {// 弹栈方法
		if (isEmpty()) {// 判断容器是否为空
			return ' ';// 用空格字符表示没有数据
		}
		index--;// 角标减一
		char c = a[index];// 取当前角标下的数据
		return c;// 返回到调用位置
	}

	public boolean isEmpty() {// 判断容器是否为空的方法，方便外部调用
		return index == 0;
	}
}
