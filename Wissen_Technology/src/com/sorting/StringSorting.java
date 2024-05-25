package com.sorting;

import java.util.*;

class Sorting implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareToIgnoreCase(s1);
	}
}

public class StringSorting {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Janki");
		list.add("begum");
		list.add("Tiya");
		list.add("Arpit");
		list.add("Zakhir");
		System.out.println(list);
		Collections.sort(list, new Sorting());
		System.out.println("after sorting list in lexicographically reverse order");
		System.out.println(list);

	}

}
