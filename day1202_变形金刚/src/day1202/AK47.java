package day1202;

public class AK47 implements Weapon {

	@Override
	public void kill() {
		System.out.println("biubiubiu");
	}

	@Override
	public String getName() {
		return "AK47";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_HOT;// 直接调用常量值
	}

}
