package org.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		Student1 s1 = new Student1(5, "Rohan Dhakad", 19);
		Student1 s2 = new Student1(15, "Sanjeet Kumar", 21);
		Student1 s3 = new Student1(25, "Rakshit", 20);
		Student1 s4 = new Student1(35, "Ajay Srivastav", 18);
		List<Student1> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Sorting by Name started:");  
		//Using NameComparator to sort the elements
		Collections.sort(al, new NameComparator());
		System.out.println(al);
		System.out.println("Sorting by Name ended."); 
		System.out.println("###################################");
		
		System.out.println("Sorting by Age started:");  
		//Using NameComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		System.out.println(al);
		System.out.println("Sorting by Age ended.");
		System.out.println("###################################");
		
		System.out.println("Sorting by RollNo started:");  
		//Using NameComparator to sort the elements
		Collections.sort(al, new RollNoComprator());
		System.out.println(al);
		System.out.println("Sorting by RollNo ended.");
	}

}
