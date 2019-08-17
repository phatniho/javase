package day1602;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * 需求：读取文件中的学生对象，随机抽取一名学生中奖，
 * 将中奖次数统计加一，把新值进行排序后再保存到文件中
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		// 读取加载文件数据
		List<Student> list = load();
		// 随机访问list中的一个学生实例
		Student s = chouJiang(list);
		s.setCount(s.getCount() + 1);
		// 把列表数据，重新存到文件
		save(list);
		System.out.println("恭喜" + s.getName() + "中大奖！中奖次数：" + s.getCount());
	}

	private static List<Student> load() throws Exception {
		ArrayList<Student> list = new ArrayList<Student>();// 准备集合
		BufferedReader in = new BufferedReader(// 按行从文件读取到内存
				new InputStreamReader(// 编码转换
						new FileInputStream("d:/stu.txt"), // 文件数据读取
						"GBK"));// 指定编码
		String line;// 定义变量保存读取到的数据
		while ((line = in.readLine()) != null) {// 判断是否读取完成
			line = line.replaceAll("\\s+", "");// 替换掉空白字符
			if (line.length() == 0) {// 判断是否读取到数据
				continue;// 当前行未读取到数据则继续读取下一行
			}
			String[] a = line.split(";");// 从指定符号分割开
			Student s = new Student();// 新建学生对象
			s.setName(a[0]);// 将数据保存到学生对象
			s.setCount(Integer.parseInt(a[1]));// 将数据转换后保存到学生对象
			list.add(s);// 将对象加入到集合列表中
		}
		in.close();// 关闭流
		System.out.println(list);// 打印集合
		return list;// 返回集合到调用位置
	}

	private static Student chouJiang(List<Student> list) {
		// 对list排序，用指定比较器
		Collections.sort(list, new Comparator<Student>() {
			// 比较方法
			public int compare(Student o1, Student o2) {
				// 返回比较结果
				return o1.getCount() - o2.getCount();
			}
		});
		// [0,list.size()/2)
		int mid = list.size() / 2;// 定位中间位置
		int j;// 定义随机对象角标
		if (Math.random() < 0.7) {// 定义几率
			j = new Random().nextInt(mid);// 确定随机角标
		} else {
			j = mid + new Random().nextInt(list.size() - mid);// 确定随机角标
		}
		return list.get(j);// 返回随机角标对应的对象
	}

	private static void save(List<Student> list) throws Exception {
		PrintWriter out = new PrintWriter(// 按行从内存写到文件
				new OutputStreamWriter(// 编码转换
						new FileOutputStream("d:/stu.txt"), // 写到目标文件
						"GBK"));// 指定编码
		for (Student s : list) {// 循环遍历
			out.println(s);// 按行写到文件
		}
		out.close();// 关闭流
	}
}
