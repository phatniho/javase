package day0503;

/*
 * ��װ��Ʒ������
 * Item�࣬��Ʒ�Ķ���ģ��
 */
public class Item {
	int id;// ���
	String name;// ����
	double price;// �۸�
	int number;// ����

	public Item() {// �ղ������췽��
	}

	public Item(int id, String name, double price, int number) {// 4�������췽��
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}

	public String toString() {// ��ӡ��Ʒ���鷽��
		return "��ţ�" + id + "�����ƣ�" + name + "���۸�" + price + "��������" + number;
	}
}
