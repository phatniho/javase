package 电子宠物;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("选择需要的宠物，q退出");
			System.out.println("1.猫");
			System.out.println("2.狗");
			System.out.print("选择->");
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("游戏结束");
				break;
			}
			try {
				int i = Integer.parseInt(s);
				if (i < 1 || i > 2) {
					System.out.println("没有这个选项，请重新选择");
					continue;
				}
				System.out.println("给你的宠物起个名字吧");
				String name = new Scanner(System.in).nextLine();
				Pet pet = null;
				switch (i) {
				case 1:
					pet = new Cat(name);
					fun(pet);
					break;
				case 2:
					pet = new Dog(name);
					fun(pet);
					break;
				}
			} catch (Exception e) {
				System.out.println("输入有误，请重新输入");
				continue;
			}
		}
	}

	private static void fun(Pet pet) {
		while (true) {
			System.out.println("选择要进行的操作，q退出");
			System.out.println("1.喂食");
			System.out.println("2.玩耍");
			System.out.println("3.惩罚");
			System.out.println("选择：");
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				System.out.println("退出游戏");
				break;
			}
			try {
				int i = Integer.parseInt(s);
				if (i > 3 || i < 1) {
					System.out.println("没有这个选项，请重新输入");
					continue;
				}
				switch (i) {
				case 1:
					pet.feed();
					break;
				case 2:
					pet.play();
					break;
				case 3:
					pet.punish();
					break;
				}
				pet.show();

			} catch (Exception e) {
				System.out.println("输入有误，请重新输入！");
				continue;
			}
		}
	}
}
