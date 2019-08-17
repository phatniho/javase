package 变形金刚;

public class Sword extends Weapon {

	@Override
	public void kill() {
		System.out.println("戳一下");
	}

	@Override
	public String getName() {
		return "砍柴刀";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_COLD;
	}

}
