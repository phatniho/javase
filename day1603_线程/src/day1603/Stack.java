package day1603;

public class Stack {
	private char[] a = new char[5];// ����̶����ȵ��������������ݣ�
	private int index;// ��������������±��������

	public void push(char c) {// ѹջ����
		if (isFull()) {// �ж��Ƿ����
			return;// ������ֱ�ӷ��أ�������ִ��
		}
		a[index] = c;// ��ָ���ַ���ֵ��������ָ��λ��
		index++;// �Ǳ��һ
	}

	public boolean isFull() {// �ж������Ƿ�����ķ����������ⲿ����
		return index == 5;
	}

	public char pop() {// ��ջ����
		if (isEmpty()) {// �ж������Ƿ�Ϊ��
			return ' ';// �ÿո��ַ���ʾû������
		}
		index--;// �Ǳ��һ
		char c = a[index];// ȡ��ǰ�Ǳ��µ�����
		return c;// ���ص�����λ��
	}

	public boolean isEmpty() {// �ж������Ƿ�Ϊ�յķ����������ⲿ����
		return index == 0;
	}
}
