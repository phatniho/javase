package day12;

public class Transformer {
	Weapon w;

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public void attack() {
		System.out.println("������");
		if (w == null) {
			System.out.println("û���������ɵ��ۣ�");
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
