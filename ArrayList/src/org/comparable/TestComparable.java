package org.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestComparable {

	public static void main(String[] args) {
		Student s1 = new Student(5, "Rohan Dhakad", 98);
		Student s2 = new Student(15, "Sanjeet Kumar", 21);
		Student s3 = new Student(25, "Rakshit", 20);
		Student s4 = new Student(35, "Ajay Srivastav", 18);
		List<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//sorting student objects on the basis of their age
		Collections.sort(al); 
		for(Student st:al) {
			System.out.println("Name: "+st.name + ",Age: "+st.age+",RollNo: "+st.rollNo);
		}

	}

}
