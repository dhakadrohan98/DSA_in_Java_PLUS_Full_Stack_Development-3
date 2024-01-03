package org.codeship;

public class Subscriber implements Observer {
	
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	@Override
	public void notified(String title) {
		System.out.println("Hello Mr/Mrs/Ms m"+this.name+" new video=> "+title+" is uploaded:");
	}
}
