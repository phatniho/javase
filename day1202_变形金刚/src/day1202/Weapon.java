package day1202;

/*
 * 接口：极端的抽象类，内部全是抽象方法
 * 用interface代替了class关键字
 * 用implements代替了extends关键字
 * 接口中只能定义公开的抽象方法
 * 公开的常量
 * 公开的内部类、内部接口
 * 类可以同时继承多个接口
 * 接口可以继承接口，使用extends关键字，可以继承多个
 */
public interface Weapon {
	// 接口中定义常量可以省略前三个关键字
	// public static final
	int TYPE_COLD = 0;
	int TYPE_HOT = 1;
	int TYPE_NUCLEAR = 2;

	// 接口中的抽象方法必须是公开的，接口中前两个关键字可以省略不写
	// public abstract
	void kill();

	String getName();

	int getType();
}
