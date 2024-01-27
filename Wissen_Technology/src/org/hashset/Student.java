package org.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {

	public int id;
	public String name;

	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int hashCode() {
		return this.id;
	}

	public String toString() {
		return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
	}

	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			return s.id == this.id ? true : false;
		}
		return false;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Rohan Dhakad");
		Student s2 = new Student(2, "Sanjeet Kumar");
		Student s3 = new Student(3, "Pranav pankaj");
		Student s4 = new Student(4, "Ritesh Rana");
		Student s5 = new Student(1, "Rohit Dhakad");
		HashSet<Student> set = new HashSet<>();

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
//		System.out.println(set);
//		System.out.println(Objects.equals(s1, s5));
//		System.out.println();
//		System.out.println("Initial size: " + set.size());
//		s1.id = 3;
//		System.out.println("Later size: " + set.size());
//		System.out.println(set);
		System.out.println("s1 hashCode: " + Objects.hashCode(s1));
		System.out.println("s5 hashCode: "+ Objects.hashCode(s5));
		System.out.println(set);
		System.out.println(set.size());
		s1.id = 3;
		System.out.println(set.size());
		System.out.println(set);
	}

}
