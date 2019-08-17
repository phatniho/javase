package day1602;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * ���󣺶�ȡ�ļ��е�ѧ�����������ȡһ��ѧ���н���
 * ���н�����ͳ�Ƽ�һ������ֵ����������ٱ��浽�ļ���
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		// ��ȡ�����ļ�����
		List<Student> list = load();
		// �������list�е�һ��ѧ��ʵ��
		Student s = chouJiang(list);
		s.setCount(s.getCount() + 1);
		// ���б����ݣ����´浽�ļ�
		save(list);
		System.out.println("��ϲ" + s.getName() + "�д󽱣��н�������" + s.getCount());
	}

	private static List<Student> load() throws Exception {
		ArrayList<Student> list = new ArrayList<Student>();// ׼������
		BufferedReader in = new BufferedReader(// ���д��ļ���ȡ���ڴ�
				new InputStreamReader(// ����ת��
						new FileInputStream("d:/stu.txt"), // �ļ����ݶ�ȡ
						"GBK"));// ָ������
		String line;// ������������ȡ��������
		while ((line = in.readLine()) != null) {// �ж��Ƿ��ȡ���
			line = line.replaceAll("\\s+", "");// �滻���հ��ַ�
			if (line.length() == 0) {// �ж��Ƿ��ȡ������
				continue;// ��ǰ��δ��ȡ�������������ȡ��һ��
			}
			String[] a = line.split(";");// ��ָ�����ŷָ
			Student s = new Student();// �½�ѧ������
			s.setName(a[0]);// �����ݱ��浽ѧ������
			s.setCount(Integer.parseInt(a[1]));// ������ת���󱣴浽ѧ������
			list.add(s);// ��������뵽�����б���
		}
		in.close();// �ر���
		System.out.println(list);// ��ӡ����
		return list;// ���ؼ��ϵ�����λ��
	}

	private static Student chouJiang(List<Student> list) {
		// ��list������ָ���Ƚ���
		Collections.sort(list, new Comparator<Student>() {
			// �ȽϷ���
			public int compare(Student o1, Student o2) {
				// ���رȽϽ��
				return o1.getCount() - o2.getCount();
			}
		});
		// [0,list.size()/2)
		int mid = list.size() / 2;// ��λ�м�λ��
		int j;// �����������Ǳ�
		if (Math.random() < 0.7) {// ���弸��
			j = new Random().nextInt(mid);// ȷ������Ǳ�
		} else {
			j = mid + new Random().nextInt(list.size() - mid);// ȷ������Ǳ�
		}
		return list.get(j);// ��������Ǳ��Ӧ�Ķ���
	}

	private static void save(List<Student> list) throws Exception {
		PrintWriter out = new PrintWriter(// ���д��ڴ�д���ļ�
				new OutputStreamWriter(// ����ת��
						new FileOutputStream("d:/stu.txt"), // д��Ŀ���ļ�
						"GBK"));// ָ������
		for (Student s : list) {// ѭ������
			out.println(s);// ����д���ļ�
		}
		out.close();// �ر���
	}
}
