package 电子宠物;

import java.util.Scanner;

public abstract class Pet {
	private String name;
	private int full;
	private int happy;

	public Pet() {
	}

	public Pet(String name) {
		this(name, 50, 50);
	}

	public Pet(String name, int full, int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}

	public void show() {
		System.out.println("当前饱食度：" + this.full);
		System.out.println("当前快乐度：" + this.happy);
	};

	public void feed() {
		System.out.println("给" + this.name + "喂食，饱食度增加");
		this.full += 50;
	}

	public void play() {
		if (this.full <= 0) {
			System.out.print("饿得玩不动了,");
			while (true) {
				System.out.println("是否喂食？y/n");
				String s = new Scanner(System.in).nextLine();
				if (s.equals("y")) {
					feed();
					break;
				} else if (s.equals("n")) {
					System.out.println("不喂食就不能玩");
					continue;
				} else {
					System.out.println("输入有误，请重新输入");
					continue;
				}
			}
		}
		System.out.println("愉快的玩耍");
		this.full -= 10;
		this.happy += 20;
	}

	public void punish() {
		if (this.happy <= 0) {
			System.out.println("已经这么伤心了，就不要惩罚它了");
			while (true) {
				System.out.println("是否陪它玩玩？y/n");
				String s = new Scanner(System.in).nextLine();
				if (s.equals("y")) {
					play();
					break;
				} else if (s.equals("n")) {
					System.out.println("宠物不想理你了，请陪它玩玩");
					continue;
				} else {
					System.out.println("输入有误，请重新输入");
					continue;
				}
			}
		}
		System.out.println("教训它，发出" + cry() + "的叫声");
		this.happy -= 10;
	}

	public abstract String cry();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFull() {
		return full;
	}

	public void setFull(int full) {
		this.full = full;
	}

	public int getHappy() {
		return happy;
	}

	public void setHappy(int happy) {
		this.happy = happy;
	}

}
