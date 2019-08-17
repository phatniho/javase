package day08_电子宠物;

import java.util.Scanner;

public abstract class Pet {
	String name;
	int full;
	int happy;

	public Pet(String name) {
		this(name, 50, 50);
	}

	public Pet(String name, int full, int happy) {
		super();
		this.name = name;
		this.full = full;
		this.happy = happy;
	}

	public void feed() {
		if (full >= 100) {
			System.out.println("吃饱了，不能再吃了！");
			return;
		}
		System.out.println("给" + name + "喂食");
		full += 50;
		System.out.println("饱食度：" + full);
	}

	public void play() {
		if (full <= 0) {
			System.out.println(name + "饿坏了，玩不动了！是否喂食？y/n");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("y") || l.equals("Y")) {
				feed();
			}
			return;
		}
		System.out.println("您的宠物" + name + "当前的状态为：\n饱食度：" + full + "\n快乐度：" + happy);
		System.out.println("请选择需要的玩耍项目：");
		System.out.println("1.喂零食");
		System.out.println("2.逗一逗");
		System.out.println("3.遛一遛");
		System.out.println("4.打一顿");
		System.out.println("5.关起来");
		System.out.println("6.喂食");
		System.out.print("请输入：");
		int i = new Scanner(System.in).nextInt();

		if (i > 6 || i < 1) {
			System.out.println("没有这个选项，请重新输入！");
			return;
		}
		switch (i) {
		case 1:
			System.out.println("给" + name + "喂食了一些零食，" + name + "心情变好了！");
			full += 10;
			happy += 10;
			break;
		case 2:
			System.out.println("陪" + name + "做了一点小游戏，" + name + "心情变好了！");
			full -= 10;
			happy += 20;
			break;
		case 3:
			System.out.println("带" + name + "出去玩了一圈，" + name + "心情变好了！");
			full -= 20;
			happy += 50;
			break;
		case 4:
			System.out.println("这家伙太兴奋了，打了" + name + "一顿，" + name + "发出了" + cry() + "的叫声！");
			full -= 10;
			happy -= 50;
			break;
		case 5:
			System.out.println("这家伙太不听话了，把它关了起来" + name + "老实了！");
			happy = 0;
			break;
		case 6:
			feed();
			break;
		}
		System.out.println("当前状态：\n饱食度：" + full + "\n快乐度：" + happy);

	}

	// 父类型，是一种泛化的类型，
	// 有些子类不同代码，在父类中没法写，
	// 可以选择定义成抽象方法

	// 作为通用方法在父类中定义
	// 要求具体子类中必须实现这个方法
	public abstract String cry();
}
