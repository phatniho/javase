package day07作业_电子宠物;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：电子宠物
 * 按回车开始游戏，按q退出
 * 选择想要建立的宠物类型，选择成功后输入名字，按提示操作进行宠物喂养
 */
public class Test1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入回车开始游戏，按q退出。。。");// 提示信息
			String s = new Scanner(System.in).nextLine();// 获取输入的信息
			if (s.equals("q")) {// 判断是否为结束标记
				System.out.println("游戏结束");
				break;// 结束游戏
			}

			System.out.println("请输入你需要建立的宠物类型：");// 提示信息
			System.out.println("1.狗");
			System.out.println("2.猫");
			System.out.println("3.鸟");
			System.out.println("4.鱼");
			System.out.println("5.鼠");
			System.out.println("6.蛇");
			System.out.print("请选择：");
			int i = new Scanner(System.in).nextInt();// 获取输入的选项
			if (i > 6 || i < 1) {// 无效选择范围
				System.out.println("没有这种宠物，请重新选择");
			} else {// 有效选择范围
				System.out.print("选择成功，请给您的宠物起个名字：");
				String name = new Scanner(System.in).nextLine();// 获取输入的字符串，为宠物命名
				switch (i) {// 根据选择新建对应的宠物类型
				case 1:
					Dog d = new Dog(name);// 传入输入的字符串，为新建宠物对象命名
					haveFun(d);// 调用方法进行操作
					break;// 结束
				case 2:
					Cat c = new Cat(name);
					haveFun(c);
					break;
				case 3:
					Bird b = new Bird(name);
					haveFun(b);
					break;
				case 4:
					Fish f = new Fish(name);
					haveFun(f);
					break;
				case 5:
					Mouse m = new Mouse(name);
					haveFun(m);
					break;
				case 6:
					Snake ss = new Snake(name);
					haveFun(ss);
					break;
				}
			}
		}
	}

	public static void haveFun(Pet p) {// 玩耍方法，传入父类保证所有子类都可以正常运行
		System.out.print("按回车开始游戏");// 提示信息
		while (true) {// 循环操作
			System.out.println("按w喂食，a玩耍，d随机玩耍，q退出");// 提示信息
			String s = new Scanner(System.in).nextLine();// 获取输入的字符串
			if (s.equals("q")) {// 判断是否为退出标记
				System.out.println("退出游戏");// 提示信息
				break;// 退出程序
			}
			switch (s) {// 根据输入的选项来对宠物进行操作
			case "w":// 匹配判断
				p.feet();// 调用方法
				break;// 结束操作
			case "a":
				p.play();
				break;
			case "d":
				p.punish();
				break;
			default:
				System.out.println("无效操作，宠物没有任何反应。");// 其他操作提示
			}
		}
	}

}
