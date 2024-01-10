package org.student.hashmap.internal;

import java.util.Objects;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj ) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student others = (Student)obj;
		return Objects.equals(id, others.id);
	};
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
