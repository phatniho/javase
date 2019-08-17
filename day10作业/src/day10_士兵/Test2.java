package day10_士兵;

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
		System.out.println("士兵数量：");
		int n = new Scanner(System.in).nextInt();
		Soldier[] a = new Soldier[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Soldier();
			a[i].id = i + 1;
		}
		System.out.println("按回车执行");
		while (Soldier.count != 0) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < a.length; i++) {
				if (a[i].blood != 0) {
					a[i].attack();
				}
			}
			System.out.println("存活士兵数量：" + Soldier.count);
			System.out.println("\n------------------");
		}
	}
}
