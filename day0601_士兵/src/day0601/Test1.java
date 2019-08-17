package day0601;

/*
 * 需求：新建两个士兵对象
 * 调用士兵对象中的前进方法
 * 调用士兵对象中的攻击方法
 */
public class Test1 {
	public static void main(String[] args) {
		Soldier s1 = new Soldier(9527, 100);// 输入指定值来创建对象
		Soldier s2 = new Soldier(9528, 100);

		s1.go();// 调用前进方法
		s2.go();
		int count = 0;// 定义攻击次数统计
		for (int i = 0;; i++) {// 循环攻击
			if (s2.blood == 0) {// 判断血量是否为0
				System.out.println(s2.id + "挂了！");// 提示挂了
				break;// 如果血量为0，则停止攻击
			}
			s2.attack();// 调用攻击方法
			count++;// 攻击次数自增
		}
		System.out.println(s2.id + "号士兵发动了" + count + "次进攻");// 统计发动了多少次攻击
	}
}
