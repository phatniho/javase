package day0601;

import java.util.Random;

/*
 * 士兵类：
 * 属性：
 * 编号id，
 * 血量blood=100
 * 方法：
 * go()
 * attack()
 */
public class Soldier {
	int id;// 编号
	int blood = 100;// 默认初始化血量

	public Soldier() {// 空参构造函数
		this.blood = 100;// 初始化血量
	}

	public Soldier(int id) {// 单参构造函数
		this.id = id;// 设置编号值
		this.blood = 100;// 默认血量
	}

	public Soldier(int id, int blood) {// 双参构造函数
		this.id = id;// 设置编号值
		this.blood = blood;// 设置血量值
	}

	public void go() {// 进攻方法
		System.out.println(id + "号士兵前进");
	}

	public void attack() {// 攻击方法
		if (this.blood == 0) {// 判断该士兵血量是否为0
			System.out.println(id + "号士兵已经阵亡了！");// 血量为0则表示阵亡
			return;// 结束方法
		}
		System.out.println(id + "号士兵进攻");// 发起进攻
		int d = new Random().nextInt(10);// 模拟受到伤害，产生一个随机的减血量
		this.blood -= d;// 血量减少计算
		if (this.blood <= 0) {// 判断血量是否为正数
			this.blood = 0;// 若血量不为正数，则将血量设置为0
			System.out.println(id + "号士兵牺牲了！");// 表示该士兵已阵亡
		}
	}
}
