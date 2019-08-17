package day0203;

/*
 * 需求：牛郎织女星相距16.4光年
 * 光速299792458米每秒
 * 喜鹊身长0.46米
 * 牛郎织女相会，需要多少只喜鹊
 * 分析：
 * 先计算1光年等于多少米
 * 再根据光年值算出牛郎织女星总距离
 * 然后用总距离除以喜鹊身长
 * 对算出的结果向上取整Math.ceil()//Math.floor()向下取整
 * 输出打印结果
 */
public class Test1 {
	public static void main(String[] args) {
		long year = 299792458L * 60 * 60 * 24 * 365;// 计算光一年的距离
		double l = 16.4 * year;// 计算总距离
		double s = l / 0.46;// 计算一共需要多少只喜鹊
		long a = (long) Math.ceil(s);// 向上取整，并强制转型为整数
		System.out.println("牛郎织女相会一共需要" + a + "只喜鹊");// 输出打印结果337064741891311296
	}
}
