package org.animal.child;

import org.animal.parent.Animal;

public class Birds extends Animal {
	
	private boolean hasFeather;
	private boolean canFly;
	
	public Birds() {
		super();
		this.hasFeather = true;
		this.canFly = true;
	}

	public Birds(boolean hasFeather, boolean canFly,float height, float weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.hasFeather = hasFeather;
		this.canFly = canFly;
	}

	public boolean isHasFeather() {
		return hasFeather;
	}

	public boolean isCanFly() {
		return canFly;
	}
	
	
	
	
	
	
}
