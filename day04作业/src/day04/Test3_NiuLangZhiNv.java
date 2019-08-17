package day04;

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
public class Test3_NiuLangZhiNv {
	public static void main(String[] args) {
		long y = 299792458l * 60 * 60 * 24 * 365;// 需要定义long型计算，免得数据溢出
		double s = 16.4 * y;
		double m = s / 0.46;
		System.out.println("需要喜鹊数量：" + (long) (Math.ceil(m)));// 向上取整并转型
	}
}
