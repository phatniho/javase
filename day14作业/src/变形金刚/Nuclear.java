package ���ν��;

public class Nuclear extends Weapon {

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
