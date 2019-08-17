package day1202;

public class Lyb implements Weapon {

	@Override
	public void kill() {
		System.out.println("BigBang");
	}

	@Override
	public String getName() {
		return "狼牙棒";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_NUCLEAR;// 直接调用常量值
	}

}
