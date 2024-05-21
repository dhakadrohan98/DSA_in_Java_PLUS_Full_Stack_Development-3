package com.PreDirectorRound;

import java.util.*;

public class EmployeeManagerRelationship {
	//TC: O(4 * n)
	//SC: O(2 * n) + O(1)
	public static void levelHierarchy(Map<String, String> hmap) {
		int size = 0;
		// employee as key & manager as val
		Map<String, String> lhm = hmap;
		// store level of employees
		List<List<String>> res = new ArrayList<>();
		// manager list
		Set<String> lhs = new LinkedHashSet<>();
		// building manager list
		for (String val : lhm.values()) {
			lhs.add(val);
		}
		System.out.println(lhs);

		// for CEO or Level 1
		List<String> temp1 = new ArrayList<>();
		// how to know about CEO, iterate through set & check which manager is not in
		// employee list is know as CEO
		for (String key : lhs) {
			if (!hmap.containsKey(key)) {
				temp1.add(key);
			}
		}
		res.add(temp1);

		List<String> temp2 = null;
		if (size <= lhm.size()) {
			// for Level-2
			temp2 = new ArrayList<>();
			// know level-2 employees
			for (String key : lhm.keySet()) {
				String val = lhm.get(key);
				if (temp1.contains(val)) {
					temp2.add(key);
					size++;
				}
			}
			res.add(temp2);
		}

		List<String> temp3 = null;
		if (size <= lhm.size()) {
			// for level-3
			temp3 = new ArrayList<String>();
			// know level-3 employees
			for (String key : lhm.keySet()) {
				String val = lhm.get(key);
				if (temp2.contains(val)) {
					temp3.add(key);
					size++;
				}
			}
			res.add(temp3);
		}

		if (size <= lhm.size()) {
			// for level-3
			List<String> temp4 = new ArrayList<String>();
			// know level-3 employees
			for (String key : lhm.keySet()) {
				String val = lhm.get(key);
				if (temp3.contains(val)) {
					temp4.add(key);
					size++;
				}
			}
			res.add(temp4);
		}

		if (size == lhm.size()) {
			System.out.println("All employee relations are done");
		}

		System.out.println("Employees hierarchy:)");
		int i = 0;
		for (List<String> str : res) {
			System.out.print("Level " + i + ":- ");
			System.out.println(str);
			i++;
		}
	}

	public static void main(String[] args) {
		Map<String, String> hmap = new LinkedHashMap<>();
		// employee manager relation
		hmap.put("Bob", "Alice");
		hmap.put("Charlie", "Alice");
		hmap.put("David", "Alice");
		hmap.put("Eve", "Bob");
		hmap.put("Frank", "Bob");
		hmap.put("Grace", "Bob");
		hmap.put("Helen", "Charlie");
		hmap.put("Irene", "Charlie");
		hmap.put("Jack", "Charlie");
		hmap.put("Karen", "David");
		hmap.put("Larry", "David");
		hmap.put("Mike", "David");
		hmap.put("Nancy", "Eve");
		hmap.put("Oscar", "Frank");
		hmap.put("Peter", "Grace");
		hmap.put("Quinn", "Helen");
		hmap.put("Rachel", "Irene");
		hmap.put("Sam", "Jack");
		hmap.put("Tim", "Karen");
		hmap.put("Uma", "Larry");
		System.out.println("Hashmap size: " + hmap.size());
//		System.out.println("Given relationship between employee and manager:");
//		System.out.println(hmap);
		// core method to call
		levelHierarchy(hmap);
	}

}
