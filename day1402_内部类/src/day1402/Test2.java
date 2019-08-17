package day1402;

/*
 * ���󣺾ֲ��ڲ���������ڲ���
 */
public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = f1();// ���÷��������ӿڶ���
		w1.kill();// �ӿڶ�����÷���
		System.out.println(w1);
		System.out.println("---------");
		Weapon w2 = f2("���콣");// ���÷�������ָ�����������ӿڶ���
		w2.kill();// �ӿڶ�����÷���
		System.out.println(w2);
	}

	private static Weapon f2(final String name) {
		// �ֲ��ڲ����У�ʹ������ľֲ������������final��jdk1.8�Ժ����ȱʡ
		Weapon w = new Weapon() {// �����ڲ���
			public void kill() {// ��дʵ�ֽӿڷ���
				System.out.println("ʹ��" + name + "������");
			}
		};
		return w;
	}

	private static Weapon f1() {
		// �ֲ��ڲ���
		class AK47 implements Weapon {// ʵ�ֽӿ�
			public void kill() {// ��дʵ�ֽӿڷ���
				System.out.println("ʹ��AK47����");
			}
		}
		AK47 a = new AK47();// �½��ڲ������
		return a;
	}
}
