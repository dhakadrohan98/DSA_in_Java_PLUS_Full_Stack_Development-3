package org.stream.api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(2,4,50,21,22,67,99,98,97,96,78,75,77,76);
//		Stream<Integer> stream = list1.stream();
		List<Integer> collect1 = list1.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("odd numbers:");
		System.out.println(collect1);
		
		System.out.println("numbers greater than 50:");
		List<Integer> collect2 = list1.stream().filter(n -> n>50).collect(Collectors.toList());
		System.out.println(collect2);
		
		

	}

}
