package org.employee.manager;

import java.util.*;

public class EmployeeManagerRelation {

	public static void returnManager(Map<String, String> hmap, 
			Set<String> employees, Set<String> managers) {
		
		//Master Bigger List
		int levelLimit = managers.size();
		List<ArrayList<String>> list = new ArrayList<>();
		String CEO = "";
		//list(1 to 12) will go
		ArrayList<String> list1 = null;
		ArrayList<String> list2 = null;
		ArrayList<String> list3 = null;
		ArrayList<String> list4 = null;
		
		//Level-1 employee
		if(list.size() <= levelLimit) {
			for(String ceo: managers) {
				if(!employees.contains(ceo)) {
					list1 = new ArrayList<>(); 
					CEO = ceo;
					list1.add(ceo);
					list.add(list1);
					break;
				}
			}
		}
		
		if(list.size() <= levelLimit) {
			list2 = new ArrayList<>();
			for(String employee: employees) {
				if(hmap.get(employee) == CEO) {
					list2.add(employee);
				}
			}
			list.add(list2);
		}
		
		if(list.size() <= levelLimit) {
			list3 = new ArrayList<>();
			for(String employee: employees) {
				if(list2.contains(hmap.get(employee))) {
					list3.add(employee);
				}
			}
			list.add(list3);
		}
		
		if(list.size() <= levelLimit) {
			list4 = new ArrayList<>();
			for(String employee: employees) {
				if(list3.contains(hmap.get(employee))) {
					list4.add(employee);
				}
			}
			list.add(list4);
		}
		
		for(List<String> temp: list) {
			System.out.println(temp);
		}
		
	}
	public static void main(String[] args) {
		Map<String, String> hmap = new LinkedHashMap<>();
		
		hmap.put("Bob", "Alice");
		hmap.put("Charlie","Alice");
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
		System.out.println(hmap);
		
		
		//storing managers name in set
		Set<String> set = new LinkedHashSet<>();
		for(String manager: hmap.values()) {
			set.add(manager);
		}
		System.out.print("Managers count: ");
		System.err.println(set.size());
		System.out.println(set);
		//storing Employees name in set
		Set<String> set1 = new LinkedHashSet<>();
		for(String employee: hmap.keySet()) {
				set1.add(employee);
		}
		System.out.print("Employees count: ");
		System.err.println(set1.size());
		System.out.println(set1);
		returnManager(hmap, set1,set);
		
		
	}

}
