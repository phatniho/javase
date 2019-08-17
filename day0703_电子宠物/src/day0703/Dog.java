package day0703;

/*
 * 狗类，继承宠物类
 * 重写特有方法
 */
public class Dog extends Pet {
	public Dog(String name) {// 单参构造方法
		super(name);// 将参数传递给父类处理
	}

	public Dog(String name, int full, int happy) {// 全参构造方法
		super(name, full, happy);// 将参数传递给父类处理
	}

	public String cry() {// 重写方法
		return "汪汪汪~";// 返回特有值
	}
}
