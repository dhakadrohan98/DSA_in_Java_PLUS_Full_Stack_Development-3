package com.codeship;
import com.laptop.*;
import com.laptop.components.*;

public class Hello {

	public static void main(String[] args) {
		
//		Laptop lappy = new Laptop();
//		System.out.println(lappy.getProcessor().getCacheMemory());
		Processor processor = new Processor("intel","i5 7200u",7,4,2,"4MB","10.0Ghz","70.0Ghz","150.0Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvidea", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17, processor, "DDR4", "2TB", graphicsCard, null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("Gaming Mode on");
		System.out.println("Current Frequency: " + gamingLaptop.getProcessor().getFrequency());
	}

}
