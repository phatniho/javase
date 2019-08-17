package chickendinner;

import java.util.Random;

/*
 * 武器类
 * name
 * bullets
 * fire()
 * reload()
 */
public class Weapon {
	private String name;// 私有成员变量，保证安全
	private int bullets = 100;// 私有成员变量，初始化值为100

	public Weapon() {// 空参
		this.name = "手枪";
		this.bullets = 100;
	}

	public Weapon(String name) {// 单参
		this.name = name;
		this.bullets = 100;
	}

	public Weapon(String name, int bullets) {// 双参
		this.name = name;
		this.bullets = bullets;
	}

	public String getName() {// 获取私有值的方法
		return name;// 返回值给调用者
	}

	public void setName(String name) {// 设置私有值的方法
		this.name = name;// 设置私有值
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

	public void fire() {// 开火方法
		if (this.bullets == 0) {// 判断自否还有子弹
			reload();// 如果没有子弹就调用装弹
		}
		System.out.println("开火！");// 开火提示
		int i = 3 + new Random().nextInt(10);// 随机打出子弹数量
		if (i > this.bullets) {// 判断随机打出子弹是否大于剩余子弹
			i = this.bullets;// 如果大于则将随机子弹数量设置为剩余子弹数量
		}
		this.bullets -= i;// 剩余子弹与随机打出子弹数量相减
		for (int j = 0; j < i; j++) {// 循环提示打出子弹音效
			System.out.print("哒");// 行内不换行
		}
		System.out.println("~");// 行尾换行
		System.out.println(this.name + "剩余子弹数：" + this.bullets);// 提示信息
	}

	private void reload() {// 重新装弹方法
		this.bullets = 100;// 调用此方法时将子弹数量设置为100
	}
}
