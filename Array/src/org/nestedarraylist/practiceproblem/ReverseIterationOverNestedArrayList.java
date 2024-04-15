package org.nestedarraylist.practiceproblem;

import java.util.*;

public class ReverseIterationOverNestedArrayList {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(30);
		list1.add(29);
		list1.add(28);
		list.add(list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(19);
		list2.add(18);
		list.add(list2);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(9);
		list3.add(8);
		list.add(list3);
		System.out.println("Normal list");
		System.out.println(list);

		System.out.println("List from back");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(list.size() - 1 - i));
			System.out.print(", ");
		}

	}

}
