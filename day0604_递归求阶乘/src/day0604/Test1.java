package day0604;

/*
 * ���󣺷����ݹ�
 * �õݹ鷽����׳�
 */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������׳ˣ�");// ��ʾ��Ϣ
		int i = new Scanner(System.in).nextInt();// ��ȡ�������
		long l = f(i);// ���뵽����������������������浽������
		System.out.println(l);// ��ӡ����
	}

	private static long f(int i) {// ��ֵ̫������ջ�ڴ����
		if (i == 0) {// �������
			return 1;// �����������ǰ����
		}
		return i * f(i - 1);// �ݹ����
	}
}
