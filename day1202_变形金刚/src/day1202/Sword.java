package day1202;

public class Sword implements Weapon {

	@Override
	public void kill() {
		System.out.println("��һ��");
	}

	@Override
	public String getName() {
		return "���콣";
	}

	@Override
	public int getType() {
		return Weapon.TYPE_COLD;// ֱ�ӵ��ó���ֵ
	}

}
