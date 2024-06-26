package org.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream API definition:

// Stream API is basically perform bulk operations(on objects of collection) and 
//process objects of collection.

//it can take advantage of multiple cores to process data in parallel. This makes it ideal for 
//processing large amounts of data.


public class SquareOfEvenNumbers1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,13,16,17,19,20,24,28);
		
		List<Integer> collect = list.stream().filter(n -> n%2 == 0).map(n -> n*n).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
