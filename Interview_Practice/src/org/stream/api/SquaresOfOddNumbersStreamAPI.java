package org.stream.api;

import java.util.*;
import java.util.stream.Collectors;

public class SquaresOfOddNumbersStreamAPI {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		list = list.stream().filter(n -> n % 2 != 0).map(n -> n*n).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
