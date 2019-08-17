package day1804;

import java.util.ArrayList;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * 需求：用网页爬虫获取指定网页的指定数据
 */
public class Test1 {
	@Test
	public void a() throws Exception {
		// http://www.baidu.com
		String s = Jsoup.connect("http://www.baidu.com").execute().body();// 连接获取网页源代码字符串
		System.out.println(s);
	}

	@Test
	public void b() throws Exception {
		// http://www.baidu.com
		String s = Jsoup.connect("https://item.jd.com/44076405947.html").execute().body();
		System.out.println(s);
	}

	@Test
	public void c() throws Exception {
		Document doc = Jsoup.connect("https://item.jd.com/44076405947.html").get();
		Elements div = doc.select("div.sku-name");// 提取网页指定元素
		String s = div.text();// 将指定元素转换为字符串
		System.out.println(s);
		String price = doc.select("p-price").text();// 获取网页指定元素并转换为字符串
		System.out.println("价格：" + price);
	}

	@Test
	public void d() throws Exception {
		String s = Jsoup.connect("https://p.3.cn/prices/mgets?skuIds=44076405947").ignoreContentType(true).execute()
				.body();// 连接获取指定请求连接发回的特定类型消息
		System.out.println(s);
		// [{"cbf":"0","id":"J_44076405947","m":"10999.00","op":"6999.00","p":"6288.00"}]
		// 把json格式字符串，解析处理成一个对象
		// ArrayList<HashMap<String,String>>
		// jackson 开源工具包，json解析处理工具
		ObjectMapper m = new ObjectMapper();// 新建处理工具对象
		ArrayList<HashMap<String, String>> list = m.readValue(s, ArrayList.class);
		// 对象调用方法将数据转换为指定类型
		// m.readValue(s,new TypeReference<ArrayList<HashMap<String, String>>>() {});
		String p = list.get(0).get("p");// 将集合指定位置元素获取并转换为字符串
		System.out.println(p);
	}
}
