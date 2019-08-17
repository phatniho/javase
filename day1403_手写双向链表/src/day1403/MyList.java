package day1403;

/*
 * 
 */
public class MyList {
	// ��β�ڵ�
	private Node first;// null
	private Node last;// null
	private int size;// ���ݵ�������Ĭ��0

	public void add(Object value) {
		// �����ӵ��ǵ�һ���ڵ�
		// ��ӵ�һ��
		Node n = new Node();
		n.value = value;// Ϊ������ֵ
		if (size == 0) {// ���û������
			// ������ǰ������Ϊ�Լ�
			n.prev = n;
			n.next = n;
			// ������ڵ�����Ϊ������ǰ�����
			first = n;
			last = n;
		} else {
			// ��β���¼�����
			n.prev = last;// ��β�����ø�ֵ������Ԫ�ص���ǰ����
			last.next = n;// ��n��ֵ��Ϊβ����������
			n.next = first;// ��ͷ�����ø�ֵ������Ԫ�ص��������
			first.prev = n;// ��n��ֵ��Ϊͷ����ǰ������
			last = n;// ��n��Ϊ�µ�β��ֵ
		}
		size++;// �����ɺ�����������
	}

	public Object get(int i) {
		// Խ��
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("" + i);// �׳��Ǳ�Խ���쳣
		}
		// ����iλ�õĽڵ����
		Node n = getNode(i);
		// ���ؽڵ��з�װ������
		return n.value;
	}

	private Node getNode(int i) {
		if (i == 0) {// ����ҵ��ǵ�һ��λ��
			return first;// ֱ�ӷ�����λ�õ�ֵ
		} else if (i == size - 1) {// ����ҵ���ĩβλ��
			return last;// ֱ�ӷ���βλ�õ�ֵ
		}
		// �����м�λ�õ��±�
		// �ж�Ҫ�ҵ�ֵ���м�Ǳ�Ĵ�С��ϵ��С�����ǰ���󣬴�����Ӻ���ǰ
		if (i < size >> 1) {
			Node n = first;// ��ǰ������
			// ���±�1���±�i
			for (int j = 1; j <= i; j++) {// ѭ�����������Ϊ�ڶ���λ�ã�һֱ�ҵ�iλ��
				n = n.next;// ѭ��������
			}
			return n;// ���ؽ��
		} else {
			Node n = last;// �Ӻ���ǰ��
			for (int j = size - 2; j >= i; j--) {// ѭ�����������Ϊ�����ڶ�λ��
				n = n.prev;// ѭ����ǰ��
			}
			return n;// ���ؽ��
		}
	}

	public int size() {
		return size;
	}

	// �ڲ��࣬����˫��������װ�ֲ������ݣ������ֵ��ǰ�������
	private class Node {
		Node prev;// ��ǰ����
		Node next;// �������
		Object value;// ֵ
	}
}
