package day1104;

import java.util.HashMap;

/*
 * HashMap��ϰ
 */
public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(9527, "�Ʋ���");
		map.put(9528, "������");
		map.put(9529, "ף֦ɽ");
		map.put(9530, "����");
		map.put(9531, "Сǿ");
		map.put(9532, "ʯ���");
		map.put(9533, "����");
		map.put(9533, "�绨");// ��ֵ�滻��ֵ
		map.put(9534, null);
		map.put(null, "---");
		System.out.println(map.size());// 9
		System.out.println(map);
		System.out.println(map.get(9527));// ��ȡ��Ӧֵ
		System.out.println(map.get(9999));// û�ж�Ӧֵʱ����null
		System.out.println(map.get(9533));// ֻ��ʾ��ֵ
		System.out.println(map.remove(9531));// ���ر�ɾ����ֵ
		System.out.println(map);
	}
}
