package org.parent.child.relations;

public class Processor extends Laptop {
	
	@Override
	public void run() {
		super.run();
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("child is walking");
	}
	
}
