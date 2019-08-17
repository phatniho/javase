package day0703;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：电子宠物
 * 根据选项提示，选择需要创建的宠物
 * 选择成功后，给宠物输入名字
 * 重复调用方法对宠物进行随机操作
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("1.猫");// 根据提示创建宠物
		System.out.println("2.狗");
		System.out.print("选择：>");
		int i = new Scanner(System.in).nextInt();
		if (i != 1 && i != 2) {// 判断是否输入了有效选项
			System.out.println("没有这个选项！");
		} else {
			System.out.print("给宠物起个名：");
			String s = new Scanner(System.in).nextLine();// 获取输入的字符串，作为宠物名

//			Cat cat = null;// 预创建宠物对象
//			Dog dog = null;// 预创建宠物对象
			Pet pet = null;//

			if (i == 1) {// 满足特定要求时
				pet = new Cat(s);// 将预创建的对象引用指向特定对象
				f(pet);// 调用方法随机操作宠物
			} else {
				pet = new Dog(s);
				f(pet);
			}
		}
	}

	public static void f(Pet p) {
		System.out.println("按回车执行");// 提示语句
		while (true) {// 循环操作
			new Scanner(System.in).nextLine();// 回车开始执行
			int r = new Random().nextInt(9);// 随机值
			switch (r) {// 根据随机值判断该执行什么操作
			case 0:
				p.feed();// 调用喂食方法
				break;// 结束
			case 1:
				p.play();// 调用玩耍方法
				break;// 结束
			default:// 其他情况
				p.punish();// 调用惩罚方法
			}
		}
	}
}
