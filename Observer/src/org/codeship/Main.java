package org.codeship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Subject channel = new YouTubeChannel();
		Observer aman = new Subscriber("Aman");
		Observer raman = new Subscriber("Raman");
		//passing aman as subscriber here in channel.subscribe(aman) method
		channel.subscribe(aman);
		channel.subscribe(raman);
		channel.newVideoUploaded("Design Patterns");
		channel.newVideoUploaded("SpringBoot crash course");
//		channel.unsubscribe(raman);
		channel.newVideoUploaded("Top 100 DSA questions for interview");
		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("press 1 to upload video");
			System.out.println("press 2 to create new subscriber");
			System.out.println("Press 3 to exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//new video upload code
				System.out.println("Enter video title: ");
				String videoTitle = br.readLine();
				channel.newVideoUploaded(videoTitle);
			} else if(c==2) {
				//create new subscriber
				System.out.println("Enter name of subscriber: ");
				String subsName = br.readLine();
				Subscriber subscriber3 = new Subscriber(subsName);
				channel.subscribe(subscriber3);
			} else if(c==3) {
				//exit
				System.out.println("Thank you for using app");
				break;
			} else {
				//exit wrong input
				System.out.println("Wrong input");
			}
			
		}
		
	}
}
