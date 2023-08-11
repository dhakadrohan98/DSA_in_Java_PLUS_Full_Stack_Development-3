package org.studyeasy;
import org.studyeasy.shop.*;

public class Shop {

	public static void main(String[] args) {
		
		Door door = new Door();
		door.shopStatus();
		//		System.out.println(door.getLock());
		System.out.println();
		
		door.getLock().setLock(false);
		door.shopStatus();
	}

}
