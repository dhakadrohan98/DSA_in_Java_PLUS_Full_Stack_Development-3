package org.hashmap.internal.working;

import java.util.*;
import java.util.Map.Entry;

public class OverridenHashMapClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee("rohan");
		Employee emp2 = new Employee("rohan");
		HashMap<Employee, String> hmap = new HashMap<Employee, String>();
		
		hmap.put(emp1, "rohan");
		hmap.put(emp2, "sanjeet");
		
		System.out.println("Both Objects are Equal: " + emp1.equals(emp2));
		System.out.println();
		System.out.println("emp1->" + emp1.hashCode() + " :: emp2-> "+ emp2.hashCode());
		hmap.forEach((k,v) -> System.out.println("Key is " + k.getName() +" Value is "+ v));
		
		for(Employee emp:hmap.keySet()) {
			System.out.println(emp);
		}

	}	

}
