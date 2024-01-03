package org.stream.api;

import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5); //1+9+25 = 35
		stream = stream.filter(n -> n%2 != 0);
		stream.forEach(System.out::println);
		
		
//		int oddNumberSquare = stream.filter(n -> n%2 != 0).mapToInt(n -> n*n).sum();
//		System.out.println(oddNumberSquare);
	}

}
