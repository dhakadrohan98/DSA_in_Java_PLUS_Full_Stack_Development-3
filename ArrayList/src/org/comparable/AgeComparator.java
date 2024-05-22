package org.comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student1> {
	
	@Override
	public int compare(Student1 s1,Student1 s2){  
		return s2.age - s1.age; //Descending/decreasing order
	}
}
