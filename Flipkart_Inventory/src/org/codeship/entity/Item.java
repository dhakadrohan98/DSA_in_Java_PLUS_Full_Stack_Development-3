package org.codeship.entity;

public class Item {
	
	private String category;
	private String brand;
	private Integer price;
	private Integer quantity;
	
	public Item(String category, String brand, Integer price, Integer quantity) {
		super();
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Integer getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [category=" + category + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
