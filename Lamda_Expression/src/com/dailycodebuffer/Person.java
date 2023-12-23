package com.dailycodebuffer;

import java.util.*;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	private String name;
	private int age;
	Sex gender;
	private String emailAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Person() {
	}

	public Person(String name, int age, Sex gender, String emailAddress) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + ", emailAddress='"
				+ emailAddress + '\'' + '}';
	}

	public void printPerson() {
		System.out.println(this.toString());
	}

	public static List<Person> generateDefaultList() {
		List<Person> people = new ArrayList<>();

		people.add(new Person("Shabbir", 20, Sex.MALE, "shabbir@gmail.com"));
		people.add(new Person("Nikhil", 21, Sex.MALE, "nikhil@gmail.com"));
		people.add(new Person("Shivam", 19, Sex.MALE, "shivam@gmail.com"));
		people.add(new Person("Rohan", 18, Sex.MALE, "rohan.dhakad@gmail.com"));
		return people;
	}
}
