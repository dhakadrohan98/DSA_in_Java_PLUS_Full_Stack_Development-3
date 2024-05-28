package org.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativeOrPositiveValues {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,-2,-3,4,-5,6,-7,-8,9,14,18,-23,25,-29,30);
		System.out.println(list);
		//positive numbers
		list = list.stream().filter(n -> n > 0).collect(Collectors.toList());
		System.out.println(list);
		//resetting numbers
		list = Arrays.asList(1,-2,-3,4,-5,6,-7,-8,9,14,18,-23,25,-29,30);
		//negative numbers
		list = list.stream().filter(n -> n < 0).collect(Collectors.toList());
		System.out.println(list);

	}

}
