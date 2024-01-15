package org.oops;

abstract class Bike {
	// Constructor
	Bike() {
		System.out.println("bike is created");
	}

	// Abstract method
	abstract void run();

	// Non abstract method
	public void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}

public class NoAbstractMethodAndConstructor {

	public static void main(String[] args) {
		Bike bike = new Honda();
		bike.run();
		bike.changeGear();

	}

}
