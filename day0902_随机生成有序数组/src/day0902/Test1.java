package day0902;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 需求：生成随机数组，每次按回车添加一个元素，保持数组元素有序
 */
public class Test1 {
	public static void main(String[] args) {
		Number[] a = addArr();// 调用方法建立数组，由于类型不确定，建立父类对象
	}

	public static Number[] addArr() {
		Number[] a = new Number[0];// 建立父类对象数组
		while (true) {// 循环生成添加元素
			System.out.println("按回车开始随机生成数字");// 提示语句
			new Scanner(System.in).nextLine();// 回车执行
			Number n = null;// 新建元素对象
			if (Math.random() > 0.5) {// 随机值选择
				n = new Random().nextInt(1000);// 生成整数
			} else {
				double d = Math.random() * 1000;// 生成浮点数
				// 调用精确小数类中的方法对生成的小数进行处理
				d = BigDecimal.valueOf(d).// 处理浮点数，四舍五入保留一位
						setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();//
				n = d;// 保存处理后的浮点数
			}

			int c = binarySearch(a, n);// 自定义二分查找法，获取指定元素在数组中的位置
			if (c < 0) {// 判断返回的角标是否小于零
				c = -c - 1;// 处理返回的角标值
			}
			// 将数组复制到新数组，长度增加一位
			a = Arrays.copyOf(a, a.length + 1);
			// 将原数组从插入点开始的元素向后移一位
			System.arraycopy(a, c, a, c + 1, a.length - c - 1);
			a[c] = n;// 把数据放入插入点位置
			System.out.println(Arrays.toString(a));// 打印数组
		}
	}

	private static int binarySearch(Number[] a, Number n) {// 二分查找法
		int lo = 0;// 定义最低范围
		int hi = a.length - 1;// 定义最高范围
		int mid;// 定义中间范围
		while (lo <= hi) {// 判断是否交叉
			mid = (lo + hi) / 2;// 计算中间值
			if (a[mid].doubleValue() < n.doubleValue()) {// 比较中间值与传入值的大小
				lo = mid + 1;// 最低值范围增大
			} else if (a[mid].doubleValue() > n.doubleValue()) {
				hi = mid - 1;// 最高值范围减小
			} else {
				return mid;// 如果找到这个值，则返回中间值
			}
		}
		return -(lo + 1);// 如果没找到这个值，则返回可以插入的位置加一的负数
	}
}
