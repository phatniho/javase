package day07��ҵ_ð������;

/*
 * ����ð������
 */
import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = add();// ͨ�������½�����

		System.out.println(Arrays.toString(a));// ��ӡ����ǰ������
		System.out.println("-------");

		sort(a);// �������򷽷�

		System.out.println("-------");
		System.out.println(Arrays.toString(a));// ��ӡ����������
	}

	private static void sort(int[] a) {// ���򷽷�
		for (int i = 0; i < a.length; i++) {// ��Ȧѭ������ǰ����
			boolean b = false;// �������
			for (int j = a.length - 1; j > i; j--) {// ��Ȧѭ�����Ӻ�ǰ�Ƚ�
				if (a[j] < a[j - 1]) {// �Ƚ��������ڵ�ֵ
					int t = a[j];// ִ�н���
					a[j] = a[j - 1];
					a[j - 1] = t;
					b = true;// ������ɺ��޸Ľ������
				}
			}
			if (!b) {// �������û�н��н�������˵����������ɣ�����ѭ��
				break;
			}
			System.out.println(Arrays.toString(a));// ��ӡ�������
		}
	}

	private static int[] add() {
		int i = 5 + new Random().nextInt(5);
		int[] a = new int[i];
		for (int j = 0; j < a.length; j++) {
			a[j] = new Random().nextInt(100);
		}
		return a;
	}
}
