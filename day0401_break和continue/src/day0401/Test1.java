package day0401;

/*
 * ����break��continue
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--------------");
		f1();
		System.out.println("\n--------------");
		f2();
	}

	private static void f1() {
//		double d = Math.random();// ���������[0,1) alt+shift+L  ��ȡ�����
//		System.out.println(d);
		for (int i = 1;; i++) {//��������ѭ��
			double d = Math.random();//����һ��[0,1)�����������
			if (d > 0.999) {//�жϲ��������Ƿ���������
				System.out.println("��" + i + "��:" + d);//��������������ӡ���
				break;//����ѭ��
			}
		}
	}

	private static void f2() {
		for (int i = 1; i <= 100; i++) {//����ѭ��
			int x = i % 10;//���������ȡ��λ��
			if (x == 3 || x == 5 || x == 7) {//�ж��Ƿ���������
				continue;//�����򲻼�������ִ�У�����ѭ��ִ��
			}
			System.out.println(i);//�����ӡ���
		}
	}
}
