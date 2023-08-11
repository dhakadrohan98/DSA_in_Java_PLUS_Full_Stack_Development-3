package org.animal.parent;

public class Animal {
	
	//Properties
	private float height;
	private float weight;
	private String animalType;
	private String bloodType;
	
	//Non-Parametrized constructor
	public Animal() {
		this.height = 4.2f;
		this.weight = 80.5f;
		this.animalType = "Reptile";
		this.bloodType = "Cold blooded";
	}
	
		// Parametrized constructor
	public Animal(float height, float weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	
	
	
	
}
