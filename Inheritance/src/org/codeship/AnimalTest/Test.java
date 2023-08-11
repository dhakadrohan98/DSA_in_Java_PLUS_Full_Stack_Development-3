package org.codeship.AnimalTest;
import org.codeship.child.subchild.*;

public class Test {

	public static void main(String[] args) {
		// Reptile class 
		Crocodile crocodile = new Crocodile(false, true, false, false, 3.6f, 90.8f, "Not reptile", "Warm blooded");
		crocodile.ShowInfo();
		System.out.println();
		
		//Fish  class
//		Ele ele = new Ele(false,false,false, 3.6f, 90.9f, "Fish Reptile", "Warm Blooded");
//		ele.ShowInfo();
		
		//Birds class
//		Eagle eagle = new Eagle();
		Eagle eagle = new Eagle("false", false,false, 7.8f, 135.67f, "Birds", "Warm blooded");
		eagle.ShowInfo();
		
	}

}
