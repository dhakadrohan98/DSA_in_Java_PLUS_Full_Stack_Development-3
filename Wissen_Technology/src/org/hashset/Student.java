package org.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Student)) return false;
		Student student = (Student)obj;
		return id == student.id || Objects.equals(name, student.name);
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Rohan Dhakad");
		Student s2 = new Student(2, "Sanjeet Kumar");
		Student s3 = new Student(3, "Pranav pankaj");
		Student s4 = new Student(4, "Ritesh Rana");
		Student s5 = new Student(1, "Rohit Dhakad");
		Set<Student> set = new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		System.out.println(set);
		System.out.println(Objects.equals(s1, s5));
		System.out.println();
		System.out.println(set.size());
		s1.id =3;
		System.out.println(set.size());
		System.out.println(set);
	}

}
