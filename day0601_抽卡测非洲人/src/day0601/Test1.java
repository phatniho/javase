package day0601;

/*
 * 需求：抽卡测试非洲人
 * 新建英雄，随机生成属性，根据属性评定该英雄稀有度
 * 循环抽卡，抽到指定稀有度英雄为止，统计抽卡次数
 */
public class Test1 {
	public static void main(String[] args) {
		int count = 1;// 定义抽卡计数器
		while (true) {// 循环抽卡
			Hero h1 = new Hero("孙悟空");// 抽到新英雄
			if (h1.level().equals("SSS")) {// 判断英雄稀有度是否满足要求
				h1.show();// 满足则输出该英雄属性详情
				System.out.println("抽了" + // 输出打印抽卡次数
						count + "个英雄，终于有一个" + //
						h1.level() + "级别的了！");//
				break;// 结束循环
			}
			h1.show();// 抽到普通英雄也展示英雄详细属性
			count++;// 未抽到目标稀有度的英雄则抽卡次数加一
		}
	}
}
