package day1202;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：变形金刚使用不同武器进行进攻
 * 定义武器接口，可以方便随时更换武器
 */
public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();// 新建变形金刚对象
		Sword s = new Sword();// 新建剑对象
		AK47 a = new AK47();// 新建枪对象
		Lyb l = new Lyb();// 新建狼牙棒对象
		System.out.println("按回车执行,q退出");// 提示信息
		while (true) {// 循环执行
			String q = new Scanner(System.in).nextLine();// 获取输入的值
			if (q.equals("q")) {// 判断是否为结束标记
				System.out.println("游戏结束！");// 结束提示
				break;// 结束循环
			}
			int r = new Random().nextInt(4);// 生成随机数
			switch (r) {// 根据生成的随机数使用对应的武器进攻
			case 0:
				t.setWeapon(s);
				break;
			case 1:
				t.setWeapon(a);
				break;
			case 2:
				t.setWeapon(l);
				break;
			case 3:
				t.setWeapon(null);
				break;
			}
			t.attack();// 调用攻击方法
		}
	}
}
