package org.codeship;
import org.codeship.person.*;

public class Hello {

	public static void main(String[] args) {
		Person 	john = new Vegan();
		Person kalyan = new NonVegan();
		john.speak();
		john.eat();
		System.out.println("********************");
		kalyan.speak();
		kalyan.eat();
		
	}

}
