package org.comparable;

import java.util.Comparator;

public class RollNoComprator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		return s2.rollno - s1.rollno; //decreasing order
	}
}
