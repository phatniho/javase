package �ļ����ܸ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("����ԭ�ļ���");
			String f = new Scanner(System.in).nextLine();
			File from = new File(f);
			if (!from.isFile()) {
				System.out.println("����һ����Ч�ļ������������룡");
				continue;
			}
			System.out.println("����Ŀ���ļ���");
			String t = new Scanner(System.in).nextLine();
			File to = new File(t);
			if (to.isDirectory()) {
				System.out.println("Ŀ�������һ���ļ�������������");
				continue;
			}
			System.out.println("�������루0-255����");
			try {
				int pw = new Scanner(System.in).nextInt();
				if (pw > 255 || pw < 0) {
					System.out.println("���벻����Ч��Χ�ڣ�����������");
					continue;
				}
				copy(from, to, pw);
				System.out.println("�Ƿ������y/n");
				String y = new Scanner(System.in).nextLine();
				if (y.equals("y")) {
					continue;
				} else if (y.equals("n")) {
					break;
				} else {
					System.out.println("��������������ѡ��");
					continue;
				}
			} catch (Exception e) {
				System.out.println("���������������������");
				continue;
			}
		}
	}

	private static void copy(File from, File to, int pw) throws Exception {
		FileInputStream fis = new FileInputStream(from);
		FileOutputStream fos = new FileOutputStream(to);
		byte[] b = new byte[8 * 1024];
		int n;
		while ((n = fis.read(b)) != -1) {
			for (int j = 0; j < b.length; j++) {
				b[j] ^= pw;
			}
			fos.write(b, 0, n);
		}
		fis.close();
		fos.close();
	}
}
