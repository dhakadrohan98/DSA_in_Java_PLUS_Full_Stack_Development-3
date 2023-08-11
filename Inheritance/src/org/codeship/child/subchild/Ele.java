package org.codeship.child.subchild;

import org.animal.child.*;

public class Ele extends Fish {

	private boolean releaseElectricCharge;

	public Ele() {
		super();
		this.releaseElectricCharge = true;
	}

	public Ele(boolean releaseElectricCharge, boolean doesLiveInWater, boolean hasGills,
				float height, float weight, String animalType, String bloodType) {
		super( doesLiveInWater, hasGills, height, weight, animalType, bloodType);
		this.releaseElectricCharge = releaseElectricCharge;
	}

	@Override
	public String toString() {
		return "Ele [releaseElectricCharge=" + releaseElectricCharge + ", isDoesLiveInWater()=" + isDoesLiveInWater()
				+ ", isHasGills()=" + isHasGills() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	public void ShowInfo() {
		System.out.println("Fish Class Running");
		System.out.println(toString());
	}
	
}
