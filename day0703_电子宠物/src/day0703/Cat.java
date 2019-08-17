package day0703;

/*
 * 猫类，继承宠物类
 * 复写特有方法
 */
public class Cat extends Pet {
	public Cat(String name) {// 单参构造方法
		super(name);// 传递给父类处理
	}

	public Cat(String name, int full, int happy) {// 三参构造方法
		super(name, full, happy);// 传递给父类处理
	}

	public String cry() {// 重写方法
		return "喵喵喵~";// 返回特有值
	}
}
