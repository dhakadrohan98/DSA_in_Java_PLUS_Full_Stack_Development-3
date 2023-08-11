package org.codeship.child.subchild;

import org.animal.child.Reptile;

public class Crocodile extends Reptile {

	private boolean hardShelledEggs;
	
	public Crocodile() {
		super();
		this.hardShelledEggs = true;
	}
	
	public Crocodile(boolean hardShelledEggs, boolean drySkin, boolean backbone, boolean softShelledEggs, 
			float height, float weight, String animalType, String bloodType) {
		super(drySkin,backbone,softShelledEggs,height,weight,animalType,bloodType);
		this.hardShelledEggs = hardShelledEggs;
	}



	@Override
	public String toString() {
		return "Crocodile [hardShelledEggs=" + hardShelledEggs + ", isDrySkin()=" + isDrySkin() + ", isBackbone()="
				+ isBackbone() + ", isSoftShelledEggs()=" + isSoftShelledEggs() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}

	public void ShowInfo() {
		System.out.println("Crocodile class is running");
		System.out.println(toString());
	}
}
