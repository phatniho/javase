package day0903;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * ��ȷ����������
 * BigDecimal
 * ���÷�����
 * add()�ӷ�
 * subtract()����
 * multiply()�˷�
 * divide()����
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		System.out.println(a + b);// ������������׳��ֲ���ȷ
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		System.out.println("------------");
		BigDecimal a1 = BigDecimal.valueOf(a);// ��ȷ���㣬������ʽ
		BigDecimal a2 = BigDecimal.valueOf(a);

		BigDecimal a3;
		a3 = a1.add(a2);// �ӷ�
		System.out.println(a3.doubleValue());
		a3 = a1.subtract(a2);// ����
		System.out.println(a3.doubleValue());
		a3 = a1.multiply(a2);// �˷�
		System.out.println(a3.doubleValue());
		a3 = a1.divide(a2, 50, BigDecimal.ROUND_HALF_UP);// ������ȡ50λС������������
		System.out.println(a3.doubleValue());// ȡdoubleֵ��Χ�Ľ��
		System.out.println(a3.toString());// ��ӡȫ��50λС�����
	}
}
