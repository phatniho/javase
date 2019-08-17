package day0503;

import java.util.Scanner;

/*
 * 需求：按输入执行操作
 * 1.商品列表
 * 2.商品录入
 * 3.商品查询
 * 4.统计信息
 * 5.退出
 * 选择：-> 2
 */
public class Test1 {

	static Item[] items = { // 商品列表
			new Item(1, "花生", 35.5, 300), // 0
			new Item(2, "瓜子", 25.5, 400), // 1
			new Item(3, "方便面", 10.5, 200), // 2
			new Item(4, "啤酒", 15.5, 30), // 3
			new Item(5, "饮料", 9.8, 500), // 4
	};

	public static void main(String[] args) {
		outer: while (true) {
			// 调用caiDan()方法，显示菜单并获得选择的值
			int c = caiDan();
			// 判断选项值
			switch (c) {
			case 1:
				f1();// 调用显示商品列表方法
				break;
			case 2:
				f2();// 调用商品查询方法
				break;
			case 3:
				f3();// 调用商品录入方法
				break;
			case 4:
				f4();// 调用统计信息方法
				break;
			case 5:// 退出选项
				break outer;// 结束外层循环
			default:
				System.out.println("没有这个选项，请重新输入！");// 输入其他数字提示超出范围
				continue outer;// 返回外层循环继续执行
			}
		}
	}

	private static int caiDan() {
		System.out.println("--------------");// 提示信息
		System.out.println("请输入需要执行的操作：");
		System.out.println("1.商品列表");
		System.out.println("2.商品查询");
		System.out.println("3.商品录入");
		System.out.println("4.统计信息");
		System.out.println("5.退出");
		System.out.println("--------------");
		System.out.print("选择：> ");
		int a = new Scanner(System.in).nextInt();// 获取键盘输入的选项
		return a;// 返回给调用位置
	}

	private static void f1() {// 显示商品列表
		for (int i = 0; i < items.length; i++) {// 数组遍历
			System.out.println(items[i].toString());// 打印数组元素商品对象的字符串显示方式
		}
	}

	private static void f2() {// 商品查询
		while (true) {// 循环查询
			System.out.print("查询的商品名：");// 提示信息
			String a = new Scanner(System.in).nextLine();// 获取输入的关键字
			if (a.equals("Q") || a.equals("q")) {// 判断结束查询条件
				System.out.println("查询结束！");
				break;// 结束查询循环
			}
			for (int i = 0; i < items.length; i++) {// 循环判断
				if (items[i].name.indexOf(a) >= 0) {// 判断名称子串是否包含输入的关键字
					System.out.println(items[i]);// 满足条件则返回这件商品的所有信息
				}
			}
		}
	}

	private static void f3() {// 商品录入
		for (int i = 0; i < items.length; i++) {// 循环录入
			System.out.println("录入第" + (i + 1) + "件商品");// 提示录入第几件商品
			System.out.print("编号：");// 录入编号提示
			items[i].id = new Scanner(System.in).nextInt();// 将当前商品编号修改为录入的编号

			System.out.print("名称：");
			items[i].name = new Scanner(System.in).nextLine();

			System.out.print("价格：");
			items[i].price = new Scanner(System.in).nextDouble();

			System.out.print("数量：");
			items[i].number = new Scanner(System.in).nextInt();
		}
		f1();// 调用方法重新显示列表
	}

	private static void f4() {// 统计信息
		// 商品总价
		// 单价均价
		// 最高总价
		// 最高单价
		double spzj = 0;// 商品总价
		double djjj = 0;// 单价均价
		double zgzj = 0;// 最高总价
		double zgdj = 0;// 最高单价

		for (int i = 0; i < items.length; i++) {// 遍历数组
			Item s = items[i];// 提取出来单独定义，方便调用
			spzj += s.price * s.number;// 计算总价，累加
			djjj += s.price;// 计算单价，累加
			if (s.price * s.number > zgzj) {// 判断是否为最高总价
				zgzj = s.price * s.number;// 将最高总价保存
			}
			if (s.price > zgdj) {// 判断是否为最高单价
				zgdj = s.price;// 将最高单价保存
			}
		}
		System.out.println("商品总价：" + spzj);// 输出打印结果
		System.out.println("单价均价：" + djjj / items.length);// 均价需要除以商品种数（数组长度）
		System.out.println("最高总价：" + zgzj);
		System.out.println("最高单价：" + zgdj);
	}
}
