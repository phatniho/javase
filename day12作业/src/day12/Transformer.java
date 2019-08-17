package day12;

public class Transformer {
	Weapon w;

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public void attack() {
		System.out.println("进攻！");
		if (w == null) {
			System.out.println("没有武器，干瞪眼！");
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
