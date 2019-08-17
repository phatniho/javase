package day15ºØ∫œ≈≈–Ú;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		Collections.addAll(al, //
				"2019-04-11", "2019-04-10", "2019-04-1", //
				"2019-04-14", "2019-04-2", "2019-04-20", //
				"2019-04-21", "2019-04-24", "2019-04-3", //
				"2019-04-30", "2019-04-29", "2019-04-15", //
				"2019-04-5", "2019-04-25", "2019-04-19", //
				"2019-04-4", "2019-04-9", "2019-04-27");//
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date a = s.parse(o1);
					Date b = s.parse(o2);
					return a.compareTo(b);
				} catch (ParseException e) {
					throw new IllegalArgumentException();
				}
			}

		});
		System.out.println(al);
	}
}
