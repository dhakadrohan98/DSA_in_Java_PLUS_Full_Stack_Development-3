package org.comparable;

import java.util.Comparator;

public class RollNoComprator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if(s1.rollno == s2.rollno) {
			return 0;
		} else if(s1.rollno > s2.rollno) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
