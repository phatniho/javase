package day1001;

import java.util.Arrays;
import java.util.Random;

public class GuessLetterGame extends GuessGame {
	public String suiJi() {
		// ����ɱ��ַ���StringBuilder
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < 5; i++) {// ����ѭ������ǰ5��Ԫ��
			// ���ȡ����һ��Ԫ�ص�λ��
			int j = i + new Random().nextInt(sb.length() - i);
			char t = sb.charAt(i);// ������ʱ���������ʼԪ��
			sb.setCharAt(i, sb.charAt(j));// ����ʼԪ���޸ĳ����λ��Ԫ��
			sb.setCharAt(j, t);// �����λ��Ԫ���޸�Ϊ����ĳ�ʼԪ��
		}
		sb.delete(5, sb.length());// ������ɺ�ɾ��5�Ժ���ַ�
		return sb.toString();// ��ʣ�µ�ǰ����ַ�ת�����ַ������ظ�����λ��

//		char[] c = new char[26];//����char�������飬����Ϊ26
//		for (int i = 0; i < c.length; i++) {//��������
//			c[i] = (char) (i + 65);//�����д��ĸ�Ķ�Ӧ�����ת��Ϊchar����
//		}
//		for (int j = 0; j < 5; j++) {//����ѭ��ǰ���Ԫ��
//			int c1 = new Random().nextInt(26);//���ȡ�����һ��Ԫ�ص�����
//			char t = c[j];//����Ԫ�ؽ��н���
//			c[j] = c[c1];
//			c[c1] = t;
//		}
//		char[] c1 = Arrays.copyOf(c, 5);//��ԭ����ǰ���Ԫ�ظ��Ƶ�������
//		String s = String.copyValueOf(c1);//��������ת��Ϊ�ַ���
//		return s;//�����ַ���

	}

	public void tiShi() {// �����಻ͬ������д����
		System.out.println("�Ѿ�������5�����ظ��Ĵ�д��ĸ�������5����д��ĸ��ʲô");
	}

	public String biJiao(String r, String c) {// �Ƚ�����ֵ�Ƿ���ͬ
		int a = 0, b = 0;// ���������
		for (int i = 0; i < r.length(); i++) {// ���ѭ������
			for (int j = 0; j < c.length(); j++) {// �ڲ�ѭ������
				if (c.charAt(j) == r.charAt(i)) {// ���αȽ������ַ�����ÿ���ַ�
					if (i == j) {// ����ַ���ͬ���ж��Ƿ�Ϊͬһλ��
						a++;// ���������ȷ������1
					} else {
						b++;// λ�ò����������1
					}
					break;// ��ȵ��ж����ֱ�ӽ�����һѭ��
				}
			}
		}
		return a + "A" + b + "B";// ���رȽϽ�����ӳ��ַ���
	}

	public boolean caiDui(String result) {// �ж��Ƿ�����¶�����
		return result.equals("5A0B");
	}

}