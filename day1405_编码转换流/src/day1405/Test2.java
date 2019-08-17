package day1405;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
 * �������ļ����
 * f6   GBK
 * f7	UTF-8
 * 
 * ��Unicode�������е������ַ�������������ļ�
 * \u4e00��\u9fa5��20902������
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		f("d:/abc/f6", "GBK");// �����ݰ�ָ�����ת����洢���ļ���
		f("d:/abc/f7", "UTF-8");
	}

	private static void f(String path, String charset) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(// ���������ת������ָ�����
				new FileOutputStream(path), charset);// �ļ������

		int count = 0;// ���������
		for (int i = '\u4e00'; i <= '\u9fa5'; i++) {// ѭ�����������������ַ�
			osw.write(i);// ѭ��д�����ļ���
			count++;// ����������
			if (count == 30) {// ÿд��30���ַ�
				osw.write("\n");// ��ӻ��б��
				count = 0;// ����������
			}
		}
		osw.close();// �ر������
	}
}
