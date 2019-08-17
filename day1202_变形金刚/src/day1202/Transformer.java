package day1202;

/*
 * 变形金刚类，不定义具体武器，只给出一个武器接口，可以方便随时更换其他武器
 */
public class Transformer {
	// 包含一个武器接口
	private Weapon w;// 私有武器接口

	public void setWeapon(Weapon w) {// 传入具体武器
		this.w = w;// 设置具体武器
	}

	public void attack() {
		System.out.println("变形金刚进攻");
		if (this.w == null) {// 判断是否有武器
			System.out.println("用牙咬！");
			return;
		}
		// 使用冷兵器倚天剑进攻
		String t = "";// 定义武器名变量
		switch (w.getType()) {// 判断武器类型编号
		case Weapon.TYPE_COLD:// 符合特定编号
			t = "冷兵器";// 将武器名修改为指定值
			break;
		case Weapon.TYPE_HOT:
			t = "热兵器";
			break;
		case Weapon.TYPE_NUCLEAR:
			t = "核武器";
			break;
		}
		System.out.println("使用" + t + w.getName() + "进攻");// 输出打印结果
		w.kill();// 调用武器攻击方法
	}
}
