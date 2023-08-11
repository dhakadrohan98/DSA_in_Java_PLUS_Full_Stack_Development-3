package org.codeship.person;

public class NonVegan extends Person {

	@Override
	public void eat() {
		System.out.println("Eats Non vegan food");
	}
}
