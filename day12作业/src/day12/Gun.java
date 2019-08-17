package day12;

public class Gun implements Weapon {

	@Override
	public void kill() {
		System.out.println("biubiubiu");
	}

	@Override
	public String getName() {
		return "ÊÖÇ¹";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_HOT;
	}

}
