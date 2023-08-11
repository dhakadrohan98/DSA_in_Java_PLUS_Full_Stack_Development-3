package com.collection.framework;

import java.util.*;

public class LearnArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(10);
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(1, 2);
		System.out.println(list);

// for-each loop (collections)
//		for(Integer i:list) {
//			System.out.println(i);
//		}
		
		//sorting method
		Collections.sort(list);
		System.out.println("sorted list: "+list);
//		
//		list.set(1, 6);
//		System.out.println("Modified"+list);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println(list.contains(20));
//		
//		list.remove(Integer.valueOf(20));
////		System.out.println("Remoed ele: "+ remove);
//		System.out.println(list);
//		System.out.println(list.contains(20));
//		
//		System.out.println("List size: "+list.size());
//		
//		System.out.println(list.isEmpty());
//		list.clear();
//		System.out.println(list.isEmpty());
		
		// Iterating over ArrayList collection
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator: "+it.next());
		}

	}

}
