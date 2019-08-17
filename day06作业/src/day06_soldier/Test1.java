package day06_soldier;

/*
 * 需求：新建两个士兵对象
 * 调用士兵对象中的前进方法
 * 调用士兵对象中的攻击方法
 */
public class Test1 {
	public static void main(String[] args) {
		Soldier s1 = new Soldier(9527);
		Soldier s2 = new Soldier(9528, 200);

		s1.go();
		s2.go();

		s2.attack();
		s1.attack();

		int count = 1;
		for (int i = 0;; i++) {
			if (s1.getBlood() == 0) {
				break;
			}
			s1.attack();
			count++;
		}
		System.out.println(s1.getId() + "号士兵一共发动了" + count + "次进攻！");
	}
}
