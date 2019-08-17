package day07作业_电子宠物;

import java.util.Random;

/*
 * 宠物类
 * name
 * full
 * happy
 * feet()
 * play()
 * punish()
 * cry()
 */
public class Pet {
	String name;// 成员变量
	int full;
	int happy;

	public Pet(String name) {// 单参构造方法
		this(name, 50, 50);// 初始化成员变量为默认值
	}

	public Pet(String name, int full, int happy) {// 全参构造方法
		this.name = name;// 设置每个成员变量为传入的参数值
		this.full = full;
		this.happy = happy;
	}

	public void feet() {// 喂食判断
		if (full >= 100) {
			System.out.println(name + "已经吃饱了！");
			return;// 满了不继续执行喂食
		}
		System.out.println("喂食" + name + "一些食物");
		full += 50;
		System.out.println("饱食度为：" + full);
	}

	public void play() {// 玩耍方法
		if (full <= 0) {
			System.out.println(name + "饿了，玩不动了！");
			return;// 饿了不玩
		}
		if (happy <= 0) {
			System.out.println(name + "不开心，不想陪你玩了！");
			return;// 不开心不玩
		}
		full -= 10;
		happy += 10;
		System.out.println("饱食度：" + full + "，快乐度：" + happy);
	}

	public void punish() {// 随机惩罚方法
		play();// 调用玩耍方法判断
		int i = new Random().nextInt(6);// 产生随机数
		String s = "";// 默认值
		switch (i) {// 根据随机数进行对应操作
		case 0:
			s = "被轻轻的抚摸了一下";
			happy += 10;
			break;
		case 1:
			s = "被投喂了一颗零食";
			happy += 10;
			full += 10;
			break;
		case 2:
			s = "被呵斥了一声";
			happy -= 10;
			break;
		case 3:
			s = "被打了一顿";
			happy -= 10;
			full -= 10;
			break;
		case 4:
			s = "出去溜了一圈";
			happy += 10;
			full -= 10;
			break;
		case 5:
			s = "被灌了一颗药";
			happy -= 10;
			full += 10;
			break;
		}
		System.out.println(name + s + "，发出了" + cry() + "的声音~");
		System.out.println("饱食度：" + full + "，快乐度：" + happy);
	}

	public String cry() {
		return "";// 特有方法，子类重写
	}
}
