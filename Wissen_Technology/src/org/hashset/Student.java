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
		HashSet<Student> set = new HashSet<>();
		Student s1 = new Student(1, "Nimit");
		Student s2 = new Student(3, "Rahul");
		Student s3 = new Student(2, "Nimit");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set);
		System.out.println(set.size());
		//same key at the different bucket index
		s1.id = 3;
		System.out.println(set);
		int size = set.size();
		System.out.println(size);
		System.out.println("s1 hashcode- " + s1.hashCode());
		System.out.println("s3 hashcode- " + s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
