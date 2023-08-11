package com.codeship.vehicles;

import com.codeship.parent.Vehicle;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	
	
	public Car() {
		super();
		this.steering = "Square steering";
		this.musicSystem = "Digital music system";
		this.airConditioner = "5 Watt AC of Sonata";
		this.fridge = "No";
		this.entertainmentSystem = "Mi TV";
	}



	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,
			String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}



	@Override
	public String toString() {
		return "Car [steering=" + steering + ", musicSystem=" + musicSystem + ", airConditioner=" + airConditioner
				+ ", fridge=" + fridge + ", entertainmentSystem=" + entertainmentSystem + "]";
	}



	public String getSteering() {
		return steering;
	}



	public String getMusicSystem() {
		return musicSystem;
	}



	public String getAirConditioner() {
		return airConditioner;
	}



	public String getFridge() {
		return fridge;
	}



	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	
	
	
	
}
