package org.comparable;

public class Student1 {
	int rollno;  
	String name;  
	int age;
	
	public Student1 (int rollno,String name,int age){  
		super();
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}  
	
}
