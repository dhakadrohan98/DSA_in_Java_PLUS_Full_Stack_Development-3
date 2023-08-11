package com.codeship;
import com.codeship.vehicles.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike("long", "diesel", 2, 3, 25, "Yellow Bulb");
//		System.out.println("Handle: " + bike.getHandle());
//		System.out.println("Engine: " + bike.getEngine());
//		System.out.println("Wheels: " + bike.getWheels());
//		System.out.println("Seats: " + bike.getSeats());
//		System.out.println("Fuel_Tank: " + bike.getFuelTank());
//		System.out.println("Lights: " + bike.getLights());
		
		bike.run();
		
		Car car = new Car("Circle wheel","ANalog Music","10 AC","Yes","Samsung LED TV", "diesel", 2, 3, 25, "Yellow Bulb");
		car.run();
//		System.out.println();
//		System.out.println(car);
//		System.out.println();
//		System.out.println(car.getSteering());
	}

}
