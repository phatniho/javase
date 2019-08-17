package day1804;

import java.util.ArrayList;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * ��������ҳ�����ȡָ����ҳ��ָ������
 */
public class Test1 {
	@Test
	public void a() throws Exception {
		// http://www.baidu.com
		String s = Jsoup.connect("http://www.baidu.com").execute().body();// ���ӻ�ȡ��ҳԴ�����ַ���
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
		Elements div = doc.select("div.sku-name");// ��ȡ��ҳָ��Ԫ��
		String s = div.text();// ��ָ��Ԫ��ת��Ϊ�ַ���
		System.out.println(s);
		String price = doc.select("p-price").text();// ��ȡ��ҳָ��Ԫ�ز�ת��Ϊ�ַ���
		System.out.println("�۸�" + price);
	}

	@Test
	public void d() throws Exception {
		String s = Jsoup.connect("https://p.3.cn/prices/mgets?skuIds=44076405947").ignoreContentType(true).execute()
				.body();// ���ӻ�ȡָ���������ӷ��ص��ض�������Ϣ
		System.out.println(s);
		// [{"cbf":"0","id":"J_44076405947","m":"10999.00","op":"6999.00","p":"6288.00"}]
		// ��json��ʽ�ַ��������������һ������
		// ArrayList<HashMap<String,String>>
		// jackson ��Դ���߰���json����������
		ObjectMapper m = new ObjectMapper();// �½������߶���
		ArrayList<HashMap<String, String>> list = m.readValue(s, ArrayList.class);
		// ������÷���������ת��Ϊָ������
		// m.readValue(s,new TypeReference<ArrayList<HashMap<String, String>>>() {});
		String p = list.get(0).get("p");// ������ָ��λ��Ԫ�ػ�ȡ��ת��Ϊ�ַ���
		System.out.println(p);
	}
}
