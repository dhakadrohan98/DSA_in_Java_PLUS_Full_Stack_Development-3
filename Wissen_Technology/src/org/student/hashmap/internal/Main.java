package org.student.hashmap.internal;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Rohan","Dhakad");
		Student s2 = new Student(110,"Sanjeet","kumar");
		
		HashMap<Student,String> hmap = new HashMap<>();
		hmap.put(s1, "admitted");
		hmap.put(s2, "admired");
		
		System.out.println("s1 -> " + s1.hashCode());
		System.out.println("s1 -> " + s2.hashCode());
		System.out.println(s1.equals(s2));
		for(Student s: hmap.keySet()) {
			System.out.println(s);
		}
		
	}

}
