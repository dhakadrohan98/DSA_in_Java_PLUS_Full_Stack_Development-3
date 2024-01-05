package org.parent.child.relations;

public class ProcessorChild extends LaptopParent {
	
	@Override
	public void run() {
		System.out.println("child is running");
		super.run();
	}
	
	@Override
	public void walk() {
		System.out.println("child is walking");
		super.walk();
	}
	
}
