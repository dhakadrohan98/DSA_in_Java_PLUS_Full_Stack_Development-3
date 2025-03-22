package org.codeship.model.response;

public class ItemResponse {
	
	private String brand;
	private String category;
	private int quantity;
	
	public ItemResponse(String brand, String category, int quantity) {
		super();
		this.brand = brand;
		this.category = category;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public String getCategory() {
		return category;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
