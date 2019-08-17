package day0703;

/*
 * 宠物类
 * 成员：
 * name，
 * full，
 * happy，
 * feed()
 * play()
 * punish()
 * cry()
 */
public class Pet {
	String name;// 成员变量
	int full;
	int happy;

	public Pet(String name) {// 单参构造方法
		this(name, 50, 50);// 默认值处理
	}

	public Pet(String name, int full, int happy) {// 全参构造方法
		this.name = name;// 成员值处理
		this.full = full;
		this.happy = happy;
	}

	public void feed() {// 喂食方法
		if (full == 100) {// 判断饱食度
			System.out.println(name + "已经吃饱了");
			return;// 饱食度满则不继续喂食
		}
		System.out.println("给" + name + "喂食");// 提示信息
		full += 10;// 喂食
		System.out.println("饱食度：" + full);// 打印饱食度信息
	}

	public void play() {// 玩耍方法
		if (full == 0) {// 判断饱食度
			System.out.println(name + "饿了，不能再玩了");
			return;// 为零则不继续运行
		}
		System.out.println("陪" + name + "玩耍");
		happy += 10;// 快乐度增加
		full -= 10;// 饱食度减少
		System.out.println("快乐度：" + happy);
		System.out.println("饱食度：" + full);
	}

	public void punish() {// 惩罚方法
		// 不同的代码，就调用方法
		System.out.println("打" + name + "的pp，" + name + "发出了哭叫：" + cry());
		happy -= 10;// 快乐度减少
		System.out.println("快乐度：" + happy);
	}

	public String cry() {
		// 无意义代码，必须在子类中重写这个方法
		return "此处有哭叫声~";
	}
}
