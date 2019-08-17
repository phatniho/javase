package day08_电子宠物;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请按回车开始游戏，按q退出");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("q")) {
				System.out.println("退出游戏");
				break;
			}
			System.out.println("请输入你想要的宠物类型：");
			System.out.println("1.狗");
			System.out.println("2.猫");
			System.out.print("请选择");
			int i = new Scanner(System.in).nextInt();
			if (i != 1 && i != 2) {
				System.out.println("没有这个选项，请重新输入");
				continue;
			}
			System.out.println("请给你的宠物起个名吧！");
			System.out.print("请输入名字：");
			String n = new Scanner(System.in).nextLine();
			switch (i) {
			case 1:
				Dog d = new Dog(n);
				System.out.println("恭喜你，宠物" + d.name + "建立成功！请好好照顾它！");
				f(d);
				break;
			case 2:
				Cat c = new Cat(n);
				System.out.println("恭喜你，宠物" + c.name + "建立成功！请好好照顾它！");
				f(c);
				break;
			}
		}
	}

	public static void f(Pet p) {
		System.out.println("按回车开始，q结束");
		while (true) {
			System.out.println("输入选项继续，q结束");
			String l = new Scanner(System.in).nextLine();
			if (l.equals("q")) {
				System.out.println("退出游戏");
				break;
			}
			p.play();
		}
	}
}
