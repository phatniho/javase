package day1303;

import java.io.FileInputStream;

/*
 * ���󣺽����ļ�����������Ӳ����ָ��λ���ļ������ݶ��뵽�ڴ���
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		// �����������뵽�ڴ���
		FileInputStream fis = new FileInputStream("d:/abc/f2");

		// ��׼ѭ����ȡ��ʽ
		int b;// �ȶ���һ������
		// ѭ��������ȡ��Ƕ��С�����ж϶������Ƿ�Ϊ-1
		while ((b = fis.read()) != -1) {// �����ȡ
			System.out.println(b);// ѭ����ӡ
		}
		fis.close();// �ر���

//		�Լ�д��˼·
//		int s ;//����һ������
//		while (true) {//��ѭ����ȡ
//			s = fis.read();//��ȡһ���ֽ�ת��Ϊint����
//			if (s == -1) {//�ж��Ƿ��ȡ����
//				break;//����ѭ��
//			}
//			System.out.println(s);//ѭ����ӡ��ȡ����ֵ
//		}
//		fis.close();
	}
}
