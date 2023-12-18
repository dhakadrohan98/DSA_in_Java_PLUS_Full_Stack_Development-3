package org.codeship;

public class Main {

	public static void main(String[] args) {
		
		Subject channel = new YouTubeChannel();
		Observer aman = new Subscriber("Aman");
		Observer raman = new Subscriber("Raman");
		//passing aman as subscriber here in channel.subscribe(aman) method
		channel.subscribe(aman);
		channel.subscribe(raman);
		channel.newVideoUploaded("Design Patterns");
		channel.newVideoUploaded("SpringBoot crash course");

	}

}
