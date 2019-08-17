package day1102;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * ���󣺲���LinkedList˫��·�����Ч��
 * �ص㣺��ɾ�죬��ѯ��
 */
public class Test1 {
	public static void main(String[] args) {
		// add(),get(),remove(),size()
		// ���1000��������
		// [{1},{1},{1},{1}...]
		long t = System.currentTimeMillis();// ��ȡϵͳʱ�䱣�浽������
		LinkedList<Integer> list = new LinkedList();
		for (int i = 0; i < 100000; i++) {// ѭ����������Ԫ��
			list.add(Integer.valueOf(1));// �ɼ�дΪ��list.add(1);//�Զ�װ��
		}
		System.out.println(System.currentTimeMillis() - t);// ��ӡϵͳʱ���
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		System.out.println(list.getFirst());// ��ȡ��һ��Ԫ��
		System.out.println(list.getLast());// ��ȡ���һ��Ԫ��
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		System.out.println(list.get(list.size() / 2));// ��ȡ�����м��Ԫ��
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {// ѭ��������Ч�ʵ�
			list.get(i);// ������ȡԪ��
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n--------------");
		t = System.currentTimeMillis();
		Iterator<Integer> it = list.iterator();// ʹ�õ��������в��ң�Ч�ʸ�
		while (it.hasNext()) {// �ж��Ƿ�����һ��
			it.next();// ȡ����һ��Ԫ��
		}
		System.out.println(System.currentTimeMillis() - t);
	}
}
