package day1002;

import java.util.Scanner;

/*
 * 需求：新建数组，并在数组中新建soldier实例
 * [{},{},{}]
 * 
 * 当有存活士兵，士兵数量!=0
 * 让士兵进攻
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("士兵数量：");// 提示信息
		int n = new Scanner(System.in).nextInt();// 获取输入的值
		Soldier[] a = new Soldier[n];// 新建士兵对象数组
		for (int i = 0; i < a.length; i++) {// 循环遍历
			a[i] = new Soldier();// 新建士兵对象，保存到士兵对象数组中
			a[i].id = i + 1;// 设置士兵id值
		}
		System.out.println("按回车执行");// 提示信息
		while (Soldier.count != 0) {// 循环执行，只要不为0则一直执行
			new Scanner(System.in).nextLine();// 回车键开始
			for (int i = 0; i < a.length; i++) {// 循环遍历
				if (a[i].blood != 0) {// 判断是否存活
					a[i].attack();// 存活则发动进攻
				}
			}
			System.out.println("存活士兵数量：" + Soldier.count);// 打印剩余士兵数量
			System.out.println("\n------------------");// 分割线
		}
	}
}
