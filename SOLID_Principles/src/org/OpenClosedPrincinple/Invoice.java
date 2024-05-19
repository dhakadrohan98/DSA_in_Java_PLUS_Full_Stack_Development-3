package org.OpenClosedPrincinple;

public class Invoice {
	private Marker marker;
	private int quantity;

	public Invoice(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public int calculateTotal() {
		int price = marker.price * this.quantity;
		return price;
	}

	public void printInvoice() {
		//print the invoice
	}
	
	public void saveToDB() {
		//save to db
	}
}
