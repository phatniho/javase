package 变形金刚;

public class Nuclear extends Weapon {

	@Override
	public void kill() {
		System.out.println("duang");
	}

	@Override
	public String getName() {
		return "核弹头";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_NUCLEAR;
	}

}
