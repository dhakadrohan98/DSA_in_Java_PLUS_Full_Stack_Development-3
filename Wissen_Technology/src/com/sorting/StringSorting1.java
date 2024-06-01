package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting1 implements Comparable<String> {

	@Override
	public int compareTo(String s) {
		return this.compareTo(s);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Janki");
		list.add("begum");
		list.add("Tiya");
		list.add("Arpit");
		list.add("Zakhir");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting list in lexicographically order");
		System.out.println(list);
	}
}
