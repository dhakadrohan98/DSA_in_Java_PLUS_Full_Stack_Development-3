package org.animal.child;

import org.animal.parent.Animal;

public class Fish extends Animal {
	
	private boolean doesLiveInWater;
	private boolean hasGills;
	
	public Fish() {
		super();
		this.doesLiveInWater = true;
		this.hasGills = true;
	}

	public Fish(boolean doesLiveInWater, boolean hasGills,float height, float weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.doesLiveInWater = doesLiveInWater;
		this.hasGills = hasGills;
	}

	public boolean isDoesLiveInWater() {
		return doesLiveInWater;
	}

	public boolean isHasGills() {
		return hasGills;
	}
	
	
	
}
