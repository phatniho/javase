package day11_ÖØÐ´;

import java.util.Iterator;
import java.util.LinkedList;

public class Test02_LinkedList {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			ll.add(i);
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n-------------------");
		t = System.currentTimeMillis();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n-------------------");
		t = System.currentTimeMillis();
		System.out.println(ll.get(ll.size() >> 1));
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n-------------------");
		t = System.currentTimeMillis();
		for (int i = 0; i < ll.size(); i++) {
			ll.get(i);
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n-------------------");
		t = System.currentTimeMillis();
		Iterator<Integer> it = ll.iterator();
		while (it.hasNext()) {
			it.next();
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n-------------------");

	}
}
