package org.java.polymorphism;

//Base class: Animal
class Animal {
 void sound() {
     System.out.println("Some generic animal sound");
 }
}

//Derived class: Dog
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog is Barking");
 }
}

//Derived class: Cat
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat is Meowing");
 }
}


public class MethodOverrding {

	public static void main(String[] args) {
		// Parent class reference to child class object
	     Animal animal;

	     // Dog object
	     animal = new Dog();
	     animal.sound(); // Output: Barking

	     // Cat object
	     animal = new Cat();
	     animal.sound(); // Output: Meowing

	}

}
