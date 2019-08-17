package day0503;

/*
 * 封装商品的数据
 * Item类，商品的对象模板
 */
public class Item {
	int id;// 编号
	String name;// 名称
	double price;// 价格
	int number;// 数量

	public Item() {// 空参数构造方法
	}

	public Item(int id, String name, double price, int number) {// 4参数构造方法
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}

	public String toString() {// 打印商品详情方法
		return "编号：" + id + "，名称：" + name + "，价格：" + price + "，数量：" + number;
	}
}
