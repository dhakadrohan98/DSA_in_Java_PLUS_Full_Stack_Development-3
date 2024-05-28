package org.abstraction.example;

public abstract class Animal {
	//abstract method
	public abstract void animalSound();
	
	//Regular(non abstract) method
	public void sleep() {
		System.out.println("Zzz...");
	}
}
