package org.hashset;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesNumbers {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
        Set<Integer> set = new HashSet<>();
        
        // Use a HashSet to collect duplicate numbers
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> set.add(n)) // Filter out non-duplicate values
                .collect(Collectors.toSet());

        System.out.println("Unique numbers: " + duplicates);
    }

}
