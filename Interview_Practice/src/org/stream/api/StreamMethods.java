package org.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		 /*
		 * filter(Predicate) 
		 *        boolean valued function 
		 *        n -> n > 10;
		 */
		
		//map(Function)
		//		perform operation on each element
		//		squaring each element & returning nothing.
		
		List<String> names  = List.of("Rohan","Sanjeet","Pranav","Rakshit","Pranay");
		List<String> collect = names.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
		System.out.println("Name starting with R");
		System.out.println(collect);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(34);
		numbers.add(6);
		numbers.add(15);
		//sorting numbers (list)
		numbers.stream().sorted().forEach(System.out::println);
		
		//comparing two elements in each iteration(numbers) & returning minimum from them.
		Integer minimum = numbers.stream().min( (x,y) -> x.compareTo(y) ).get();
		System.out.print("Minimum Number: ");
		System.out.println(minimum);
		
		//comparing two elements in each iteration(numbers) & returning maximum from them.
				Integer maximum = numbers.stream().max((x,y) -> x.compareTo(y)).get();
				System.out.print("Maximum Number: ");
				System.out.println(maximum);
	


	}

}
