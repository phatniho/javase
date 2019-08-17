package day1402;

/*
 * 需求：局部内部类和匿名内部类
 */
public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = f1();// 调用方法创建接口对象
		w1.kill();// 接口对象调用方法
		System.out.println(w1);
		System.out.println("---------");
		Weapon w2 = f2("倚天剑");// 调用方法传入指定参数创建接口对象
		w2.kill();// 接口对象调用方法
		System.out.println(w2);
	}

	private static Weapon f2(final String name) {
		// 局部内部类中，使用外面的局部变量，必须加final，jdk1.8以后可以缺省
		Weapon w = new Weapon() {// 匿名内部类
			public void kill() {// 重写实现接口方法
				System.out.println("使用" + name + "攻击！");
			}
		};
		return w;
	}

	private static Weapon f1() {
		// 局部内部类
		class AK47 implements Weapon {// 实现接口
			public void kill() {// 重写实现接口方法
				System.out.println("使用AK47进攻");
			}
		}
		AK47 a = new AK47();// 新建内部类对象
		return a;
	}
}
