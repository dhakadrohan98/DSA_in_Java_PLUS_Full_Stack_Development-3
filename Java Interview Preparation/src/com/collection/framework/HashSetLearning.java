package com.collection.framework;
import java.util.*;

public class HashSetLearning {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		// Does not contain duplicate element. possess uniqueness.
		set.add(32); //unique hash generated internally-> adhdhsji89238
		set.add(23);
		set.add(79);
		set.add(97);
		set.add(63);
		
		set.add(23);
		set.add(23);
		set.add(23);
		set.add(23);
		
		System.out.println(set);
		System.out.println(set.getClass());
		
		
		System.out.println(set.remove(33));

	}

}
