package day1502;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/*
 * �����򼯺���������������ַ������������򷽷���������
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// �½�����
		Collections.addAll(list, // ���Ϲ��ߣ����Ԫ�ص�������
				"2019-4-22", "2019-4-2", "2019-4-21", //
				"2019-4-23", "2019-4-30", "2019-4-10", //
				"2019-4-1", "2019-4-12", "2019-4-11", //
				"2019-4-3", "2019-4-13", "2019-4-24");//
		System.out.println(list);// ��ӡ����
		Collections.sort(list);// ���Ϲ��ߣ�����
		System.out.println(list);// ��ӡ����

		// sort()����������ʹ��һ���ӿڣ�����һ���Ƚ�������
		// sort(list,�Ƚ���)
		// sort()������������������У������ݱȴ�Сʱ�����ñȽ������Ƚ�

		Collections.sort(list, new Comparator<String>() {// �������򷽷�����ָ���Ƚ�������
			// o1��o2�ȴ�С
			// o1�󣬷���������o1С�����ظ�������ͬ����0

			// ��д���෽�����쳣�ܵ����ܱȸ����
			public int compare(String o1, String o2) {// �Ƚ�������
				// ���ڸ�ʽ���࣬���Խ�ʱ�䰴ָ����ʽת��Ϊ����
				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
				try {// �쳣��׽
					Date a = f.parse(o1);// �½����ڶ���ת������ĵ�һ������
					Date b = f.parse(o2);// �½����ڶ���ת������ĵڶ�������
					return a.compareTo(b);// �Ƚ���������
				} catch (Exception e) {// �쳣����
					throw new IllegalArgumentException(e);// ��װ�����׳�������
				}
			}
		});// ���Ϲ��ߣ�����
		System.out.println(list);// ��ӡ����
	}
}
