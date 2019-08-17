package day1501;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * ��������ָ���ļ��У���ջ�ķ�ʽ�����ļ���������ͼƬ�ļ�
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("�����ļ��У�");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);// ����������ļ��д����ļ�����
		if (!dir.isDirectory()) {// �ж��Ƿ�����Ч�ļ���
			System.out.println("��������ȷ���ļ���");
			return;
		}
		List<File> list = f(dir);// ���÷������ҷ���Ҫ����ļ��������ص��б���
		for (File f : list) {// �����б�
			System.out.println(f.getAbsolutePath());// ��ӡ�ļ�·��
		}
	}

	private static List<File> f(File dir) {// �����ļ�����
		ArrayList<File> pic = new ArrayList<>();// �½����鼯��
		LinkedList<File> stack = new LinkedList<>();// �½�������
		stack.push(dir);// �����Ͻ��ļ���ѹ��ջ��
		while (!stack.isEmpty()) {// �ж��Ƿ�Ϊ��
			File f = stack.pop();// ��Ϊ���򽫵�ջ
			if (f.isFile()) {// �ж��Ƿ�Ϊ�ļ�
//				if (isPic(f)) {
				pic.add(f);// ���ӵ�������
//				}
			} else {

				FileFilter filter = new FileFilter() {// �ļ�������
					public boolean accept(File f) {// ��д����
						if (f.isDirectory()) {// �ж��Ƿ�Ϊ�ļ���
							return true;// �����ļ���
						}
						// Ҳ����ͼƬ�ļ�
						String n = f.getName().toLowerCase();// �����ָ�ΪСд
						// �ж��Ƿ�Ϊ����Ҫ����ļ���ʽ
						return n.matches(".+\\.(jpg|png|gif|bmp)");
					}
				};
				File[] list = f.listFiles(filter);// �б�����
				if (list == null) {// �ж��Ƿ�Ϊ��
					continue;// ���Ϊ���������һ��ѭ��
				}
				for (File f2 : list) {// ѭ������
					stack.push(f2);// ������Ҫ����ļ�ѹ��������
				}
			}
		}
		return pic;// ��������
	}

	private static boolean isPic(File f) {// �ж��Ƿ�ΪͼƬ�ķ���
		String n = f.getName().toLowerCase();// �����ָ�ΪСд
		// �ж��Ƿ�Ϊ����Ҫ����ļ���ʽ
		return n.matches(".+\\.(jpg|png|gif|bmp)");
	}
}
