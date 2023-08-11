package org.animal.child;

import org.animal.parent.Animal;

public class Reptile extends Animal {
	
	private boolean drySkin;
	private boolean backbone;
	private boolean softShelledEggs;
	
	
	
	public Reptile() {
		super();
		this.drySkin = false;
		this.backbone = true;
		this.softShelledEggs = true;
		
	}

	public Reptile(boolean drySkin, boolean backbone, boolean softShelledEggs, 
					float height, float weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.softShelledEggs = softShelledEggs;
	}

	public boolean isDrySkin() {
		return drySkin;
	}

	public boolean isBackbone() {
		return backbone;
	}

	public boolean isSoftShelledEggs() {
		return softShelledEggs;
	}

}
