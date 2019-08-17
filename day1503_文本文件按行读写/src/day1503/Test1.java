package day1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*
 * ����������ȡ�ļ��е����ݣ������������д���ļ���
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		// ��ȡf8�ļ������������ַ������뼯��
		List<String> list = f1();

		// ��list�е������ַ�������
		f2(list);

		// ���浽f9�ļ�
		f3(list);

	}

	private static List<String> f1() throws Exception {
		BufferedReader in = new BufferedReader(// ���ж�ȡ
				new InputStreamReader(// �������ת��
						new FileInputStream("d:/abc/f8")// ��ȡ�ļ�
						, "GBK"));// ָ������

		ArrayList<String> list = new ArrayList<>();// ���弯��

		String line = null;// ������ʱ���������ȡ��������
		while ((line = in.readLine()) != null) {// �ж��Ƿ��ж�ȡ������
			// trim��ȥ�����˿հ��ַ�
			String s = line.trim();
			if (s.length() == 0) {// �ж��Ƿ�Ϊ�մ�
				continue;// ����ǿմ��ͼ�������һ��
			}
			list.add(s);// ѭ��д��
		}
		in.close();// �ر���
		System.out.println(list);// ��ӡ����
		return list;// ���ؼ���
	}

	private static void f2(List<String> list) {
		// ���ü������򹤾ߣ������б����Լ������ڲ���Ƚ���
		Collections.sort(list, new Comparator<String>() {

			// ��д�Ƚ����еķ���
			public int compare(String o1, String o2) {// ���������ַ������бȽ�
				// ת�����ڸ�ʽ
				SimpleDateFormat f = new SimpleDateFormat("yyyy��MM��dd");
				try {// �쳣��׽����
					Date a = f.parse(o1);// ��һ���ַ���ת��Ϊ���ڸ�ʽ
					Date b = f.parse(o2);// �ڶ����ַ���ת��Ϊ���ڸ�ʽ
					return a.compareTo(b);// �������ڸ�ʽ���бȽ�
				} catch (ParseException e) {// �쳣�׳�
					throw new IllegalArgumentException(e);// ��װ�쳣�׳�
				}
			}
		});
	}

	private static void f3(List<String> list) throws Exception {
		PrintWriter out = new PrintWriter(// ����д���ļ���
				new OutputStreamWriter(// �������ת��
						new FileOutputStream("d:/abc/f9"), // д�����ļ���
						"GBK"));// ָ������
		for (String s : list) {// ѭ������
			out.println(s);// ����д���ļ�
		}
		out.close();// �ر���
	}
}
