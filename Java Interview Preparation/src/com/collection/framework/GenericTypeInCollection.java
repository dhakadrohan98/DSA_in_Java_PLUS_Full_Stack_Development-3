package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeInCollection {

	public static void main(String[] args) {
		List list = new ArrayList();
		int[] arr = new int[]{100,478,282,497,7654};
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("Rohan");
		list.add(arr[2]);
		list.add(29.3783f);
		list.add(73827382.4389f);
		System.out.println(list);
		list.add(1, 2);
		System.out.println(list);

	}

}
