package day0602;

import java.util.Random;

/*
 * 武器类
 * name
 * bullets
 * fire()
 * reload()
 */
public class Weapon {
	String name;// 武器名称
	int bullets = 100;// 默认子弹数量

	public Weapon() {// 空参
		this.name = "手枪";
		this.bullets = 100;
	}

	public Weapon(String name) {// 单参
		this(name, 100);
	}

	public Weapon(String name, int bullets) {// 双参
		this.name = name;
		this.bullets = bullets;
	}

	public void fire() {// 开火方法
		if (this.bullets == 0) {// 判断子弹是否打空
			reload();// 打空则重新装弹
		}
		System.out.println(this.name + "开火");// 开火提示
		int a = 3 + new Random().nextInt(10);// 随机数字开火
		if (a > this.bullets) {// 判断开火数量是否大于剩余子弹数量
			a = this.bullets;// 若大于则将剩余子弹打光
		}
		this.bullets -= a;// 剩余子弹进行开火计算
		for (int i = 0; i < a; i++) {// 循环打印开火音效
			System.out.print("哒");// 开火音效，行内不换行
		}
		System.out.println("~");// 行尾换行
		System.out.println(this.name + "剩余子弹：" + this.bullets);// 提示子弹数量
	}

	public void reload() {// 重新装弹方法
		System.out.println(this.name + "重新装弹！");// 提示语句
		this.bullets = 100;// 装入指定数量的子弹
	}
}
