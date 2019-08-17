package day0803;

/*
 * ����StringBuilder��
 * append()׷��
 * delete(start,end)[,)
 * deleteCharAt(i)ɾ��ָ��λ�õĵ����ַ�
 * insert(i,����)��ָ��λ�ò���
 * setCharAt(i,�ַ�)�滻ָ��λ�õĵ����ַ�
 * replace(start,end,����)�滻ָ����Χ������
 * 
 * Stringbuffer �̰߳�ȫ��Ч�ʵ�
 * Stringbuilder �̲߳���ȫ��Ч�ʸ�
 */
public class Test1 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		long t = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {// �������ַ������ӣ�Ч�ʸߣ���Ҫע����ڴ����
			sb.append(s0);
		}
		t = System.currentTimeMillis() - t;
		System.out.println(t);
	}
}
