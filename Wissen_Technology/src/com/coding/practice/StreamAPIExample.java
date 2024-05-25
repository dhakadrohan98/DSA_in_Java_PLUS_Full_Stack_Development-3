package com.coding.practice;

import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
	
		//EX 1:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21);
		List<Integer> collect = list.stream().filter(n -> n%2 != 0).map(n -> n * n).
				collect(Collectors.toList());
		
		System.out.println(collect);
		
		//EX 2:
//		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		stream = stream.filter(n -> n % 2 == 0);
//		stream.forEach(System.out::println);

	}

}
