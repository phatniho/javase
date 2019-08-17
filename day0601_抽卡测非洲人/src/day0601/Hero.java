package day0601;

import java.util.Random;

/*
 * 需求：英雄类
 * 属性：
 * 编号id：
 * 攻击attack：
 * 防御defence：
 * 速度speed：
 * 血量blood：
 * show()
 * level()
 */
public class Hero {
	String name;// 属性列表
	int attack;
	int defence;
	int speed;
	int blood;

	public Hero(String name) {
		this.name = name;
		this.attack = 60 + new Random().nextInt(40);// 随机属性值
		this.defence = 60 + new Random().nextInt(40);
		this.speed = 60 + new Random().nextInt(40);
		this.blood = 60 + new Random().nextInt(40);
	}

	public void show() {// 展示该英雄属性
		int[] a = numa();// 该英雄属性值
		String[] b = numb();// 属性值转换为评分
		numc(a, b);// 各属性值分别评分
		String s = numd(b);// 综合评定稀有度
		System.out.println("英雄属性：");// 输出打印详情
		System.out.println("称号：" + this.name);
		System.out.println("攻击力为：" + a[0]);
		System.out.println("防御力为：" + a[1]);
		System.out.println("速度为：" + a[2]);
		System.out.println("血量为：" + a[3]);
		System.out.println("攻击力评分：" + b[0]);
		System.out.println("防御力评分：" + b[1]);
		System.out.println("速度评分：" + b[2]);
		System.out.println("血量评分：" + b[3]);
		System.out.println(this.name + "是一个" + s + "级别的英雄！");
	}

	public String level() {// 评价该英雄稀有等级
		int[] a = numa();// 该英雄的属性值
		String[] b = numb();// 属性值转换为评分
		numc(a, b);// 各属性值评分
		String s = numd(b);// 综合评定稀有度
		return s;// 返回稀有度
	}

	public String numd(String[] b) {// 根据英雄属性值评分情况，评定该英雄稀有度
		int count = 0;// 定义稀有度指标计数器
		for (int i = 0; i < b.length; i++) {// 循环判断英雄所有属性中优秀的项
			if (b[i].equals("s")) {// 如果是优秀项
				count++;// 指标加1
			}
		}
		String s;// 新建变量，用于保存英雄稀有度字符串
		switch (count) {// 根据优秀项指标计数，评定该英雄稀有度
		case 4:// 全优为最好
			s = "SSS";// 最好表示形式
			break;// 停止继续判断
		case 3:// 三优为上等
			s = "SSR";// 上等表现形式
			break;// 停止继续判断
		case 2:// 双优为中等
			s = "SR";// 中等表现形式
			break;// 停止继续判断
		case 1:// 单优为下等
			s = "R";// 下等表现形式
			break;// 停止继续判断
		default:// 无优为最差
			s = "N";// 最差表现形式
			break;// 停止继续判断
		}
		return s;// 返回稀有度表现形式
	}

	public void numc(int[] a, String[] b) {// 根据英雄属性值修改评分等级
		for (int i = 0; i < a.length; i++) {// 循环判断4种属性
			if (a[i] >= 90) {// 满足条件时
				b[i] = "s";// 将评分修改为对应等级
			} else if (a[i] >= 80) {
				b[i] = "a";
			} else if (a[i] >= 70) {
				b[i] = "b";
			} else if (a[i] >= 60) {
				b[i] = "c";
			}
		}
	}

	public String[] numb() {// 保存英雄属性默认评分
		String[] b = new String[4];// 建立数组保存评分
		String s1 = "d";// 设置默认值
		String s2 = "d";
		String s3 = "d";
		String s4 = "d";
		b[0] = s1;// 将默认值存到数组中
		b[1] = s2;
		b[2] = s3;
		b[3] = s4;
		return b;// 返回给调用者
	}

	public int[] numa() {// 保存该英雄的属性值
		int[] a = new int[4];// 建立数组保存
		a[0] = this.attack;// 保存攻击力
		a[1] = this.defence;// 保存防御力
		a[2] = this.speed;// 保存速度
		a[3] = this.blood;// 保存血量
		return a;// 返回该数组到调用位置
	}
}
