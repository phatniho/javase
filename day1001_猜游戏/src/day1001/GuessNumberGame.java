package day1001;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	public String suiJi() {
		int i = 1 + new Random().nextInt(1000);// �������ֵ
		return Integer.toString(i);// ת��ΪString
	}

	public void tiShi() {// ���ݲ�ͬ����������ʾ
		System.out.println("�Ѿ�������һ��[1,1001)��Χ�����������������Ǽ�");
	}

	public String biJiao(String r, String c) {// �Ƚ�����ֵ�Ƿ���ͬ
		int i = Integer.parseInt(r);// �����ɵ�ֵת����������
		int j = Integer.parseInt(c);// �������ֵת��Ϊ��������
		if (i > j) {// �Ƚϴ�С
			return "С";// ��ʾ
		} else if (i < j) {
			return "��";
		} else {
			return "��";
		}
	}

	public boolean caiDui(String result) {// �ж��Ƿ�¶�
		return result.equals("��");
	}

}
