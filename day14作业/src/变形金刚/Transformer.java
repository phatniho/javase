package ���ν��;

public class Transformer {
	private Weapon w;

	public void setWeapon(Weapon w) {
		this.w = w;
	}

	public void attack() {
		System.out.println("���ν�ս���");
		if (w == null) {
			System.out.println("û��������ȭͷ���");
			return;
		}
		String s = "";
		switch (w.getType()) {
		case Weapon.TYPE_COLD:
			s = "�����";
			break;
		case Weapon.TYPE_HOT:
			s = "�ȱ���";
			break;
		case Weapon.TYPE_NUCLEAR:
			s = "������";
			break;
		}
		System.out.println("ʹ��" + s + w.getName() + "����");
		w.kill();
	}
}
