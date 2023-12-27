package org.codeship.oops;

public class SBI extends Bank {
	
	@Override
	public int getRateOfInterest() {
		return 8;
	}

	public static void main(String[] args) {
		Bank bank = new SBI();
		System.out.println(bank.getRateOfInterest());

	}

}
