package day12;

public class Sword implements Weapon {

	@Override
	public void kill() {
		System.out.println("��һ��");
	}

	@Override
	public String getName() {
		return "����";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_COLD;
	}

}
