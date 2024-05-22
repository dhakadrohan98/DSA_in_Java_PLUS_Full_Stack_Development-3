package org.comparable;

//comparable compareTo(Object o) can take one object at a time. 
//That's why i have implemented Comparable<T> in Student class.
public class Student implements Comparable<Student> {
		int rollNo;
		String name;
		int age;
		
		public Student(int rollNo, String name, int age) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.age = age;
		}

		@Override
		public int compareTo(Student st) {
		
			return this.age - st.age; //non-decreasing order
//			return this.name.compareTo(st.name);
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
		}

}
