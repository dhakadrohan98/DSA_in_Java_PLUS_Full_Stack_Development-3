package org.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareOddNumbersSum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		List<Integer> collect = list.stream().filter(n -> n % 2 != 0).map(n -> n*n).collect(Collectors.toList());
		System.out.println(collect);

	}

}
