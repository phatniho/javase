package day1202;

public class Lyb implements Weapon {

	@Override
	public void kill() {
		System.out.println("BigBang");
	}

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_NUCLEAR;// ֱ�ӵ��ó���ֵ
	}

}
