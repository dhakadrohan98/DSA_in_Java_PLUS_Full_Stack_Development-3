package org.java.abstraction;

//Abstract class: Vehicle
abstract class Vehicle {
 // Abstract method (no implementation)
 abstract void start();

 // Concrete method (with implementation)
 void stop() {
     System.out.println("Vehicle is stopping.");
 }
}

//Subclass: Car
class Car extends Vehicle {
 // Providing implementation of the abstract method
 @Override
 void start() {
     System.out.println("Car is starting with a key.");
 }
}

//Subclass: Bike
class Bike extends Vehicle {
 // Providing implementation of the abstract method
 @Override
 void start() {
     System.out.println("Bike is starting with a self-start button.");
 }
}


public class AbstracDriverClass {

	public static void main(String[] args) {
		Vehicle carVehicle = new Car();
		carVehicle.start();
		carVehicle.stop();
		
		Vehicle bikeVehicle = new Bike();
		bikeVehicle.start();

	}

}
