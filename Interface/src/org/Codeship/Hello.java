package org.Codeship;
import codeship.phone.*;

public class Hello {

	public static void main(String[] args) {
		Phone phone = new OnePlus5();
		Phone iphone = new Iphone8();
		System.out.println("OnePlus5 Processor- " + phone.processor());
		System.out.println("OnePlus5 OS- " + phone.os());
		System.out.println("OnePlus5 Space- " + phone.spaceInGB());
		System.out.println();
		System.out.println("Iphone8 Processor- " + iphone.processor());
		System.out.println("Iphone8 OS- " + iphone.os());
		System.out.println("Iphone8 Space- " + iphone.spaceInGB());

	}

}
