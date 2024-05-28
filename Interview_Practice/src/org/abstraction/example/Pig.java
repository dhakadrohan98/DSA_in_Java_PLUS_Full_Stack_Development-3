package org.abstraction.example;

public class Pig extends Animal {
	
	@Override
	public void animalSound() {
		System.out.println("wee wee....");
	}
	
	public static void main(String[] args) {
		Animal pig = new Pig();
		pig.animalSound();
		pig.sleep();
	}
}
