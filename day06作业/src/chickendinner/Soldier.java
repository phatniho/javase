package chickendinner;

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
public class Soldier {
	private int id;// 私有成员变量，保证安全性
	private int blood = 100;// 设定默认值
	Weapon weapon;

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

	public Soldier(int id, int blood, Weapon weapon) {// 三参
		this.id = id;
		this.blood = blood;
		this.weapon = weapon;
	}

	public int getId() {// 调用方法获取私有值
		return id;
	}

	public void setId(int id) {// 调用方法设定私有值
		this.id = id;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public void attack() {// 攻击方法
		if (this.blood <= 0) {// 判断是否存活
			return;// 如果阵亡则不继续攻击
		}
		System.out.println(this.id + "号士兵发起进攻！");
		if (this.weapon != null) {// 判断是否有武器
			this.weapon.fire();// 如果有武器则使用武器开火
		}
		int i = new Random().nextInt(10);// 随机伤害值
		if (i > this.blood) {// 判断是否大于自身剩余血量
			i = this.blood;// 如果大于则将伤害值与剩余血量相等
			this.blood -= i;// 剩余血量与伤害值相减
			// 提示信息
			System.out.println(this.id + "号士兵受到了" + i + "点伤害，剩余血量：" + this.blood);
			System.out.println(this.id + "号士兵牺牲了！");
			return;// 停止继续执行
		}
		this.blood -= i;// 剩余血量与伤害值相减
		System.out.println(this.id + "号士兵受到了" + i + "点伤害，剩余血量：" + this.blood);
	}

	public void go() {// 加入战场
		System.out.println(this.id + "号士兵进入战场！");
	}
}
