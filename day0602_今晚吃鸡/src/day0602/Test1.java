package day0602;

/*
 * 需求：新建两个士兵对象
 * 调用士兵对象中的前进方法
 * 调用士兵对象中的攻击方法
 */
public class Test1 {
	public static void main(String[] args) {
		Soldier s1 = new Soldier(9527, 100);// 根据指定属性新建士兵对象
		Soldier s2 = new Soldier(9528, 100);

		s1.go();// 指定士兵对象前进
		s2.go();
		int count = 1;// 定义攻击次数计数器
		for (int i = 0;; i++) {// 循环攻击
			if (s2.blood == 0) {// 判断是否存活
				break;// 若阵亡则结束循环
			}
			s2.attack();// 循环攻击
			count++;// 计数器加1
		}
		System.out.println(s2.id + "号士兵发动了" + count + "次进攻");// 打印结果
	}
}
