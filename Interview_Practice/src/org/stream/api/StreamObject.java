package org.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		//Stream API: process Collection / group of objects
		
		//1st way of creating stream: Arrays.stream(new int[]{1,2,3})
		IntStream stream =  Arrays.stream(new int[]{1,2,35,4,3,78,53,24,5341,143,442,54,35,15});
		stream.forEach(n -> {
			System.out.println(n);
		});
		
		/**  2nd way of creating stream: Stream.empty();*/
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(n -> System.out.println(n));

		/**  3rd way of creating stream: Stream.of(array_object/object)*/
		String[] names = {"Rohan","Sanjeet","Pranav","Ankit Dubey"};
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(n -> { System.out.print(n + ", "); });
		System.out.println();
		
		//4th way of creating stream: list.stream();
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(13);
		list.add(33);
		list.add(43);
		
		Stream<Integer> streamInt = list.stream();
		streamInt.forEach(n -> System.out.println(n));

	}

}
