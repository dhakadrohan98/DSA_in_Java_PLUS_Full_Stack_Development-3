package org.wissen.original_questions;

import java.util.*;

public class UpdateHashSet {

	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<>();
		// HashCode is based on id directly. 

		Student st1 = new Student("Nimit", 1);
		Student st2 = new Student("Rahul", 3);
		Student st3 = new Student("Nimit", 2);
		studentSet.add(st1);
		studentSet.add(st2);
		studentSet.add(st3);

		System.out.println(studentSet.size());

		st1.id = 3;
		System.out.println(studentSet.size());
	}
}
