package 变形金刚;

public class Gun extends Weapon {

	@Override
	public void kill() {
		System.out.println("biubiubiu");
	}

	@Override
	public String getName() {
		return "左轮手枪";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_HOT;
	}

}
