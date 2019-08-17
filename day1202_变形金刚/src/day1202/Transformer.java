package day1202;

/*
 * ���ν���࣬���������������ֻ����һ�������ӿڣ����Է�����ʱ������������
 */
public class Transformer {
	// ����һ�������ӿ�
	private Weapon w;// ˽�������ӿ�

	public void setWeapon(Weapon w) {// �����������
		this.w = w;// ���þ�������
	}

	public void attack() {
		System.out.println("���ν�ս���");
		if (this.w == null) {// �ж��Ƿ�������
			System.out.println("����ҧ��");
			return;
		}
		// ʹ����������콣����
		String t = "";// ��������������
		switch (w.getType()) {// �ж��������ͱ��
		case Weapon.TYPE_COLD:// �����ض����
			t = "�����";// ���������޸�Ϊָ��ֵ
			break;
		case Weapon.TYPE_HOT:
			t = "�ȱ���";
			break;
		case Weapon.TYPE_NUCLEAR:
			t = "������";
			break;
		}
		System.out.println("ʹ��" + t + w.getName() + "����");// �����ӡ���
		w.kill();// ����������������
	}
}
