package com.PreDirectorRound;

class Student {
	private static Student obj;
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		if(obj == null) {
			obj = new Student();
		}
		return obj;
	}
	
	public void isObjectCreated() {
		System.out.println("object is created");
	}

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

public class SingletonPatternTest {

	public static void main(String[] args) {
		Student student = null;
		Student obj1 = student.getInstance();
		System.out.println(obj1);
		Student obj2 = student.getInstance();
		System.out.println(obj2);
		obj2.isObjectCreated();

	}

}
