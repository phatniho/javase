package day12;

public class Nuclear implements Weapon {

	@Override
	public void kill() {
		System.out.println("duang");
	}

	@Override
	public String getName() {
		return "�˵�ͷ";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_NUCLEAR;
	}

}
