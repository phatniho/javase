package day0602;

import java.util.Random;

/*
 * 士兵类：
 * 属性：
 * 编号id，
 * 血量blood=100
 * 方法：
 * go();
 * attack();
 */
public class Soldier {// 士兵类
	int id;// 士兵编号
	int blood = 100;// 士兵血量
	Weapon weapon;// 默认武器

	public Soldier() {// 空参
		this.blood = 100;
	}

	public Soldier(int id) {// 单参
		this.id = id;
		this.blood = 100;
	}

	public Soldier(int id, int blood) {// 双参
		this.id = id;
		this.blood = blood;
	}

	public void go() {// 前进方法
		System.out.println(id + "号士兵前进");
	}

	public void attack() {// 攻击方法
		if (this.blood <= 0) {// 判断是否存活
			return;// 若血量小于等于0则代表该士兵已阵亡，不继续执行攻击
		}
		System.out.println(id + "号士兵进攻");// 发起进攻
		if (this.weapon != null) {// 判断是否有武器
			this.weapon.fire();// 有武器则使用武器开火发起进攻
		}
		int d = new Random().nextInt(10);// 模拟受到伤害，产生一个随机的减血量
		if (d > this.blood) {// 判断受到伤害是否大于剩余血量
			d = this.blood;// 若大于则将伤害与剩余血量相等，以免血量出现负数
			this.blood -= d;// 剩余血量与伤害值进行计算
			System.out.println(this.id + "号士兵血量还剩" + this.blood);// 打印信息
			System.out.println(id + "号士兵牺牲了！");// 牺牲信息
			return;// 返回，不继续执行
		}
		this.blood -= d;// 剩余血量与伤害值进行计算
		System.out.println(this.id + "号士兵血量还剩" + this.blood);// 打印信息
	}
}
