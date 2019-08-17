package 变形金刚;

public class Transformer {
	private Weapon w;

	public void setWeapon(Weapon w) {
		this.w = w;
	}

	public void attack() {
		System.out.println("变形金刚进攻");
		if (w == null) {
			System.out.println("没有武器，拳头最大");
			return;
		}
		String s = "";
		switch (w.getType()) {
		case Weapon.TYPE_COLD:
			s = "冷兵器";
			break;
		case Weapon.TYPE_HOT:
			s = "热兵器";
			break;
		case Weapon.TYPE_NUCLEAR:
			s = "核武器";
			break;
		}
		System.out.println("使用" + s + w.getName() + "进攻");
		w.kill();
	}
}
