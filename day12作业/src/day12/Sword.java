package day12;

public class Sword implements Weapon {

	@Override
	public void kill() {
		System.out.println("´ÁÒ»ÏÂ");
	}

	@Override
	public String getName() {
		return "¿³²ñµ¶";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_COLD;
	}

}
