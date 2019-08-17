package day1104;

import java.util.HashMap;

/*
 * HashMap练习
 */
public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(9527, "唐伯虎");
		map.put(9528, "华夫人");
		map.put(9529, "祝枝山");
		map.put(9530, "旺财");
		map.put(9531, "小强");
		map.put(9532, "石榴姐");
		map.put(9533, "秋香");
		map.put(9533, "如花");// 新值替换旧值
		map.put(9534, null);
		map.put(null, "---");
		System.out.println(map.size());// 9
		System.out.println(map);
		System.out.println(map.get(9527));// 获取对应值
		System.out.println(map.get(9999));// 没有对应值时返回null
		System.out.println(map.get(9533));// 只显示新值
		System.out.println(map.remove(9531));// 返回被删除的值
		System.out.println(map);
	}
}
