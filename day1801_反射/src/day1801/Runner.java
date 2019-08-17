package day1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ���������������������ļ���ִ�г���
 */
public class Runner {
	private static ArrayList<String> list = new ArrayList<>();// ���弯�ϣ��������������ļ��е��ַ���

	static {
		try {
			BufferedReader in = new BufferedReader(// �ַ�����ȡ�����ж�ȡ
					new InputStreamReader(// �ַ�������ת��
							new FileInputStream("d:/config.txt"), // �ļ�����������ȡ�ļ�
							"GBK"));// ָ�����뷽ʽ
			String line;// �����������һ�ζ�ȡ���ַ���
			while ((line = in.readLine()) != null) {// �ж��Ƿ��ȡ���
				line = line.replaceAll(" ", "");// �����еĿո�ȫ��ɾ��
				if (line.length() == 0) {// �ж��Ƿ�Ϊ����
					continue;// ���������ִ����һ��ѭ��
				}
				list.add(line);// ����ȡ�����ַ�����ӵ�������
			}
			in.close();// �رն�ȡ��
			System.out.println(list);// ��ӡ����
		} catch (Exception e) {
			throw new RuntimeException();// �׳��쳣
		}
	}

	public static void launch() throws Exception {
		for (String s : list) {// ѭ����������
			String[] a = s.split(";");// ��ָ���ַ��п��ַ�������������ͷ��������ַ��������浽����
			Class<?> c = Class.forName(a[0]);// ����0�Ǳ�Ϊ��������ȡ����
			Object obj = c.newInstance();// ִ�пղι��죬��������
			Method m = c.getMethod(a[1]);// ����1�Ǳ�Ϊ����������ȡ����
			m.invoke(obj);// �����������
		}
	}

	public static void main(String[] args) throws Exception {
		Runner.launch();// ִ��������
	}
}
