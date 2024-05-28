package com.sorting;

import java.util.*;

class Employee implements Comparable<Employee> {

	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee emp) {
		if (emp.id == 0) { // if employee id is null or 0
			return this.id - emp.id;
		} else {
			return this.name.compareTo(emp.name);
		}
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Razz", 230);
		Employee emp5 = new Employee("Ranjan", 190);
		Employee emp2 = new Employee(1, "Abhishek", 200);
		Employee emp3 = new Employee(2, "Shubham", 150);
		Employee emp4 = new Employee(3, "Rohan", 220);
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp5);
		list.add(emp3);
		list.add(emp2);
		list.add(emp4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
