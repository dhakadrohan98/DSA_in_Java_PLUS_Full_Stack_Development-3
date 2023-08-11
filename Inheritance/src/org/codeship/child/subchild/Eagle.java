package org.codeship.child.subchild;
import org.animal.child.Birds;

public class Eagle extends Birds {

	private String doesEagleWatch;

	public Eagle() {
		super();
		this.doesEagleWatch = "true";
	}

	public Eagle(String doesEagleWatch, boolean hasFeather, boolean canFly,
				float height, float weight, String animalType, String bloodType) {
		super(hasFeather,canFly,height, weight, animalType, bloodType);
		this.doesEagleWatch = doesEagleWatch;
	}

	@Override
	public String toString() {
		return "Eagle [doesEagleWatch=" + doesEagleWatch + ", isHasFeather()=" + isHasFeather() + ", isCanFly()="
				+ isCanFly() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	public void ShowInfo() {
		System.out.println("Inside Eagle Class");
		System.out.println();
		System.out.println(toString());
	}
	
	
}
